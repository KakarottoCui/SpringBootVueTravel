package com.project.demo.controller;

import com.project.demo.entity.TicketReservation;
import com.project.demo.service.TicketReservationService;
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
 *门票预定：(TicketReservation)表控制层
 *
 */
@RestController
@RequestMapping("/ticket_reservation")
public class TicketReservationController extends BaseController<TicketReservation,TicketReservationService> {

    /**
     *门票预定对象
     */
    @Autowired
    public TicketReservationController(TicketReservationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(ticket_reservation_id) AS max FROM "+"ticket_reservation";
        Query select = service.runCountSql(sql);
        Integer max = (Integer) select.getSingleResult();
        sql = ("SELECT count(*) count FROM `scenic_spot_information` INNER JOIN `ticket_reservation` ON scenic_spot_information.attraction_number=ticket_reservation.attraction_number WHERE scenic_spot_information.number_of_tickets &#60; ticket_reservation.scheduled_number AND ticket_reservation.ticket_reservation_id="+max).replaceAll("&#60;","<");
        select = service.runCountSql(sql);
        Integer count = Integer.valueOf(String.valueOf(select.getSingleResult()));
        if(count>0){
            sql = "delete from "+"ticket_reservation"+" WHERE "+"ticket_reservation_id"+" ="+max;
            select = service.runCountSql(sql);
            select.executeUpdate();
            return error(30000,"门票不足!");
        }
        sql = "UPDATE `scenic_spot_information` INNER JOIN `ticket_reservation` ON scenic_spot_information.attraction_number=ticket_reservation.attraction_number SET scenic_spot_information.number_of_tickets = scenic_spot_information.number_of_tickets - ticket_reservation.scheduled_number WHERE ticket_reservation.ticket_reservation_id="+max;
        select = service.runCountSql(sql);
        select.executeUpdate();
        return success(1);
    }

}
