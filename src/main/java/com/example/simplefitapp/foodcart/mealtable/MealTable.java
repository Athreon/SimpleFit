package com.example.simplefitapp.foodcart.mealtable;

import com.example.simplefitapp.base.entity.BaseEntity;
import com.example.simplefitapp.user.entity.User;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Map;

@javax.persistence.Entity
@Table(name = "meal_table")
public class MealTable extends BaseEntity {

    @Column
    private String name;

    @Column
    private int size;

    @Column
    @ElementCollection
    private Map<String, Integer> products;

    @OneToMany(mappedBy = "mealTable")
    private List<User> users;


    public MealTable() {
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Integer> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
