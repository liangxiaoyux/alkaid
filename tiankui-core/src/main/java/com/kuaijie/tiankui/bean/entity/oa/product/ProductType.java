package com.kuaijie.tiankui.bean.entity.oa.product;

import com.kuaijie.tiankui.bean.entity.BaseEntity;


import javax.persistence.Entity;
import org.hibernate.annotations.Table;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/12 0:50
 * @description
 */
@Entity(name = "t_product_type")
@Table(appliesTo = "t_product_type", comment = "产品类型")
public class ProductType extends BaseEntity {

}
