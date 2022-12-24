package com.example.backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public String getDescription() {
        return description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public Date getUpdated_At() {
        return updated_At;
    }

    private String projectIdentifier;
    private String ProjectName;

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }

    public void setUpdated_At(Date updated_At) {
        this.updated_At = updated_At;
    }

    private String description;
    private Date start_date;
    private Date end_date;

    private Date create_At;
    private Date updated_At;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
