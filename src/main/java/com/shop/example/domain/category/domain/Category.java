package com.shop.example.domain.category.domain;

import com.shop.example.global.common.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Category extends BaseEntity {
    private String name;
}
