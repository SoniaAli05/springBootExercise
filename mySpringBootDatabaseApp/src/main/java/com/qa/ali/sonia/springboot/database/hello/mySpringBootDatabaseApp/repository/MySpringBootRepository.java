package com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.model.MySpringBootDataModel;

@Repository
public interface MySpringBootRepository extends JpaRepository<MySpringBootDataModel,Long> {

}
