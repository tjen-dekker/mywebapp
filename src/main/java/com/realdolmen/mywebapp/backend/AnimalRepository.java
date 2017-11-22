package com.realdolmen.mywebapp.backend;

import com.realdolmen.mywebapp.domain.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by TDKBG57 on 2017-11-22.
 */
@Repository
public class AnimalRepository {

    List<Animal> data = new ArrayList<>(Arrays.asList(
            new Animal("Shere Khan", "Tiger", 32),
            new Animal("Balou", "Bear", 25),
            new Animal("Mogli", "Human", 7),
            new Animal("King Louwie", "Ape", 42),
            new Animal("Kaa", "Snake", 25)
    ));

    public List<Animal> findAllAnimals() {
        return Collections.unmodifiableList(data);
    }

    public void save(Animal a) {
        data.add(a);
    }
}
