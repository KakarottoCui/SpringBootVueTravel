package com.project.demo.entity;


import java.sql.Timestamp;
import java.io.Serializable;

import lombok.*;

import javax.persistence.*;


/**
 * 论坛：(Forum)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@Setter
@Getter
@Entity
public class Forum implements Serializable {

    private static final long serialVersionUID = -88817457497416984L;

    /**
     * 论坛id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forum_id")
    private Integer forumId;

    /**
     * 排序
     */

    @Basic
    @Column(name = "display")
    private Integer display;

    /**
     * 用户ID
     */

    @Basic
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 昵称：[0,16]
     */

    @Basic
    @Column(name = "nickname")
    private String nickname;


    /**
     * 点赞数
     */

    @Basic
    @Column(name = "praise_len")
    private Integer praise_len;

    /**
     * 访问数
     */

    @Basic
    @Column(name = "hits")
    private Integer hits;

    /**
     * 标题
     */

    @Basic
    @Column(name = "title")
    private String title;

    /**
     * 关键词
     */

    @Basic
    @Column(name = "keywords")
    private String keywords;

    /**
     * 描述
     */

    @Basic
    @Column(name = "description")
    private String description;

    /**
     * 来源地址
     */

    @Basic
    @Column(name = "url")
    private String url;

    /**
     * 标签
     */

    @Basic
    @Column(name = "tag")
    private String tag;

    /**
     * 封面图
     */

    @Basic
    @Column(name = "img")
    private String img;

    /**
     * 正文
     */

    @Basic
    @Column(name = "content")
    private String content;

    /**
     * 创建时间：
     */

    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    /**
     * 发帖人头像：
     */

    @Basic
    @Column(name = "avatar")
    private String avatar;

    /**
     * 论坛分类：[0,1000]用来搜索指定类型的论坛帖
     */

    @Basic
    @Column(name = "type")
    private String type;

}

