package com.tensquare.recruit.controller;

import com.tensquare.common.entity.Result;
import com.tensquare.common.entity.StatusCode;
import com.tensquare.recruit.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/4/23 0023 21:08
 */
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    /**
     * 查询热门企业
     * @return
     */
    @GetMapping("/search/hotlist")
    public Result hotlist() {
        return new Result(true, StatusCode.OK, "查询成功",
                enterpriseService.hotlist());
    }
}
