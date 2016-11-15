package neuralCell;// Created by Mateusz Płuciennik on 15.11.16.

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class neuralCellTest {
    private static NeuralCell neuralCell;

    //initialize neural cell with one output, input value = 2, weigh = 0.5
    @BeforeClass
    public static void createNeuralCell(){
        neuralCell = new NeuralCell(1);
        neuralCell.addInput(0, 2.0);
        neuralCell.addWeigth(0, 0.5);
    }

    @Test
    public void shouldGiveInputsNumber() {
        assertEquals(1, neuralCell.getInputSize());
    }

    @Test
    public void shouldGiveWeighSize() {
        assertEquals(1, neuralCell.getInputSize());
    }

    @Test
    public void calculateOutputTest() {
        assertEquals(1.0, neuralCell.calculateOutput(), 0);
    }
}
