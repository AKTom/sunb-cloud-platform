package com.sunb.platform.user.center.api;

import com.sunb.platform.user.center.Constants;
import com.sunb.platform.user.center.entity.ModuleEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = Constants.MODEL_SERVICE, path = "module")
public interface ModuleApi {

    @RequestMapping(value = "list", method = RequestMethod.POST)
    List<ModuleEntity> query();
}
