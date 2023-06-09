package com.kuaijie.tiankui.bean.entity.oa.production;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;


/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/14 23:29
 * @description 生产项目
 */
@Entity(name = "t_production_proj")
@Table(appliesTo = "t_production_proj", comment = "生产项目")
@Data
public class ProductionProject extends BaseEntity {

}
