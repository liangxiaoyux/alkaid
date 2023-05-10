package com.kuaijie.tiankui.bean.entity.system;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/13 23:48
 * @description
 */
@Entity(name = "t_sys_rule")
@Table(name = "t_sys_rule" )
@Data
public class Rule extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;

}
