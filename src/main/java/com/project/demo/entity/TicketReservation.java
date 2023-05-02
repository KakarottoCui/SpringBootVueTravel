package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *门票预定：(TicketReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TicketReservation")
public class TicketReservation implements Serializable {

    //TicketReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_reservation_id")
    private Integer ticket_reservation_id;
    // 景点编号
    @Basic
    private String attraction_number;
    // 景点名称
    @Basic
    private String name_of_scenic_spot;
    // 营业时间
    @Basic
    private String business_hours;
    // 景点地址
    @Basic
    private String scenic_spot_address;
    // 门票价格
    @Basic
    private String ticket_price;
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
