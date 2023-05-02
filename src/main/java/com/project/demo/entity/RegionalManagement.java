package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *地区管理：(RegionalManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RegionalManagement")
public class RegionalManagement implements Serializable {

    //RegionalManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regional_management_id")
    private Integer regional_management_id;
    // 地区
    @Basic
    private String region;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
