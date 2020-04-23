package com.tensquare.recruit.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @DESC: 职位实体类
 * @author: zhouben
 * @date: 2020/4/23 0023 21:30
 */
@Entity
@Table(name = "tb_recruit")
@Data
public class Recruit {

    @Id
    private String id;
    private String jobname; //职位名称
    private String salary; //薪资范围
    private String condition; //经验要求
    private String education; //学历要求
    private String type; //任职方式
    private String address; //办公地址
    private String eid; //企业id
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime; //创建时间
    private String state; //状态
    private String url; //网址
    private String label; // 标签
    private String content1; //职位描述
    private String content2;//职位要求

}
