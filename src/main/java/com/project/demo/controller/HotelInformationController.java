package com.project.demo.controller;

import com.project.demo.entity.HotelInformation;
import com.project.demo.service.HotelInformationService;
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
 *酒店信息：(HotelInformation)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_information")
public class HotelInformationController extends BaseController<HotelInformation,HotelInformationService> {

    /**
     *酒店信息对象
     */
    @Autowired
    public HotelInformationController(HotelInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maphotel_number = new HashMap<>();
        maphotel_number.put("hotel_number",String.valueOf(paramMap.get("hotel_number")));
        List listhotel_number = service.select(maphotel_number, new HashMap<>()).getResultList();
        if (listhotel_number.size()>0){
            return error(30000, "字段酒店编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
