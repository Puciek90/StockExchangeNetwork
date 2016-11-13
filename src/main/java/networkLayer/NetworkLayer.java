package networkLayer;// Created by Mateusz Płuciennik on 13.11.16.

import neuralCell.NeuralCell;

import java.util.ArrayList;
import java.util.List;

public class NetworkLayer {
    private List<NeuralCell> neuralCells;

    public NetworkLayer(int cellsNumber, int neuralCellsInput) {
        this.neuralCells = new ArrayList<NeuralCell>(cellsNumber);

        for (int i = 0; i< cellsNumber; i++) {
            neuralCells.set(i, new NeuralCell(neuralCellsInput));
        }
    }

}
