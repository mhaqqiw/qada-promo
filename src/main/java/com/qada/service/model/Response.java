package com.qada.service.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
  private String id;
  private String msg;
  private List<Object> data = new ArrayList<Object>();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }
}
