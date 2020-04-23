package com.tensquare.recruit.controller;

import com.tensquare.common.entity.Result;
import com.tensquare.common.entity.StatusCode;
import com.tensquare.recruit.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESC: 职位controller
 * @author: zhouben
 * @date: 2020/4/23 0023 21:58
 */
@RestController
@RequestMapping("/recruit")
public class RecruitController {

    @Autowired
    RecruitService recruitService;

    /**
     * 根据状态查询
     * @return
     */
    @GetMapping("/search/recommend")
    public Result recommend() {
        return new Result(true, StatusCode.OK, "查询成功",
                recruitService.findTop4ByStateOrderByCreatetimeDesc("2"));
    }
}
