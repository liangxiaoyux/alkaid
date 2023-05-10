package com.kuaijie.tiankui.bean.entity.oa.production;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/15 0:05
 * @description
 */
@Entity(name = "t_production_proj_state")
@Table(appliesTo = "t_production_proj_state",comment = "生产项目状态")
@Data
public class ProductionProjectState extends BaseEntity {
}
