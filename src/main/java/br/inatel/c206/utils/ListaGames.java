package br.inatel.c206.utils;

import br.inatel.c206.Games;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListaGames {

    public static void addLista(String file) {

        List<Games> listGames = new ArrayList<>();

        try {
            FileReader filereader = new FileReader(file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext(); //pulando a primeira linha
            while ((nextRecord = csvReader.readNext()) != null) {

                Games aux = new Games(Integer.parseInt(nextRecord[0]),nextRecord[1],nextRecord[2],Integer.parseInt(nextRecord[3]),nextRecord[4],nextRecord[5],Double.parseDouble(nextRecord[6]),Double.parseDouble(nextRecord[7]),Double.parseDouble(nextRecord[8]),Double.parseDouble(nextRecord[9]),Double.parseDouble(nextRecord[10]));

                listGames.add(aux);

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void filtrarPlataforma(String file){
        List<Games> listGames = new ArrayList<>();

        try {
            FileReader filereader = new FileReader(file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext(); //pulando a primeira linha
            while ((nextRecord = csvReader.readNext()) != null) {

                Games aux = new Games(Integer.parseInt(nextRecord[0]),nextRecord[1],nextRecord[2],Integer.parseInt(nextRecord[3]),nextRecord[4],nextRecord[5],Double.parseDouble(nextRecord[6]),Double.parseDouble(nextRecord[7]),Double.parseDouble(nextRecord[8]),Double.parseDouble(nextRecord[9]),Double.parseDouble(nextRecord[10]));

                listGames.add(aux);
            }

//            listGames.stream().filter(nextRecord[5]);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
