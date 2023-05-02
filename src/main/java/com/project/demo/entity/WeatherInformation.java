package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *天气信息：(WeatherInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "WeatherInformation")
public class WeatherInformation implements Serializable {

    //WeatherInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weather_information_id")
    private Integer weather_information_id;
    // 地区
    @Basic
    private String region;
    // 天气状态
    @Basic
    private String weather_state;
    // 推荐景点
    @Basic
    private String recommended_attractions;
    // 注意事项
    @Basic
    private String matters_needing_attention;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
