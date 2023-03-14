package com.kuaijie.tiankui.bean.entity.oa.product;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/11 23:39
 * @description
 */
@Entity(name = "t_product")
@Table(appliesTo = "t_product", comment = "产品表")
@Data
public class ProductEntity extends BaseEntity {
    @Column(name = "product_id", columnDefinition = "VARCHAR(128) COMMENT '产品编码'")
    private String productId;
    @Column(name = "name", columnDefinition = "VARCHAR(128) COMMENT '产品名称'")
    private String name;
    @Column(name = "description", columnDefinition = "VARCHAR(128) COMMENT '产品描述'")
    private String description;
    @Column(name = "type_id", columnDefinition = "INT COMMENT '产品类型id'")
    private Integer typeId;
    @Column(name = "state_id", columnDefinition = "INT COMMENT '产品状态id'")
    private Integer stateId;
    @Column(name = "customer_id", columnDefinition = "INT COMMENT '客户id'")
    private Integer customerId;


}
