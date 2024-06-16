package com.gsralex.gsched.scheder.runtime.job;

import com.gsralex.gsched.scheder.define.JobExecStatus;

import java.util.Objects;

public class JobExecInfo {

    private final String jobId;

    private final JobExecStatus status;

    public JobExecInfo(String jobId, JobExecStatus status) {
        this.jobId = jobId;
        this.status = status;
    }

    public String getJobId() {
        return jobId;
    }

    public JobExecStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobExecInfo that = (JobExecInfo) o;
        return Objects.equals(jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }

    @Override
    public String toString() {
        return "JobExecInfo{" +
                "jobId='" + jobId + '\'' +
                ", status=" + status +
                '}';
    }
}
