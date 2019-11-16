package pl.hubf.git_examples.springprzyklad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerhello {
    private static final Logger logger= LoggerFactory.getLogger(controllerhello.class);

    @GetMapping("/hello")
    ModelAndView myfirstView(ModelAndView modeltaki,@RequestParam(defaultValue = "dybcio") String name){
        logger.info("name: {}",name);
        modeltaki.addObject("user",name);
        modeltaki.setViewName("home");
        return modeltaki;
    }
}
