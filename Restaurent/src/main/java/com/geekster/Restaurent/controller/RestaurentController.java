package com.geekster.Restaurent.controller;

import com.geekster.Restaurent.entity.Restaurent;
import com.geekster.Restaurent.service.RestaurentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RestaurentController {
    @Autowired
    RestaurentService restaurentService;

    @GetMapping("restaurant/{id}")
    public Restaurent getRestaurant(@PathVariable Integer id){
        return restaurentService.getRestaurant(id);
    }

    @PostMapping("restaurents")
    public String addRestaurant(@Valid @RequestBody List<Restaurent> r){

        return restaurentService.addRestaurants(r);
    }

    @PutMapping("restaurant/id/{id}/specialty")
    public String updateSpecialty(@PathVariable Integer id, @RequestParam String updatedSpecial){

        return restaurentService.updateSpecialty(id, updatedSpecial);

    }

    @DeleteMapping("restaurant/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
        return restaurentService.deleteRestaurant(id);
    }


}
