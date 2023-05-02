package com.project.demo.controller;

import com.project.demo.entity.ScenicSpotInformation;
import com.project.demo.service.ScenicSpotInformationService;
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
 *景点信息：(ScenicSpotInformation)表控制层
 *
 */
@RestController
@RequestMapping("/scenic_spot_information")
public class ScenicSpotInformationController extends BaseController<ScenicSpotInformation,ScenicSpotInformationService> {

    /**
     *景点信息对象
     */
    @Autowired
    public ScenicSpotInformationController(ScenicSpotInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapattraction_number = new HashMap<>();
        mapattraction_number.put("attraction_number",String.valueOf(paramMap.get("attraction_number")));
        List listattraction_number = service.select(mapattraction_number, new HashMap<>()).getResultList();
        if (listattraction_number.size()>0){
            return error(30000, "字段景点编号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
