package mainApp;

import network.Network;
import networkLayer.NetworkLayer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        Poniższy kod tworzy sieć neuronową z trzema warstwami.
        Pierwsza warstwa posiada 4 neurony, każdy z neuronów ma 1 wejście.
        Druga warstwa posiada 4 neurony, każdy z neuronów ma 4 wejścia (przyjmuje sygnaly z każdego neuronu z pierszej warstwy)
        Trzecia warstwa posiada jeden neuron, każdy ma 4 wejścia (przyjmuje sygnały z każdego neuronu z drugiej warstwy)
        Przy tworzeniu warstwy, warstwa uzupełnia się neuronami o odpowiednej ilości wejść i z losową wartością wagi.
         */
        Network network = new Network(3);
        network.setNetworkLayer(0, new NetworkLayer(4,1));
        network.setNetworkLayer(1, new NetworkLayer(4,network.getLayer(0).getLayerSize()));
        network.setNetworkLayer(2, new NetworkLayer(1,network.getLayer(1).getLayerSize()));
    }
}
