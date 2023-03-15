package com.kuaijie.tiankui.bean.entity.oa.customer;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name = "t_customer")
@Table(appliesTo = "t_customer", comment = "客户表")
@Data
public class CustomerEntity extends BaseEntity {
    @Column(name = "customer_name", columnDefinition = "VARCHAR(64) COMMENT '客户名称'")
    private String customerName;
    @Column(name = "description", columnDefinition = "VARCHAR(128) COMMENT '描述'")
    private String descruption;
    @Column(name = "phone_number", columnDefinition = "VARCHAR(16) COMMENT '客户手机号'")
    private String phoneNumber;
    @Column(name = "is_delete", columnDefinition = "INT COMMENT '状态1:未删除,2:已删除'")
    private Integer isDelete;
    @Column(columnDefinition = "INT COMMENT '状态1:启用,2:禁用'")
    private Integer status;

}