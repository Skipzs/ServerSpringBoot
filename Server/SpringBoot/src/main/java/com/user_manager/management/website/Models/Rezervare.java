package com.user_manager.management.website.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "rezervari")
public class Rezervare {

    @Id
    int id;

    @NotEmpty
    int cnp;

    @NotEmpty
    int telefon;

    @NotEmpty
    String nume;

    @NotEmpty
    String prenume;

    @NotEmpty
    String email;

    @NotEmpty
    Date data;

}
