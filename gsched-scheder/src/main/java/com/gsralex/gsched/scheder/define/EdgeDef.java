package com.gsralex.gsched.scheder.define;

import java.util.Objects;

public class EdgeDef {

    private final JobDef v1;
    private final JobDef v2;


    public EdgeDef(JobDef v1, JobDef v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public JobDef getV1() {
        return v1;
    }

    public JobDef getV2() {
        return v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdgeDef edgeDef = (EdgeDef) o;
        return Objects.equals(v1, edgeDef.v1) && Objects.equals(v2, edgeDef.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }
}
