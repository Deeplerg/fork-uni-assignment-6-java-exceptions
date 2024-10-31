package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        String exceptionType = "none";
        try {
            processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
        } catch (RuntimeException e) {
            exceptionType = "unchecked";
        } catch (Exception e) {
            exceptionType = "checked";
        }
        return exceptionType;
    }

}