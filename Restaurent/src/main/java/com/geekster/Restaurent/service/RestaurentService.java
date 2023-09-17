package com.geekster.Restaurent.service;

import com.geekster.Restaurent.entity.Restaurent;
import com.geekster.Restaurent.repositry.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentService {
    @Autowired
    RestaurentRepo restaurantRepo;


    public List<Restaurent> getAllRestaurants(){
        return restaurantRepo.getRestaurents();
    }

    public Restaurent getRestaurant(Integer id){
        List<Restaurent>originalList = getAllRestaurants();

        for (Restaurent r : originalList){

            if(r.getRestaurentId().equals(id)){
                return r;
            }
        }

        throw new IllegalStateException("Restaurant not found");
    }



    public String addRestaurants(List<Restaurent> r){
        List<Restaurent> originalList = getAllRestaurants();

        originalList.addAll(r);

        return "Restaurants added!";
    }

    public String updateSpecialty(Integer id, String updatedSpecial){
        List<Restaurent> originalList = getAllRestaurants();

        for (Restaurent r: originalList){
            if(r.getRestaurentId().equals(id)){

                r.setRestaurentSpecialty(updatedSpecial);
                return "Specialty Updated!";
            }
        }
        return "Restaurant not found!";
    }

    public String deleteRestaurant(Integer id){

        List<Restaurent> originalList = getAllRestaurants();
        for(Restaurent r : originalList){
            if(r.getRestaurentId().equals(id)){
                originalList.remove(r);
                return "Restaurant Deleted!";
            }
        }

        return "Restaurant not found!";

    }

}
