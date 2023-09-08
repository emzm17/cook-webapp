package com.me.dao;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.entity.Cook;

@Repository
@N1qlPrimaryIndexed
@ViewIndexed(designDoc="cook",viewName="all")
public interface CookRepository extends JpaRepository<Cook, Integer> {

}