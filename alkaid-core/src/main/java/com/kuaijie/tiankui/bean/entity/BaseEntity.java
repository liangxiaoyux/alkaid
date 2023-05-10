package com.kuaijie.tiankui.bean.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedBy;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 梁潇宇
 * @version 1.0
 * @project alkaid-core
 * @date 2023/3/11 16:11:27
 */
@MappedSuperclass
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_time", columnDefinition = "DATETIME COMMENT '创建时间/注册时间'", updatable = false)
    private Date createTime;
    @Column(name = "create_by", columnDefinition = "BIGINT COMMENT '创建人'", updatable = false)
    @CreatedBy
    private Long createBy;
    @UpdateTimestamp
    @Column(name = "modify_time", columnDefinition = "DATETIME COMMENT '最后更新时间'")
    private Date modifyTime;
    @LastModifiedBy
    @Column(name = "modify_by", columnDefinition = "BIGINT COMMENT '最后更新人'")
    private int modifyBy;
}
