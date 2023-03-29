package cz.mkral.coffeeshop.persistance.repository;

import cz.mkral.coffeeshop.persistance.entity.DrinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DrinkEntityRepository extends JpaRepository<DrinkEntity, UUID> {
    List<DrinkEntity> findAll();
    DrinkEntity findDrinkEntityByName(String name);
}
