package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @RequestMapping(value = "/caculator")
   public ModelAndView showCaculator()
    {
        ModelAndView modelAndView=new ModelAndView("/caculator");
        return modelAndView;
    }
    @PostMapping(value = "/caculator")
    public String Caculator(@RequestParam("value1") float value1,@RequestParam("value2") float value2,
                                  @RequestParam("caculator") String caculator,Model model
                                  )
    {

       float result= com.codegym.Controller.caculator.caculatorr(value1,value2,caculator);
       model.addAttribute("results",result);
       return "/caculator";

    }
}
