package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店信息：(HotelInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelInformation")
public class HotelInformation implements Serializable {

    //HotelInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_information_id")
    private Integer hotel_information_id;
    // 酒店编号
    @Basic
    private String hotel_number;
    // 酒店名称
    @Basic
    private String hotel_name;
    // 酒店星级
    @Basic
    private String hotel_star;
    // 酒店封面
    @Basic
    private String hotel_cover;
    // 酒店位置
    @Basic
    private String hotel_location;
    // 预定电话
    @Basic
    private String reservation_telephone;
    // 房间数
    @Basic
    private Integer number_of_rooms;
    // 房间价格
    @Basic
    private String room_price;
    // 评分
    @Basic
    private Integer score;
    // 酒店详情
    @Basic
    private String hotel_details;
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
