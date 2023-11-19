package com.user_manager.management.models;

import jakarta.persistence.Id;

public class ShowUser {
    @Id
    private String nume;
    private String prenume;

    private String status;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
