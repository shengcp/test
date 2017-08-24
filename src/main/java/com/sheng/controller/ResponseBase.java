package com.sheng.controller;



/**
 * Created by sheng on 2017/3/27.
 */
public class ResponseBase<T> {
    private int code;
    private String msg;
    private  T data;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    

	public static<T> ResponseBase<T> success(T t){
        ResponseBase<T> responseBase = new ResponseBase<>();
        responseBase.setCode(0);
        responseBase.setData(t);
        return responseBase;
    }

    public static<T> ResponseBase<T> error(String msg,int code){
        ResponseBase<T> responseBase = new ResponseBase<>();
        responseBase.setCode(code);
        responseBase.setMsg(msg);
        return responseBase;
    }

    public static<T> ResponseBase<T> error(String msg){
        ResponseBase<T> responseBase = new ResponseBase<>();
        responseBase.setCode(1);//错误码
        responseBase.setMsg(msg);
        return responseBase;
    }
    
}
