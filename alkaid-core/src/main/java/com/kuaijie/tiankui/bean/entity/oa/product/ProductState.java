package com.kuaijie.tiankui.bean.entity.oa.product;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import javax.persistence.Entity;
import org.hibernate.annotations.Table;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/12 0:55
 * @description
 */
@Entity(name = "t_product_state")
@Table(appliesTo = "t_product_state", comment = "项目状态")
public class ProductState extends BaseEntity {
}
