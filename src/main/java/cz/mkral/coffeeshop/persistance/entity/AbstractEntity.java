package cz.mkral.coffeeshop.persistance.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class AbstractEntity {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @CreationTimestamp
    @Column(name = "create_date_time")
    private LocalDateTime createdDateTime;
}
