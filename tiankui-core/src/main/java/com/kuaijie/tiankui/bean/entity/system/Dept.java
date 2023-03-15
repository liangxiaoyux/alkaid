package com.kuaijie.tiankui.bean.entity.system;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity(name = "t_sys_dept")
@Table(appliesTo = "t_sys_dept", comment = "部门")
@Data
public class Dept extends BaseEntity {
    @NotBlank(message = "部门全称不能为空")
    @Column(name = "full_name", columnDefinition = "VARCHAR(64) COMMENT '部门/组织全称'")
    private String fullName;
    @NotBlank(message = "部门简称不能为空")
    @Column(name = "simple_name", columnDefinition = "VARCHAR(32) COMMENT '部门/组织简称'")
    private String simpleName;
    @Column(name = "description", columnDefinition = "VARCHAR(128) COMMENT '描述'")
    private String description;
    @Column(name = "parent_id", columnDefinition = "INT COMMENT '父部门id'")
    private Integer pid;
    @Column(name = "parent_ids", columnDefinition = "INT COMMENT '所有上级组织id列表'")
    private Integer pids;
    @Column(name = "short", columnDefinition = "INT COMMENT '排序id'")
    private Integer shortId;

}