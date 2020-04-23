package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import com.tensquare.common.entity.Result;
import com.tensquare.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @DESC: 标签控制层
 * @author: zhouben
 * @date: 2020/4/23 0023 17:53
 */
@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    LabelService labelService;

    /**
     * 查询全部列表
     * @return
     */
    @GetMapping
    public Result<List<Label>> findAll() {
        return new Result<>(true, StatusCode.OK, "查询成功",
                labelService.findAll());
    }

    /**
     * 根据ID查询标签
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Label> findById(@PathVariable("id") String id) {
        return new Result<>(true, StatusCode.OK, "查询成功",
                labelService.findById(id));
    }

    /**
     * 添加标签
     * @param label
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return new Result(true,StatusCode.OK,"增加成功");
    }

    /**
     * 修改标签
     * @param label
     * @return
     */
    @RequestMapping(value="/{id}" ,method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /**
     * 删除标签
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}" ,method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
