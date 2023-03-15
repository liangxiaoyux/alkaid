package com.kuaijie.tiankui.api.controller.system;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/12 2:51
 * @description
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理接口")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation("列出所有的用户")
    @GetMapping("/all")
    public List<Map<String, Object>> userList() {
        String sql = "select * from t_sys_user";
        //queryForList()方法放入指定查询sql语句即可查询
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }



}
