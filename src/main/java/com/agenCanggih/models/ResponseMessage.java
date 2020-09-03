package com.agenCanggih.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class ResponseMessage<ENT> {

    private int code;
    private String message;
    private ENT data;

    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss.SSS")
    private LocalDateTime timestamp;

    public static <ENT> ResponseMessage<ENT> ok(int code, ENT data) {
        return new ResponseMessage<ENT>(code, null, data);
    }

    public static <ENT> ResponseMessage<ENT> error(int code, String message) {
        return new ResponseMessage<ENT>(code, message, null);
    }

    public ResponseMessage() {
    }

    public ResponseMessage(int code, String message, ENT data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ENT getData() {
        return this.data;
    }

    public void setData(ENT data) {
        this.data = data;
    }

}