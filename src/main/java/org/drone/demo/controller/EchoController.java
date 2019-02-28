package org.drone.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者： lzw<br/>
 * 创建时间：2019-02-28 17:22 <br/>
 */
@Api(description = "echo")
@RestController
public class EchoController {
    @ApiOperation("echo")
    @GetMapping("/echo")
    public String echo(@RequestParam String str) {
        return str;
    }
}
