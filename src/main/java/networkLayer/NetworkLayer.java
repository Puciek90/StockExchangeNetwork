package networkLayer;// Created by Mateusz Płuciennik on 13.11.16.

import neuralCell.NeuralCell;

import java.util.ArrayList;
import java.util.List;

public class NetworkLayer {
    private List<NeuralCell> neuralCells;


    //neuralCellsInput - number of neural cell inputs
    public NetworkLayer(int cellsNumber, int neuralCellsInput) {
        this.neuralCells = new ArrayList<NeuralCell>(cellsNumber);

        for (int i = 0; i< cellsNumber; i++) {
            neuralCells.set(i, new NeuralCell(neuralCellsInput));
        }
    }

    //todo: exception or if-control
    public NeuralCell getNeuralCell(int index) {
        return this.neuralCells.get(index);
    }

    public List<NeuralCell> getNeuralCells(){
        return this.neuralCells;
    }


}
