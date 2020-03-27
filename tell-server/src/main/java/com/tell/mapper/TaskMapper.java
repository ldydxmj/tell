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
     * 根据用户昵称查询用户
     * @param id
     * @return
     */
    Task findTaskById(@Param("id") Integer id);


    int insert(Task user);

}
