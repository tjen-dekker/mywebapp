package com.realdolmen.mywebapp.frontend;

import com.realdolmen.mywebapp.backend.AnimalRepository;
import com.realdolmen.mywebapp.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by TDKBG57 on 2017-11-22.
 */

@Controller
public class HelloWorldController {

    @Autowired
    private AnimalRepository animalRepository;


    @RequestMapping(method = RequestMethod.GET, path = "/animal/list")
    public String sayHello(Map<String, Object> model) {

        List<Animal> animals = animalRepository.findAllAnimals();
        model.put("myAnimalList", animals);

        System.out.println("Doing some stuff");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/animal/create")
    public String createAnimalForm(@ModelAttribute("animal") Animal a) {
        a.setName("placeholder");
        return "createAnimal";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/animal/create")
    public String createAnimalAction(@Valid Animal a, Errors errors) {
        if (errors.hasErrors()) {
            return "createAnimal";
        } else {
            System.out.println(a.getAge());
            System.out.println(a.getName());
            System.out.println(a.getType());
            animalRepository.save(a); // Actual post processing!!!!
            return "redirect:/animal/list";
        }
    }

//    //animal?animalId=1507
//    @RequestMapping(method = RequestMethod.GET, path = "hello.html")
//    public String showAnimnalDetails(@RequestParam("animalId") int myId){
//        return "hello";
//    }
//
//    // /animal/1507
//    @RequestMapping(method = RequestMethod.GET, path = "/animal/{aid}")
//    public String showAnimalDetails(@PathVariable("aid") int myId){
//        return "hello";
//    }


    /**
     * implicit: view name: animals
     * Model attribute: animalList
     */

    @RequestMapping(method = RequestMethod.GET, path = "/animals")
    public List<Animal> findAnimals() {
        return animalRepository.findAllAnimals();
    }


/**
 * Same but different
 *
 */
//    @RequestMapping(method = RequestMethod.GET, path = "/hello.html")
//    public ModelAndView sayHello(Map<String, Object> model) {
//
//        List<Animal> animals = animalRepository.findAllAnimals();
//
//        System.out.println("Doing some stuff");
//        return new ModelAndView("hello", "myAnimalList", animals);
//    }
}
