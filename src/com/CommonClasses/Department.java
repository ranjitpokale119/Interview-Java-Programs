package com.CommonClasses;

import java.util.Arrays;
import java.util.List;

public class Department {
    private long deptId;
    private String deptName;

    private static List<Department> getAllDepartments() {
        return Arrays.asList(new Department(10001, "Manufacuring"),
                new Department(10002, "Health Care"));
    }

    public Department(long deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
