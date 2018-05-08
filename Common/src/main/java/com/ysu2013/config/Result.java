package com.ysu2013.config;

import java.io.Serializable;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/05/04
 * @mail 1327994105@qq.com
 * @description 封装的返回类
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 111L;

    private Code code;

    private String message;

    private T data;

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage(Code code,String message) {
        this.code = code;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public enum Code implements Serializable{
        SUCCESS(10200,"操作成功"),
        PARAMETERROR(100401,"参数错误"),
        AUTHENTICATIONERROR(10402,"无权到此一游"),
        SYSTEMERROR(10403,"系统错误"),
        NOSUCHCOLLEAGUE(10500,"没有你这样的人"),
        LOGINERROR(10501,"登录错误"),
        FILEUPLOADERROR(100502,"文件上传出错");

        private static final long serialVersionUID = 12314L;

        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        Code(int code, String message){
            this.code = code;
            this.message = message;
        }
    }
}
