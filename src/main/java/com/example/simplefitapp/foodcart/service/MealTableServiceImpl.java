package com.example.simplefitapp.foodcart.service;

import com.example.simplefitapp.foodcart.mealtable.FoodTableRepository;
import com.example.simplefitapp.foodcart.mealtable.MealTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealTableServiceImpl implements MealTableService{

    @Autowired
    private FoodTableRepository foodTableRepository;

    public MealTableServiceImpl() {
    }

    @Override
    public MealTable save(MealTable mealTable) {
        return null;
    }

    @Override
    public MealTable getMealTableByUserId(Long id) {
        return null;
    }
}
