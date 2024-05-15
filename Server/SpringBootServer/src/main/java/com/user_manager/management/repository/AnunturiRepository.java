package com.user_manager.management.repository;

import com.user_manager.management.models.Anunturi;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import com.user_manager.management.models.Anunturi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AnunturiRepository extends JpaRepository<Anunturi, Date> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO anunturi(data,titlu,mainbody) VALUES(:data, :titlu, :mainbody)", nativeQuery = true)
    int addNewAnunt(@Param("data") Date data,
                        @Param("titlu") String titlu,
                        @Param("mainbody") String mainbody);
}


