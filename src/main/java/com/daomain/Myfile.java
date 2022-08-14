package com.daomain;

import org.springframework.stereotype.Component;

@Component
public class Myfile {
    String fnum,fname,fpath,type,size,username;

    public String getFnum() {
        return fnum;
    }

    public void setFnum(String fnum) {
        this.fnum = fnum;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Myfile{" +
                "fnum='" + fnum + '\'' +
                ", fname='" + fname + '\'' +
                ", fpath='" + fpath + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
