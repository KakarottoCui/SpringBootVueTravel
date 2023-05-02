package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店预定：(HotelReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelReservation")
public class HotelReservation implements Serializable {

    //HotelReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_reservation_id")
    private Integer hotel_reservation_id;
    // 酒店编号
    @Basic
    private String hotel_number;
    // 酒店名称
    @Basic
    private String hotel_name;
    // 酒店星级
    @Basic
    private String hotel_star;
    // 酒店位置
    @Basic
    private String hotel_location;
    // 预定电话
    @Basic
    private String reservation_telephone;
    // 房间价格
    @Basic
    private String room_price;
    // 预定数
    @Basic
    private Integer scheduled_number;
    // 用户
    @Basic
    private Integer user;
    // 预定时间
    @Basic
    private Timestamp scheduled_time;
    // 合计费用
    @Basic
    private String total_cost;
    // 订单状态
    @Basic
    private String order_status;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
