package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    private String name;
    private Long id;

    public CategoryDTO() {
    }

    public CategoryDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public CategoryDTO(Category entity) {
        this.name = entity.getName();
        this.id = entity.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
