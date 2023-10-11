package com.example.TestSpringBoot.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "committees")
public class Committees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int committee_id;

    private String name;

    public Committees() {
    }

    public Committees(String name) {
        this.name = name;
    }

    public int getCommittee_id() {
        return committee_id;
    }

    public void setCommittee_id(int committee_id) {
        this.committee_id = committee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
