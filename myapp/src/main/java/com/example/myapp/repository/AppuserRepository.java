package com.example.myapp.repository;

import com.example.myapp.model.Appuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppuserRepository extends JpaRepository<Appuser, Long>{
}