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
        Network network = new Network(3);
        network.setNetworkLayer(0, new NetworkLayer(4,1));
    }
}
