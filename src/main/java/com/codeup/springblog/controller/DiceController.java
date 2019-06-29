package com.codeup.springblog.controller;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String diceStart() {return "roll-dice";} //this is just the name of the view

    @GetMapping("/roll-dice/{guess}")
    public String roll(@PathVariable int guess, Model model) {
        int random = getRandomInt();
        model.addAttribute("roll", random)
                .addAttribute("guess", guess)
                .addAttribute("result", random == guess);
        return "dice/dice-results";
//        return "roll-dice-result";
    }

    public int getRandomInt() {
        int random = (int) (Math.random() * 6) + 1;
        return random;
    }


    @GetMapping("roll-dice-result")
    public String result(Model model, @PathVariable int n) {
        int random = (int) (Math.random() * 6) + 1;

        String message = "Win?";

//        if (random == n) {
//            String message = "Congratulations!";
//        } else String message = "Sad face.";

        model.addAttribute(message, n);
        return "roll-dice-result";

    }

}
