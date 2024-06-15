package com.gsralex.gsched.scheder.define;

import org.jgrapht.graph.DirectedAcyclicGraph;

import java.util.Set;

public class FlowDef {

    private DirectedAcyclicGraph<JobDef, EdgeDef> graph = new DirectedAcyclicGraph<>(EdgeDef.class);

    public void addEdge(JobDef v1, JobDef v2) {
        graph.addEdge(v1, v2);
    }

    public Set<JobDef> getDescendants(JobDef v) {
        return graph.getDescendants(v);
    }

}
