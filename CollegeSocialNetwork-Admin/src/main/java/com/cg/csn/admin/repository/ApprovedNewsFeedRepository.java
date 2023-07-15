package com.cg.csn.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.csn.admin.model.ApprovedNewsFeed;

@Repository
public interface ApprovedNewsFeedRepository extends JpaRepository<ApprovedNewsFeed, Long> {
    // add any additional methods here if needed
}


