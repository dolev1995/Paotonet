package com.example.paotonet.Objects;

import java.io.Serializable;

public class Teacher implements Serializable {
    String name;
    String email;
    int kindergartenId;

    public Teacher() {
        super();
    }

    public Teacher(String name, String email, int kindergartenId) {
        this.name = name;
        this.email = email;
        this.kindergartenId = kindergartenId;
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

    public int getKindergartenId() {
        return kindergartenId;
    }

    public void setKindergartenId(int kindergartenId) {
        this.kindergartenId = kindergartenId;
    }
}

