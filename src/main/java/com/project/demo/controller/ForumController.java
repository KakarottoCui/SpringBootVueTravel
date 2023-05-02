package com.project.demo.controller;

import com.project.demo.entity.Forum;
import com.project.demo.service.ForumService;

import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * 论坛：(Forum)表控制层
 *
 */
@RestController
@RequestMapping("forum")
public class ForumController extends BaseController<Forum, ForumService> {
    /**
     * 服务对象
     */
    @Autowired
    public ForumController(ForumService service) {
        setService(service);
    }

}


