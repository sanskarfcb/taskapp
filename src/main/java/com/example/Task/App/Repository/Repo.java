package com.example.Task.App.Repository;

import com.example.Task.App.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Task,Long> {

}
