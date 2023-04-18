package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicController{

    @Autowired
    BasicService basicService;

/**
      creazione oggetto logger per registrare le informazioni di log
 **/
    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String welcome(){
        logger.info("Welcome message displayed");
        return "Welcome!";
    }

    @GetMapping("/exp")
    public int exponent(@RequestParam int value1, @RequestParam int value2){
        logger.debug("Exponent calculation started");
        int result = basicService.calculateExponent(value1,value2);
        logger.info("Exponent calculation completed");
        return result;
    }

    @GetMapping("/get-errors")
    public String getError(){
        logger.error("Custom error generated");
        throw new RuntimeException("Custom error generated");
    }




}