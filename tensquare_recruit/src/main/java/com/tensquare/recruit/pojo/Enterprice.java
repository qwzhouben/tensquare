package com.tensquare.recruit.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 企业实体类
 */
@Entity
@Table(name = "tb_enterprise")
@Data
public class Enterprice {
    @Id
    private String id;//
    private String name;//企业名称
    private String summary;//企业简介
    private String labels;//标签列表
    private String coordinate;//坐标
    private String hot;//是否热门
    private String logo;
    private Long jobcount;//职位数
    private String url;
}