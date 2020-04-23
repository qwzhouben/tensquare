package com.tensquare.recruit.dao;

import com.tensquare.recruit.pojo.Enterprice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/4/23 0023 21:11
 */
public interface EnterpriseDao extends JpaRepository<Enterprice, String> {

    /**
     * 根据热门状态查询企业
     * @param hot
     * @return
     */
    List<Enterprice> findByHot(String hot);
}
