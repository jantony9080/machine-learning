package ru.titus.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.titus.manager.service.DataCollector;
import ru.titus.learning.neuroph.MyNeuralNetwork;

@RestController
public class MainController {

    @Autowired
    private DataCollector dataCollector;

    @RequestMapping("/run")
    public void start() {
//        MyNeuralNetwork myNeuralNetwork = new MyNeuralNetwork();
////        myNeuralNetwork.start();
        dataCollector.collectMatchOdds( );
        System.out.println("All worked");
    }

}
