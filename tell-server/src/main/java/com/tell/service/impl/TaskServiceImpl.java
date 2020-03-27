package com.tell.service.impl;

import com.sun.xml.internal.bind.v2.TODO;
import com.tell.mapper.TaskMapper;
import com.tell.model.Task;
import com.tell.service.TaskService;
import com.tell.util.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Date;
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
     * 根据昵称查询用户
     * @param id: 用户昵称
     * @return
     */
    @Override
    public Task findTaskById(Integer id) {
        return taskMapper.findTaskById(id);
    }



    @Override
    public void save(Task task) {
        this.taskMapper.insert(task);
    }

//    @Override
//    public Task create() {
//        Task task = new Task();
//        task.setTitle(title);
////        TODO 3.26
//       if(taskType==1){
//           task.setImg(img);
//       }
//        task.setCreateDate(new Date());
//        task.setUpdateDate(null);
//
//        this.save(task);
//        return task;
//    }
}
