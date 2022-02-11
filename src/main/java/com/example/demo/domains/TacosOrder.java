package com.example.demo.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: JaEntityWen
 */
@Data
@Entity
public class TacosOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date placedAt = new Date();
    private String deliveryZip;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Tacos> tacos = new ArrayList<>();
    public void addTaco(Tacos taco) {
        this.tacos.add(taco);
    }
}
