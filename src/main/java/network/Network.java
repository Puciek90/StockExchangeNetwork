package network;// Created by Mateusz Płuciennik on 13.11.16.

import networkLayer.NetworkLayer;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<NetworkLayer> layers;

    public Network(int layersNumber) {
        layers = new ArrayList<NetworkLayer>(layersNumber);
    }

    public void setNetworkLayer(int index, NetworkLayer networkLayer) {
        layers.add(index, networkLayer);
    }

    public NetworkLayer getLayer(int index) {
        return this.layers.get(index);
    }

    public List<NetworkLayer> getNetworkLayers() {
        return this.layers;
    }

    public void initializeNetwork(List<Double> inputs) {

        //todo: Refactor this -> GUI
        if (inputs.size() != layers.size()) System.out.println("You can not initialize network with this data (different input and network size)");

        else {
            for (int k = 0; k < layers.size(); k++) {
                if (k == 0) {
                    for (int i = 0; i < layers.get(k).getNeuralCells().size(); i++) {
                        layers.get(k).getNeuralCell(i).addInput(inputs.get(i));
                    }
                } else {
                    for (int i = 0; i < layers.get(k).getNeuralCells().size(); i++) {
                        for (int j = 0; j < layers.get(k - 1).getNeuralCell(0).getInputs().size(); j++)
                            layers.get(k).getNeuralCell(i).addInput(j, layers.get(k - 1).getNeuralCell(j).calculateOutput());
                    }
                }
            }
        }
    }

    public Double getNetworkOutput(){ return layers.get(layers.size()-1).getNeuralCell(0).calculateOutput();}
}
