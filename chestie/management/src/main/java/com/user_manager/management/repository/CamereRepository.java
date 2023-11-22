package com.user_manager.management.repository;

import com.user_manager.management.models.Camere;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamereRepository extends CrudRepository<Camere, Integer> {

    @Query(value = "SELECT status FROM camere WHERE id = :id",nativeQuery = true)
    String checkStatusById(@Param("id")int id);

    @Query(value = "SELECT obs FROM camere WHERE id = :id",nativeQuery = true)
    String checkObsById(@Param("id")int id);

    @Query(value = "SELECT id FROM camere WHERE id = :id",nativeQuery = true)
    List<Integer> checkId(@Param("id")int id);
    @Transactional
    @Modifying
    @Query(value = "UPDATE camere SET obs =?1, status =?2 WHERE id =?3",nativeQuery = true)
    int changeCameraById(String obs, String status, int id);




    /*@Modifying
    @Query(value = "UPDATE camere SET status = :status where id=:id"  ",nativeQuery = true)
*/
}
