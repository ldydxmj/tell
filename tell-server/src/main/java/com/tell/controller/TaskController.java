package com.tell.controller;

import com.tell.bean.Page;
import com.tell.bean.Result;
import com.tell.conf.properties.SiteConfig;
import com.tell.exception.ApiAssert;
import com.tell.model.Article;
import com.tell.model.Task;
import com.tell.model.User;
import com.tell.service.TaskService;
import com.tell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author: miansen
 * @Date: 2018/12/2 23:28
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;




    /**
     * 新增文章
     * @param task
     * @return
     */
    @PostMapping(value = "/task")
    public Result save(@RequestBody Task task){
        ApiAssert.notNull(task,"对象为空");
        task.setCreateDate(new Date());
         taskService.save(task);
        return Result.success(task);
    }


}
