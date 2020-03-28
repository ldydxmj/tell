package com.tell.controller;

import com.tell.bean.Page;
import com.tell.bean.Result;
import com.tell.exception.ApiAssert;
import com.tell.model.Task;
import com.tell.service.TaskService;
import com.tell.util.TaskTypeUtil;
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
     * 新增任务
     * @param task
     * @return
     */
    @PostMapping(value = "/task")
    public Result save(@RequestBody Task task){
        ApiAssert.notNull(task,"对象为空");
        handleGoOn(task);
        task.setCreateDate(new Date());
         taskService.save(task);
        return Result.success(task);
    }


    /**
     * 更新任务
     * @param task
     * @return
     */
    @PostMapping(value = "/updateTask")
    public Result update(@RequestBody Task task){

        ApiAssert.notNull(task.getTaskId(),"任务不存在");
        handleGoOn(task);
        task.setUpdateDate(new Date());

       taskService.update( task);

        return Result.success(task);
    }

    /**
     * 获取任务列表
     * @return
     */
    @GetMapping(value = "/task-list")
    public Result getList(){
        List<Task> list = taskService.findAll(0, 5);
        return Result.success(list);
    }

    /**
     * 获取任务列表-page形式
     * @param pageNo
     * @return
     */
    @GetMapping(value = "/task-page")
    public Result articles(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,@RequestParam(value = "pageSize",defaultValue = "11") Integer pageSize){
        Page<Task> page = taskService.page(pageNo, pageSize);
        return Result.success( page);
    }

    /**
     * 校验参数
     * @param task
     */
    private  void handleGoOn(Task task){

        ApiAssert.notEmpty(task.getTitle(),"标题是必须的");
        if(task.getTaskType()== TaskTypeUtil.TASK_TYPE_IMG){
            ApiAssert.notEmpty(task.getImg(),"图片是必须的");
        }

        if(task.getTaskType()== TaskTypeUtil.TASK_TYPE_LINK){
            ApiAssert.notEmpty(task.getLinkAddress(),"链接是必须的");
        }

        if(task.getTaskType()== TaskTypeUtil.TASK_TYPE_VIDEO){
            ApiAssert.notEmpty(task.getVideoAddress(),"视频链接是必须的");
        }

    }

}
