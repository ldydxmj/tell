package com.tell.service;

import com.tell.bean.Page;
import com.tell.model.Article;
import com.tell.model.Task;
import com.tell.model.Theme;

import java.util.List;

/**
 * @Author: miansen
 * @Date: 2018/12/2 23:21
 */

public interface TaskService {

    /**
     * 根据id查找任务
     * @param id
     * @return
     */
    Task findTaskById(Integer id);
    /**
     * 更新任务
     * @param task
     */
    void update(Task task);

    /**
     * 保存
     * @param task
     */
    void save(Task task);

    /**
     * 查找所有任务
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Task> findAll(Integer pageNo, Integer pageSize);

    /**
     * 查找所有任务page
     * @param pageNo
     * @param pageSize
     * @return
     */
    Page<Task> page(Integer pageNo, Integer pageSize);
//    Task create(String username, String password, String email);
}
