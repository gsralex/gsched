package com.gsralex.gsched.scheder.define;

public enum JobExecStatus {

    PENDING,
    SKIPPED,
    RUNNING,
    STOPPED;


    public boolean isReady() {
        return false;
    }


}
