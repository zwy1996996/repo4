package cn.itheima.domain;

public class Teacher {
    private String name;
    private String project;

    public Teacher(String name, String project) {
        this.name = name;
        this.project = project;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
