package neuralCell;// Created by Mateusz Płuciennik on 13.11.16.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NeuralCell implements NeuralCellInterface {
    private List<Double> inputs;
    private List<Double> weights;
    private double output;

    public NeuralCell(int inputNumber) {
        this.inputs = new ArrayList<Double>(inputNumber);
        this.weights = new ArrayList<Double>(inputNumber);

        //set random weighs
        for (int i =0; i< inputNumber; i++) {
            weights.set(i, new Random().nextDouble());
        }
    }


    public double calculateOutput() {
        Double outputValue = 0.0;
        for (int i =0; i < getInputSize(); i++) {
          outputValue += inputs.get(i) * weights.get(i);
        }

        return outputValue;
    }

    public int getInputSize() {
        return inputs.size();
    }


}
