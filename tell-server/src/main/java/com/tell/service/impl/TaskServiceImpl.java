package com.tell.service.impl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tell.bean.Page;
import com.tell.mapper.TaskMapper;
import com.tell.model.Task;
import com.tell.service.TaskService;
import com.tell.util.TaskTypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: miansen
 * @Date: 2018/12/2 23:22
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    /**
     * 根据id查询用户
     * @param id: 用户昵称
     * @return
     */
    @Override
    public Task findTaskById(Integer id) {
        return taskMapper.findTaskById(id);
    }


    /**
     * 添加任务
     * @param task
     */
    @Override
    public void save(Task task) {
//        System.out.println("ok");

        this.taskMapper.insert(task);
    }

    /**
     * 更新任务
     * @param task
     */
    @Override
    public void update(Task task) {
        taskMapper.updateByPrimaryKey(task);
    }

    /**
     * 查找所有任务
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public List<Task> findAll(Integer pageNo, Integer pageSize) {
        return taskMapper.findAll(pageNo,pageSize);
    }

    /**
     * 查找所有任务page形式
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public Page<Task> page(Integer pageNo, Integer pageSize) {
        List<Task> list = taskMapper.findAll((pageNo - 1) * pageSize, pageSize);

        int count = taskMapper.countTask();
        Page page= new Page<>(pageNo,pageSize,count,list);
        return page;
    }


}
