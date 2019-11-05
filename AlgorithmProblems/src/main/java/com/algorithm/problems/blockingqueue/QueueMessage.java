package com.algorithm.problems.blockingqueue;

public class QueueMessage {
    private String message;

    public QueueMessage(final String str) {
        this.message  = str;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
