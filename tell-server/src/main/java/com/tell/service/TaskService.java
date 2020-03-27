package com.tell.service;

import com.tell.model.Task;

import java.util.List;

/**
 * @Author: miansen
 * @Date: 2018/12/2 23:21
 */

public interface TaskService {

    /**
     * 根据昵称查询用户
     * @param id
     * @return
     */
    Task findTaskById(Integer id);

    void save(Task task);

//    Task create(String username, String password, String email);
}
