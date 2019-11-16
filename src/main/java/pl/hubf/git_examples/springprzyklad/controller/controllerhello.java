package pl.hubf.git_examples.springprzyklad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.hubf.git_examples.springprzyklad.domain.User;
import pl.hubf.git_examples.springprzyklad.service.UserService;

import java.util.List;

@Controller
public class controllerhello {
    private static final Logger logger= LoggerFactory.getLogger(controllerhello.class);
    private UserService UserService;
    //hreskjhfkjrhfk

    @Autowired
    public controllerhello(UserService userService) {
        UserService = userService;
    }

    @GetMapping("/hello")
    ModelAndView myfirstView(ModelAndView modeltaki,@RequestParam(defaultValue = "dybcio") String name){
        logger.info("name: {}",name);
        modeltaki.addObject("user",name);
        modeltaki.setViewName("home");
        return modeltaki;
    }
    @GetMapping("/hi")
    ModelAndView kolejnyview(ModelAndView mod,@RequestParam(defaultValue = "imie") String imie,
                             @RequestParam(defaultValue = "kolek") String nazwisko,
                                     @RequestParam(defaultValue = "serock12") String adres){
        logger.info("imie: {}",imie);
        logger.info("nazwisko: {}",nazwisko);
        logger.info("adres: {}",adres);
        mod.addObject("imie",imie);
        mod.addObject("nazwisko",nazwisko);
        mod.addObject("adres",adres);
        mod.setViewName("home");
        return mod;
    }
    @GetMapping("/users")
    ModelAndView modzik(ModelAndView moda){
        List<User> users = UserService.getAllUsers();
        logger.info("users from db: [{}]",users);
        moda.addObject("allusers",UserService.getAllUsers());
        moda.setViewName("users");
        return moda;
    }
}
