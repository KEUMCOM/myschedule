package com.sist.myschedule.persistence;

import com.sist.myschedule.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

    @Query(value = "select * from todo t where t.userid = ?1", nativeQuery = true)
    List<TodoEntity> findByUserId(String userId);
}
