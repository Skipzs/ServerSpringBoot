package com.user_manager.management.repository;


import com.user_manager.management.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {



    @Transactional
    @Modifying
    @Query(value = "DELETE FROM angajati WHERE username = :username", nativeQuery = true)
    void deleteByUsername(@Param("username") String username);

    @Transactional
    @Modifying
    @Query(value = "UPDATE angajati SET password = ?1 WHERE username=?2 and password =?3",nativeQuery = true)
    int changePasswordByUsername(String newPassword, String username, String oldPassword);

    @Query(value = "SELECT status FROM angajati WHERE username = :username",nativeQuery = true)
    String checkStatus(@Param("username")String username);

    @Query(value = "SELECT username FROM angajati WHERE username = :username",nativeQuery = true)
    List<String> checkUsername(@Param("username")String username);

    @Query(value = "SELECT password FROM angajati WHERE username = :username",nativeQuery = true)
    String checkPasswordByUsername(@Param("username")String username);

    @Query(value = "SELECT * FROM angajati WHERE username = :username", nativeQuery = true)
    User getUserDetailByUsername(@Param("username")String username);


@Transactional
@Modifying
@Query(value = "INSERT INTO angajati(username,nume,prenume,email,password,status) VALUES(:username, :nume, :prenume, :email, :password, :status)", nativeQuery = true)
    int registerNewUser(@Param("username") String username,
                        @Param("nume") String nume,
                        @Param("prenume") String prenume,
                        @Param("email") String email,
                        @Param("password") String password,
                        @Param("status") String status);

}
