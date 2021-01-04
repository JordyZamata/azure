package com.formacion.reactiva.controlles;

import com.formacion.reactiva.model.Person;
import io.reactivex.Single;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping("/listar")
    public Single<List<Person>> findAll(){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Jordy", "Zamata"));
        personList.add(new Person(2, "David", "Zapata"));
        personList.add(new Person(3, "Juan", "Conislla"));



        return Single.just(personList);

    }



}
