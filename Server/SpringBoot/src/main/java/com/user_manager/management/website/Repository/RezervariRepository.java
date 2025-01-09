package com.user_manager.management.website.Repository;

import com.user_manager.management.website.Models.Rezervare;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface RezervariRepository extends JpaRepository<Rezervare,Integer> {


    @Transactional
    @Modifying
    @Query(value = "INSERT into rezervari(nume,prenume,cnp,telefon,email,data)" +
                    "VALUES (:nume, :prenume, :cnp, :telefon, :email, :data)", nativeQuery = true)
    int addNewRezervare(@Param("nume")      String nume,
                        @Param("prenume")   String prenume,
                        @Param("cnp")       int cnp,
                        @Param("telefon")   int telefon,
                        @Param("email")     String email,
                        @Param("data")      Date data);

}
