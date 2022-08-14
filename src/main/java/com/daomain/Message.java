package com.daomain;

import org.springframework.stereotype.Component;

@Component
public class Message {
    Integer statuscode;
    String msg;
    Object object;

    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Message{" +
                "statuscode=" + statuscode +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
