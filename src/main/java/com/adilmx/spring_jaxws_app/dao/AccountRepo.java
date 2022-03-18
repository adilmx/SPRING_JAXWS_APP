package com.adilmx.spring_jaxws_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adilmx.spring_jaxws_app.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{

}
