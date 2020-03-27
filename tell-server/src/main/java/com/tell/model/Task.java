package com.tell.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * @Author: miansen
 * @Date: 2018/11/17 16:08
 */
public class Task {

    @Id
    private Integer taskId; //任务id


    private  Integer taskType;//任务类型

    private  String title;//任务标题

    private String img;//任务图片

    private  Integer totalTask;//总任务数

    private  Integer finishedTask;//完成任务数

    private BigDecimal price;//任务价格

    private  String linkAddress;//链接地址

    private  String videoAddress;//视频地址

    private Date createDate; //创建时间

    private Date updateDate; //修改时间

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(Integer totalTask) {
        this.totalTask = totalTask;
    }

    public Integer getFinishedTask() {
        return finishedTask;
    }

    public void setFinishedTask(Integer finishedTask) {
        this.finishedTask = finishedTask;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }





    @Override
    public String toString() {

        return  "Task{"+
                "taskId="+taskId+'\''+
                ",taskType="+taskType+'\''+
                ",title="+title+'\''+
                ",img="+img+'\''+
                ",finishedTask="+finishedTask+'\''+
                ",totalTask="+totalTask+'\''+
                '}';

    }
}
