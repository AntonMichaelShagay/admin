package com.cg.csn.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.csn.admin.entity.NewsFeed;

@Repository
public interface NewsFeedRepository extends JpaRepository<NewsFeed, Long> {

}
//package com.cg.boot.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.cg.boot.entity.NewsFeed;
//
//public interface NewsFeedRepository extends JpaRepository<NewsFeed, Long> {
//
//}
