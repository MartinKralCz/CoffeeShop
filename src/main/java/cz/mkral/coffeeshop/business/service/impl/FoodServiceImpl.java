package cz.mkral.coffeeshop.business.service.impl;

import cz.mkral.coffeeshop.business.service.FoodSerivce;
import cz.mkral.coffeeshop.persistance.entity.FoodEntity;
import cz.mkral.coffeeshop.persistance.repository.FoodEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("foodSerivce")
@RequiredArgsConstructor
@Slf4j
public class FoodServiceImpl implements FoodSerivce {

    private final FoodEntityRepository foodEntityRepository;

    @PostConstruct
    private void setup(){
        log.info("Initial insertion of data started...");

        FoodEntity food1 = new FoodEntity(
                "Muffin",
                1.5,
                10
        );
        FoodEntity food2 = new FoodEntity(
                "Cupcake",
                1.0,
                10
        );
        FoodEntity food3 = new FoodEntity(
                "Cheesecake",
                2.0,
                10
        );
        FoodEntity food4 = new FoodEntity(
                "Toast",
                1.5,
                10
        );
        FoodEntity food5 = new FoodEntity(
                "Baguette",
                2.0,
                10
        );
        FoodEntity food6 = new FoodEntity(
                "Bagel",
                2.0,
                10
        );
        FoodEntity food7 = new FoodEntity(
                "Fruit bowl",
                2.5,
                10
        );

        foodEntityRepository.save(food1);
        log.info("Saved item " + food1.toString());

        foodEntityRepository.save(food2);
        log.info("Saved item " + food2.toString());

        foodEntityRepository.save(food3);
        log.info("Saved item " + food3.toString());

        foodEntityRepository.save(food4);
        log.info("Saved item " + food4.toString());

        foodEntityRepository.save(food5);
        log.info("Saved item " + food5.toString());

        foodEntityRepository.save(food6);
        log.info("Saved item " + food6.toString());

        foodEntityRepository.save(food7);
        log.info("Saved item " + food7.toString());
    }

}
