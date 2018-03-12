package ru.titus.learning.neuroph;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.util.TransferFunctionType;
import org.neuroph.util.data.norm.MaxMinNormalizer;
import org.neuroph.util.data.norm.Normalizer;

import java.util.ArrayList;
import java.util.List;

import static org.neuroph.util.TransferFunctionType.SIGMOID;

public class MyNeuralNetwork {

    private final static int NeuronsInLayer = 10;
    List<Integer> neuronsInLayers = new ArrayList<>();

    public void start(){

        // create new perceptron network
        MultiLayerPerceptron multiLayerPerceptron = new MultiLayerPerceptron( TransferFunctionType.SIGMOID,2,10,10,10,1);

        BackPropagation backPropagation = new BackPropagation();
        backPropagation.setMaxIterations(1000);
        multiLayerPerceptron.randomizeWeights();
        backPropagation.setLearningRate(0.02);
        backPropagation.setMaxError(0.01);
        Normalizer normalizer = new MaxMinNormalizer();
        DataSet dataSet = new DataSet(5,4);
        dataSet.shuffle();

//        backPropagation.se;

        // create training set
        DataSet trainingSet = new DataSet(2, 1);
        // add training data to training set (logical OR function)
        trainingSet. addRow (new DataSetRow (new double[]{4, 3}, new double[]{2}));
        trainingSet. addRow (new DataSetRow (new double[]{7, 2}, new double[]{5}));
        trainingSet. addRow (new DataSetRow (new double[]{1, 6}, new double[]{1}));
        trainingSet. addRow (new DataSetRow (new double[]{1, 3}, new double[]{4}));

        normalizer.normalize(trainingSet);


        multiLayerPerceptron.learn(trainingSet,backPropagation);
        System.out.println("Learning finished");

        // learn the training set
//        neuralNetwork.learn(trainingSet);
        // save the trained network into file
//        neuralNetwork.save("or_perceptron.nnet");
    }


}
