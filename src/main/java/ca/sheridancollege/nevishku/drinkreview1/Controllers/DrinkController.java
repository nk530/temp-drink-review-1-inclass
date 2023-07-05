package ca.sheridancollege.nevishku.drinkreview1.Controllers;

import ca.sheridancollege.nevishku.drinkreview1.bean.Drink;
import ca.sheridancollege.nevishku.drinkreview1.respositories.DrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@AllArgsConstructor
@Controller

public class DrinkController {
    private DrinkRepository drinkRepo;
    @GetMapping("/")
    public  String goHome(Model model){

//        ArrayList<Drink> drinks = drinkRepo.getDrinks();
//        for(Drink d : drinks)
  //      {
     //       System.out.println(d);
       // }
        model.addAttribute("meow", drinkRepo.getDrinks());
        return "home";

}

}