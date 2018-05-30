package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.beans.Sample;

@Repository
public interface SampleDao extends JpaRepository<Sample, Integer> {

}