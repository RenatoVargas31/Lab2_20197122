package com.example.lab2_20197122.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class GameController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String paginaPrincipal() {
        return "settingsGame";
    }

    @PostMapping("/startGame")
    public String settingsGame(@RequestParam("sizeWord") String sizeWord,
                               @RequestParam("attempts") String attempts,
                               @RequestParam("tema") String tema,Model model) {
        System.out.println("Size word: " + sizeWord);
        System.out.println("Attempts: " + attempts);
        System.out.println("Tema: " + tema);
        //Arreglo de animales
        //animales = {"leon", "elefante", "tigre", "cebra", "jirafa", "delfin", "ballena", "gorila", "panda","aguila", "hipopotamo", "koala", "lobo", "oso", "canguro"};
        //Arraylist de animales
        ArrayList<String> animales = new ArrayList<String>();
        animales.add("leon");
        animales.add("elefante");
        animales.add("tigre");
        animales.add("cebra");
        animales.add("jirafa");
        animales.add("delfin");
        animales.add("ballena");
        animales.add("gorila");
        animales.add("panda");
        animales.add("aguila");
        animales.add("hipopotamo");
        animales.add("koala");
        animales.add("lobo");
        animales.add("oso");
        animales.add("canguro");
        //frutas={manzana, platano, kiwi, mango, pera, uva, fresa, naranja, piña, sandía,cereza, melon, papaya, limon, higo}
        //Arreglo de frutas
        //Arraylist de frutas
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("manzana");
        frutas.add("platano");
        frutas.add("kiwi");
        frutas.add("mango");
        frutas.add("pera");
        frutas.add("uva");
        frutas.add("fresa");
        frutas.add("naranja");
        frutas.add("piña");
        frutas.add("sandía");
        frutas.add("cereza");
        frutas.add("melon");
        frutas.add("papaya");
        frutas.add("limon");
        frutas.add("higo");

        model.addAttribute("sizeWord", sizeWord);
        model.addAttribute("attempts", attempts);
        model.addAttribute("tema", tema);
        return "startGame";
    }
    @PostMapping("/enviarLetra")
    public String enviarLetra(@RequestParam("letra") String letra,
                              @RequestParam("attempts") String attempts,Model model) {
        System.out.println("Letra: " + letra);
        attempts = String.valueOf(Integer.parseInt(attempts) - 1);
        model.addAttribute("letra", letra);
        model.addAttribute("attempts", attempts);
        return "startGame";
    }
    //método pra enviar parámetros a la vista "startGame"
}
