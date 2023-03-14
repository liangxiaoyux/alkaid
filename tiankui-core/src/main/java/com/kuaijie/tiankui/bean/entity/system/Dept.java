package com.kuaijie.tiankui.bean.entity.system;

import com.kuaijie.tiankui.bean.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;


@Entity(name = "t_sys_dept")
@Table(appliesTo = "t_sys_dept", comment = "部门")
public class Dept extends BaseEntity {
}