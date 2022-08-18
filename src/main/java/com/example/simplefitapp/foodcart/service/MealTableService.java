package com.example.simplefitapp.foodcart.service;

import com.example.simplefitapp.foodcart.mealtable.MealTable;

public interface MealTableService {

    MealTable save(MealTable mealTable);

    MealTable getMealTableByUserId(Long id);
}
