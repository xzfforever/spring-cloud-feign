package com.xzf.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 不适用Eureka，独立使用Feign调用远程服务
 *
 */
@FeignClient(name="user-center",url="http://localhost:8888")
public interface FeignClientAlone {

    @GetMapping(value = "/user/{id}")
    public String getUserInfoById(@PathVariable(value="id") String userId);

}
