package cz.mkral.coffeeshop.business.service.impl;

import cz.mkral.coffeeshop.business.dto.DrinkDTO;
import cz.mkral.coffeeshop.business.dto.FoodDTO;
import cz.mkral.coffeeshop.business.service.AdminService;
import cz.mkral.coffeeshop.persistance.entity.DrinkEntity;
import cz.mkral.coffeeshop.persistance.repository.DrinkEntityRepository;
import cz.mkral.coffeeshop.persistance.repository.FoodEntityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("adminService")
@AllArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {

    private final DrinkEntityRepository drinkEntityRepository;
    private final FoodEntityRepository foodEntityRepository;

    @Override
    public List<DrinkDTO> getAllDrinks() {
        List<DrinkEntity> drinkEntities = drinkEntityRepository.findAll();
        List<DrinkDTO> drinkDTOs = new ArrayList<>();
        DrinkDTO currentDrinkDto;

        for (DrinkEntity currentDrink : drinkEntities) {
            currentDrinkDto = new DrinkDTO(
                    currentDrink.getName(),
                    currentDrink.getPrice(),
                    currentDrink.getStockQty());

            drinkDTOs.add(currentDrinkDto);
        }

        return drinkDTOs;
    }

    @Override
    public List<FoodDTO> getAllFoods() {
        return null;
    }
}
