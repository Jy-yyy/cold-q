package com.spring.cold.common;

public class ApiReturn {
    private static final String SUCCESS_STATE = "200";
    private static final String ERROR_STATE = "500";

    private String state;
    private String msg;
    private Object data;

    public ApiReturn() {
    }

    public ApiReturn(String state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public ApiReturn(String state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }
    public static ApiReturn success(){
        return new ApiReturn(SUCCESS_STATE,"成功");
    }

    public static ApiReturn error(){
        return new ApiReturn(ERROR_STATE,"失败");
    }

    public static ApiReturn success(String msg){
        return new ApiReturn(SUCCESS_STATE,msg);
    }

    public static ApiReturn error(String msg){
        return new ApiReturn(ERROR_STATE,msg);
    }

    public static ApiReturn success(String msg,Object obj){
        return new ApiReturn(SUCCESS_STATE,msg,obj);
    }

    public static ApiReturn error(String msg,Object obj){
        return new ApiReturn(ERROR_STATE,msg,obj);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
