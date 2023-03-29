package cz.mkral.coffeeshop.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class DrinkEntity extends AbstractEntity {

    @NotNull
    @Size(min = 1,max = 100)
    private String name;

    @NotNull
    private double price;

    @NotNull
    private int stockQty;

}
