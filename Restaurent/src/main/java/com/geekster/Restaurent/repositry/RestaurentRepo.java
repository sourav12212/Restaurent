package com.geekster.Restaurent.repositry;

import com.geekster.Restaurent.entity.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurentRepo {
    @Autowired
    List<Restaurent> restaurentList;

    public List<Restaurent> getRestaurents(){
        return restaurentList;
    }

    public void addRestaurant(Restaurent r){
        List<Restaurent>listOfRestaurent = getRestaurents();
        listOfRestaurent.add(r);
    }
}
