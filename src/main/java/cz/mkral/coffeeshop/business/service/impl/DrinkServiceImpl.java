package cz.mkral.coffeeshop.business.service.impl;

import cz.mkral.coffeeshop.business.service.DrinkService;
import cz.mkral.coffeeshop.persistance.entity.DrinkEntity;
import cz.mkral.coffeeshop.persistance.repository.DrinkEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("drinkService")
@RequiredArgsConstructor
@Slf4j
public class DrinkServiceImpl implements DrinkService {

    private final DrinkEntityRepository drinkEntityRepository;

    @PostConstruct
    private void setup() {
        log.info("Initial insertion of data started...");

        DrinkEntity drink1 = new DrinkEntity(
                "Esspresso",
                1.00,
                10
        );
        DrinkEntity drink2 = new DrinkEntity(
                "Cappucino",
                1.50,
                10
        );
        DrinkEntity drink3 = new DrinkEntity(
                "Americano",
                1.25,
                10
        );
        DrinkEntity drink4 = new DrinkEntity(
                "Flat White",
                1.50,
                10
        );
        DrinkEntity drink5 = new DrinkEntity(
                "Latte",
                1.50,
                10
        );
        DrinkEntity drink6 = new DrinkEntity(
                "Pineapple Smoothie",
                2.0,
                10
        );
        DrinkEntity drink7 = new DrinkEntity(
                "Watter",
                0.5,
                10
        );
        DrinkEntity drink8 = new DrinkEntity(
                "Orange juice",
                1.5,
                10
        );
        DrinkEntity drink9 = new DrinkEntity(
                "Beer",
                2.0,
                10
        );
        DrinkEntity drink10 = new DrinkEntity(
                "Coca Cola",
                1.5,
                10
        );

        drinkEntityRepository.save(drink1);
        log.info("Saved item " + drink1.toString());

        drinkEntityRepository.save(drink2);
        log.info("Saved item " + drink2.toString());

        drinkEntityRepository.save(drink3);
        log.info("Saved item " + drink3.toString());

        drinkEntityRepository.save(drink4);
        log.info("Saved item " + drink4.toString());

        drinkEntityRepository.save(drink5);
        log.info("Saved item " + drink5.toString());

        drinkEntityRepository.save(drink6);
        log.info("Saved item " + drink6.toString());

        drinkEntityRepository.save(drink8);
        log.info("Saved item " + drink8.toString());

        drinkEntityRepository.save(drink9);
        log.info("Saved item " + drink9.toString());

        drinkEntityRepository.save(drink10);
        log.info("Saved item " + drink10.toString());
    }

}
