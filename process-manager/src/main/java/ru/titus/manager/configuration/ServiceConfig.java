package ru.titus.manager.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.titus.learning.svm.SvmPredict;
import ru.titus.learning.svm.SvmTrain;

@Configuration
public class ServiceConfig {

@Bean
public SvmTrain svmTrain(){
    return new SvmTrain();
}

@Bean
public SvmPredict svmPredict(){
    return new SvmPredict();
}


}
