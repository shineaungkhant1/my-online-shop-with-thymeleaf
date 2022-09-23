package com.example.myonlineshopwiththymeleaf.dao;

import com.example.myonlineshopwiththymeleaf.ds.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsDao extends JpaRepository<Items,Integer> {
}
