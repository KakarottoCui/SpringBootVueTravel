package com.project.demo.dao;

import java.util.List;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.ForumType;

/**
 * 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。Mapper接口
 *
 */
public interface ForumTypeMapper extends BaseMapper<ForumType>
{
    /**
     * 查询论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     *
     * @param typeId 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。ID
     * @return 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     */
    ForumType selectForumTypeById(Integer typeId);

    /**
     * 查询论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。列表
     *
     * @param forumType 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     * @return 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。集合
     */
    List<ForumType> selectForumTypeList(ForumType forumType);

    /**
     * 新增论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     *
     * @param forumType 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     * @return 结果
     */
    int insertForumType(ForumType forumType);

    /**
     * 修改论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     *
     * @param forumType 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     * @return 结果
     */
    int updateForumType(ForumType forumType);

    /**
     * 删除论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     *
     * @param typeId 论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。ID
     * @return 结果
     */
    int deleteForumTypeById(Integer typeId);

    /**
     * 批量删除论坛频道：用于汇总浏览论坛，在不同频道下展示不同论坛。
     *
     * @param typeIds 需要删除的数据ID
     * @return 结果
     */
    int deleteForumTypeByIds(Integer[] typeIds);
}
