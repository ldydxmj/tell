package com.tell.mapper;

import com.tell.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: miansen
 * @Date: 2018/12/5 19:04
 */
@Mapper
public interface TaskMapper {

    /**
     * 根据id查询任务
     * @param id
     * @return
     */
    Task findTaskById(@Param("id") Integer id);

    /**
     * 查找所有的任务
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Task> findAll(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize);

    /**
     * 插入任务
     * @param task
     * @return
     */
    int insert(Task task);
    /**
     * 更新任务
     * @param task
     * @return
     */
    int updateByPrimaryKey(Task task);
}
