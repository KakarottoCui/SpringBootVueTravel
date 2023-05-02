package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Forum;

/**
 * 论坛：Mapper接口
 *
 */
interface ForumMapper extends BaseMapper<Forum>
{
    /**
     * 查询论坛：
     *
     * @param forumId 论坛：ID
     * @return 论坛：
     */
    Forum selectForumById(Integer forumId);

    /**
     * 查询论坛：列表
     *
     * @param forum 论坛：
     * @return 论坛：集合
     */
    List<Forum> selectForumList(Forum forum);

    /**
     * 新增论坛：
     *
     * @param forum 论坛：
     * @return 结果
     */
    int insertForum(Forum forum);

    /**
     * 修改论坛：
     *
     * @param forum 论坛：
     * @return 结果
     */
    int updateForum(Forum forum);

    /**
     * 删除论坛：
     *
     * @param forumId 论坛：ID
     * @return 结果
     */
    int deleteForumById(Integer forumId);

    /**
     * 批量删除论坛：
     *
     * @param forumIds 需要删除的数据ID
     * @return 结果
     */
    int deleteForumByIds(Integer[] forumIds);
}
