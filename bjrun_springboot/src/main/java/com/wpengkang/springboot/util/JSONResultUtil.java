package com.wpengkang.springboot.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONResultUtil {
	
	//定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	//响应业务状态
	private Integer status;
	
	//响应信息
	private String msg;
	
	//响应中的数据
	private Object data;
	
	private String ok;
	
	public static JSONResultUtil build(Integer status,String msg,Object data){
		return new JSONResultUtil(status,msg,data);
	}

	public static JSONResultUtil ok(Object data){
		return new JSONResultUtil(data);
	}
	
	public static JSONResultUtil ok(){
		return new JSONResultUtil(null);
	}
	
	public static JSONResultUtil errorMsg(String msg){
		return new JSONResultUtil(500,msg,null);
	}
	
	public JSONResultUtil(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public JSONResultUtil(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}
	
}
