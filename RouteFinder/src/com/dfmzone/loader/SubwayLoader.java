package com.dfmzone.loader;

import com.dfmzone.subway.Subway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SubwayLoader {

    private Subway subway;

    public SubwayLoader() {
        this.subway = new Subway();
    }

    public Subway loadFromFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        loadStations(subway, bufferedReader);
        String lineName = bufferedReader.readLine();
        while ((lineName != null) && (lineName.length() > 0)) {
            loadLine(subway, bufferedReader, lineName);
            lineName = bufferedReader.readLine();
        }
        return subway;
    }

    public void loadStations(Subway subway, BufferedReader bufferedReader) throws IOException {
        String currentLine;
        currentLine = bufferedReader.readLine();
        while (currentLine.length() > 0) {
            subway.addStation(currentLine);
            currentLine = bufferedReader.readLine();
        }
    }

    public void loadLine(Subway subway, BufferedReader bufferedReader, String lineName) throws IOException {
        String station1Name, station2Name;
        station1Name = bufferedReader.readLine();
        station2Name = bufferedReader.readLine();
        while ((station2Name != null) && (station2Name.length() > 0)) {
            subway.addConnection(lineName, station1Name, station2Name);
            station1Name = station2Name;
            station2Name = bufferedReader.readLine();
        }
    }



}
