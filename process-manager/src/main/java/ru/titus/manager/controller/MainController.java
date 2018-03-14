package ru.titus.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.titus.learning.svm.SvmPredict;
import ru.titus.learning.svm.SvmTrain;
import ru.titus.manager.service.DataCollector;

@RestController
public class MainController {

    @Autowired private DataCollector dataCollector;
    @Autowired private SvmTrain svmTrain;
    @Autowired private SvmPredict svmPredict;

    @RequestMapping("/run")
    public void start() {
//        MyNeuralNetwork myNeuralNetwork = new MyNeuralNetwork();
////      myNeuralNetwork.start();
//        dataCollector.collectMatchOdds( );
        svmTrain.run();
        svmPredict.run();
        System.out.println("All worked");
    }

}
