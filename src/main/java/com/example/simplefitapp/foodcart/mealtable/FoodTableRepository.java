package com.example.simplefitapp.foodcart.mealtable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTableRepository extends JpaRepository<MealTable, Long> {

    MealTable findTableById(Long id);

}
