package cz.mkral.coffeeshop.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodDTO {

    private String name;
    private double price;
    private int quantity;

}
