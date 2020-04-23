package com.tensquare.recruit.service;

import com.tensquare.recruit.dao.EnterpriseDao;
import com.tensquare.recruit.pojo.Enterprice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/4/23 0023 21:10
 */
@Service
public class EnterpriseService {

    @Autowired
    EnterpriseDao enterpriseDao;

    /**
     * 查询热门企业
     * @return
     */
    public List<Enterprice> hotlist() {
        return enterpriseDao.findByHot("1");
    }
}
