package cz.mkral.coffeeshop.persistance.repository;

import cz.mkral.coffeeshop.persistance.entity.DrinkEntity;
import cz.mkral.coffeeshop.persistance.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FoodEntityRepository extends JpaRepository<FoodEntity, UUID> {
    List<FoodEntity> findAll();
    FoodEntity findFoodEntityByName(String name);
}
