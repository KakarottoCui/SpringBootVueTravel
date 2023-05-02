package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *景点信息：(ScenicSpotInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScenicSpotInformation")
public class ScenicSpotInformation implements Serializable {

    //ScenicSpotInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scenic_spot_information_id")
    private Integer scenic_spot_information_id;
    // 景点编号
    @Basic
    private String attraction_number;
    // 景点名称
    @Basic
    private String name_of_scenic_spot;
    // 景点封面
    @Basic
    private String scenic_spot_cover;
    // 营业时间
    @Basic
    private String business_hours;
    // 景点地址
    @Basic
    private String scenic_spot_address;
    // 地区
    @Basic
    private String region;
    // 门票价格
    @Basic
    private String ticket_price;
    // 门票数
    @Basic
    private Integer number_of_tickets;
    // 评分
    @Basic
    private Integer score;
    // 景点详情
    @Basic
    private String scenic_spot_details;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
