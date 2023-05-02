package com.project.demo.controller;

import com.project.demo.entity.HotelReservation;
import com.project.demo.service.HotelReservationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *酒店预定：(HotelReservation)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_reservation")
public class HotelReservationController extends BaseController<HotelReservation,HotelReservationService> {

    /**
     *酒店预定对象
     */
    @Autowired
    public HotelReservationController(HotelReservationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(hotel_reservation_id) AS max FROM "+"hotel_reservation";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = ("SELECT count(*) count FROM `hotel_information` INNER JOIN `hotel_reservation` ON hotel_information.hotel_number=hotel_reservation.hotel_number WHERE hotel_information.number_of_rooms &#60; hotel_reservation.scheduled_number AND hotel_reservation.hotel_reservation_id="+max).replaceAll("&#60;","<");
        select = service.runCountSql(sql);
        Integer count = Integer.valueOf(String.valueOf(select.getSingleResult()));
        if(count>0){
            sql = "delete from "+"hotel_reservation"+" WHERE "+"hotel_reservation_id"+" ="+max;
            select = service.runCountSql(sql);
            select.executeUpdate();
            return error(30000,"房间不足!");
        }
        sql = "UPDATE `hotel_information` INNER JOIN `hotel_reservation` ON hotel_information.hotel_number=hotel_reservation.hotel_number SET hotel_information.number_of_rooms = hotel_information.number_of_rooms - hotel_reservation.scheduled_number WHERE hotel_reservation.hotel_reservation_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
