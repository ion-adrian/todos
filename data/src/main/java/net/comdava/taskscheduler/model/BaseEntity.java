package net.comdava.taskscheduler.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    // getters
    public Long getId() { return id; }

    //setters
    public void setId(Long id) { this.id = id; }
}
