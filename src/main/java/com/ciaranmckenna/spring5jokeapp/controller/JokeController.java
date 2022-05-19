package com.ciaranmckenna.spring5jokeapp.controller;

import com.ciaranmckenna.spring5jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", ""})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
