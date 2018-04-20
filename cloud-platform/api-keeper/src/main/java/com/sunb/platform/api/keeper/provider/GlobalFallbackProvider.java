package com.sunb.platform.api.keeper.provider;

import com.alibaba.fastjson.JSON;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import com.netflix.zuul.context.RequestContext;
import com.sunb.cloud.platform.base.core.api.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Description: 全局网关FallbackProvider
 */
public class GlobalFallbackProvider implements FallbackProvider {

    private static Logger logger = LoggerFactory.getLogger(GlobalFallbackProvider.class);

    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(Throwable cause) {
        if (cause instanceof HystrixTimeoutException) {
            return response(HttpStatus.GATEWAY_TIMEOUT);
        } else {
            return this.fallbackResponse();
        }
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return this.response(HttpStatus.SERVICE_UNAVAILABLE);
    }

    private ClientHttpResponse response(final HttpStatus status) {

        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return status;
            }
            @Override
            public int getRawStatusCode() throws IOException {
                return status.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return status.getReasonPhrase();
            }

            @Override
            public void close() {
            }

            @Override
            public InputStream getBody() throws IOException {

                ApiResponse resp = new ApiResponse();
                resp.setCode(status.value());
                RequestContext context = RequestContext.getCurrentContext();
                resp.setMessage("Cloud " + status.getReasonPhrase() + " Temporarily");

                String serverId = context.get(FilterConstants.SERVICE_ID_KEY).toString();
                logger.error("Cloud service [{}] unavailable temporarily.", serverId);

                return new ByteArrayInputStream(JSON.toJSONString(resp).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return headers;
            }
        };
    }

}
