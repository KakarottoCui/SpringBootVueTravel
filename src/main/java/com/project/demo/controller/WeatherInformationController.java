package com.project.demo.controller;

import com.project.demo.entity.WeatherInformation;
import com.project.demo.service.WeatherInformationService;
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
 *天气信息：(WeatherInformation)表控制层
 *
 */
@RestController
@RequestMapping("/weather_information")
public class WeatherInformationController extends BaseController<WeatherInformation,WeatherInformationService> {

    /**
     *天气信息对象
     */
    @Autowired
    public WeatherInformationController(WeatherInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
