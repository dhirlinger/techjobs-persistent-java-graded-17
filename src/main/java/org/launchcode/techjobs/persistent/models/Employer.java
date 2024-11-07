package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is required.")
    @Size(min = 3, max = 100, message = "Location must be between 3 & 100 characters.")
    private String location;


    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    public @NotNull(message = "Location is required.") @Size(min = 3, max = 100, message = "Location must be between 3 & 100 characters.") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull(message = "Location is required.") @Size(min = 3, max = 100, message = "Location must be between 3 & 100 characters.") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
