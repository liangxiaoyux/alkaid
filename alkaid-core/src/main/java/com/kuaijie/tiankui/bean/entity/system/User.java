package com.kuaijie.tiankui.bean.entity.system;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import java.util.Date;


/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/11 23:40
 * @description 用户类
 */
@Entity(name = "t_sys_user")
@Table(appliesTo = "t_sys_user",comment = "用户表")
@Data
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {
    @Column(columnDefinition = "varchar(64) comment '头像'")
    private String avatar;
    @Column(columnDefinition = "varchar(32) comment '账户'")
    private String account;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '密码'")
    private String password;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '密码盐'")
    private String salt;
    @Column(columnDefinition = "VARCHAR(32) COMMENT '姓名'")
    private String name;
    @Column(columnDefinition = "DATE COMMENT '生日'")
    private Date birthday;
    @Column(columnDefinition = "INT COMMENT '性别:1:男,2:女'")
    private Integer sex;
    @Column(columnDefinition = "VARCHAR(64) COMMENT '电子邮箱'")
    private String email;
    @Column(columnDefinition = "VARCHAR(16) COMMENT '手机号'")
    private String phone;
    @Column(name = "role_id",columnDefinition = "VARCHAR(128) COMMENT '角色id列表，以逗号分隔'")
    private String roleId;
    @Column(columnDefinition = "BIGINT COMMENT '部门id'")
    private Long departmentId;
    @Column(columnDefinition = "INT COMMENT '状态 1:启用 2:禁用' ")
    private Integer status;
    @Column(name = "is_delete", columnDefinition = "INT COMMENT '是否删除 1:是 0:不是'")
    private Integer isDelete;
    @Column(columnDefinition = "INT COMMENT '版本'")
    private Integer version;
    /*
    @JoinColumn(name = "department_id", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    @ManyToOne(fetch = FetchType.EAGER)
    private Department department;
    */
}
