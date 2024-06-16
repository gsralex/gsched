package com.gsralex.gsched.scheder.runtime.flow;

import com.gsralex.gsched.scheder.define.EdgeDef;
import com.gsralex.gsched.scheder.define.FlowDef;
import com.gsralex.gsched.scheder.define.JobDef;
import com.gsralex.gsched.scheder.define.JobExecStatus;
import com.gsralex.gsched.scheder.runtime.job.JobExecInfo;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public class FlowRuntime {

    private FlowDef flowDef;
    private Set<JobExecInfo> jobExecInfos;

    public FlowRuntime(FlowDef flowDef) {
        this(flowDef, null);
    }

    public FlowRuntime(FlowDef flowDef, @Nullable Set<JobExecInfo> jobExecInfos) {
        this.flowDef = flowDef;
        this.jobExecInfos = jobExecInfos == null ? new HashSet<>() : jobExecInfos;
    }


    public void reportJobFinished(JobExecInfo execInfo) {
        jobExecInfos.add(execInfo);
    }

    /**
     *
     */
    public void getReadyJobs() {

    }

    private void isReady(JobDef jobDef) {
        Set<EdgeDef> edges = flowDef.incomingEdgesOf(jobDef);


    }

    public void getReadJobs(Set<String> jobIds) {

    }
}
