package com.mz.malesoft.model;

import lombok.Data;

@Data
public class StringResponse {
    private String response;

    public StringResponse() {
    }


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
