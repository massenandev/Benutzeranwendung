package com.supportportal.domain;

import org.springframework.http.HttpStatus;

public class HttpResponse {
    private int httpStatusCode; //200, 201, 300, 400, 404, 500
    private HttpStatus httpStatus; //enum to each http code: HTTP_INTERNAL_SERVER_ERROR, for ex
    private String reason; //the phrases to each http status
    private String botshaft;

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String botshaft) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.botshaft = botshaft;
    }

    public HttpResponse(){}

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBotshaft() {
        return botshaft;
    }

    public void setBotshaft(String botshaft) {
        this.botshaft = botshaft;
    }
}
