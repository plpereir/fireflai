package com.ibm.fireflai.model;

import java.util.List;

public class Candidate {
    private String _id;
    private String _rev;
    private String name;
    private String email;
    private List<String> skills;
    private String last_job;
    
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getSkills() {
        return skills;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public String getLast_job() {
        return last_job;
    }
    public void setLast_job(String last_job) {
        this.last_job = last_job;
    }
    
    
}
