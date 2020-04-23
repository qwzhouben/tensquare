package com.tensquare.recruit.dao;

import com.tensquare.recruit.pojo.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @DESC:
 * @AUTHOR: zhouben
 * @DATE: 2020/4/23 0023 22:02
 */
public interface RecruitDao extends JpaRepository<Recruit, String> {

    /**
     * 查询最新职业（按创建日期降序排列）
     * @param state
     * @return
     */
    List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);
}
