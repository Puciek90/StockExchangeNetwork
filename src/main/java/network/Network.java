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
        layers.set(index, networkLayer);
    }

    public NetworkLayer getLayer(int index) {
        return this.layers.get(index);
    }

    public List<NetworkLayer> getNetworkLayers() {
        return this.layers;
    }
}
