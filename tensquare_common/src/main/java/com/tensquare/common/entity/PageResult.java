package com.tensquare.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @DESC: 分页结果类
 * @author: zhouben
 * @date: 2020/4/23 0023 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    private Long total;
    private List<T> rows;

}
