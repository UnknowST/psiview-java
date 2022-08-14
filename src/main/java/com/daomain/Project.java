package com.daomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Project {
    String tnum,tname,detail,username1,username2,security,balance,protocol,file1,file2,result,status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")//页面写入数据库时格式化
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "GMT+8")  //查询输出时格式转换
    Date ctime;

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Project{" +
                "tnum='" + tnum + '\'' +
                ", tname='" + tname + '\'' +
                ", detail='" + detail + '\'' +
                ", username1='" + username1 + '\'' +
                ", username2='" + username2 + '\'' +
                ", security='" + security + '\'' +
                ", balance='" + balance + '\'' +
                ", protocol='" + protocol + '\'' +
                ", file1='" + file1 + '\'' +
                ", file2='" + file2 + '\'' +
                ", result='" + result + '\'' +
                ", status='" + status + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
