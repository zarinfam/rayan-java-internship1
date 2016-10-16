package com.rh.internship.task.models;

import javax.persistence.*;
import java.util.List;

/**
 * @author Saeed Zarinfam
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Task> taskList;

    public User() {
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
