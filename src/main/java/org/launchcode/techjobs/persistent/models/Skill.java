package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255, message = "Maximum description length is 255 characters.")
    private String description;

    public @Size(max = 255, message = "Maximum description length is 255 characters.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 255, message = "Maximum description length is 255 characters.") String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
