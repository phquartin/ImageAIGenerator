package dev.phquartin.springdockerfile.global.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String mensagem;
    private int statusCode;
    private String timestamp;
    private String path;

    public ErrorResponse() {
    }

    public ErrorResponse(String mensagem, int statusCode, String timestamp, String path) {
        this.mensagem = mensagem;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.path = path;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp (String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
