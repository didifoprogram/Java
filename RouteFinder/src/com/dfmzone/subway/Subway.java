package com.dfmzone.subway;


import java.util.*;

public class Subway {

    private List<Station> stations;
    private List<Connection> connections;
    private Map<Station, List> network;


    public Subway() {
        stations = new LinkedList<>();
        connections = new LinkedList<>();
        network = new HashMap<>();
    }

    public void addStation(String name) {
        if (!hasStation(name)) {
            stations.add(new Station(name));
        }
    }

    private boolean hasStation(String name) {
        return stations.contains(new Station(name));
    }

    public void addConnection(String lineName, String station1Name, String station2Name) {
        if (this.hasStation(station1Name) && this.hasStation(station2Name)) {
            connections.add(new Connection(lineName, new Station(station1Name), new Station(station2Name)));
            connections.add(new Connection(lineName, new Station(station2Name), new Station(station1Name)));

            addToNetwork(new Station(station1Name), new Station(station2Name));
            addToNetwork(new Station(station2Name), new Station(station1Name));

        } else {
            if (!this.hasStation(station1Name)) {
                throw new RuntimeException("Station " + station1Name + " not found");
            } else {
                throw new RuntimeException("Station " + station2Name + " not found");
            }
        }
    }

    private void addToNetwork(Station station1, Station station2) {
        if (network.keySet().contains(station1)) {
            List connectingStations = (List) network.get(station1);
            if (!connectingStations.contains(station2)) {
                connectingStations.add(station2);
            }
        } else {
            List connectingStations = new LinkedList();
            connectingStations.add(station2);
            network.put(station1, connectingStations);
        }
    }

    public Map<Station, List> getNetwork() {
        return network;
    }

    public List<Station> getStations() {
        return stations;
    }

    public List<Connection> getConnections() {
        return connections;
    }


}
