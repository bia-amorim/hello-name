package br.edu.usj.lpii.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
    
    @PostMapping(value="/helloName")
    public ModelAndView postHelloName (@RequestParam String nome) {
        
        ModelAndView modelAndView = new ModelAndView("hello-name");
        
        String bemVindo = "Olá" + nome + " pessoa incrível da internet!";
        modelAndView.addObject("mensagem", bemVindo);

        return modelAndView;
    }
    
}

