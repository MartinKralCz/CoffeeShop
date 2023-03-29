package cz.mkral.coffeeshop.business.service;

import cz.mkral.coffeeshop.business.dto.DrinkDTO;
import cz.mkral.coffeeshop.business.dto.FoodDTO;

import java.util.List;

public interface AdminService {

    List<DrinkDTO> getAllDrinks();
    List<FoodDTO> getAllFoods();

}
