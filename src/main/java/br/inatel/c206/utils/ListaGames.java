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

    public static List<Games> games(Path csvFilePath) {
        List<Games> listGames = new ArrayList<>();

        //csvFilePath e o caminho onde se encontra o arquivo
        //nesse exemplo e um instancia de Path do pacote java.nio
        try {
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Games> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Games.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            listGames = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listGames;
    }
    // Java code to illustrate reading a
    // CSV file line by line
//    public static void readDataLineByLine(String file) {
//        try {
//            FileReader filereader = new FileReader(file);
//
//            CSVReader csvReader = new CSVReader(filereader);
//            String[] nextRecord;
//
//            while ((nextRecord = csvReader.readNext()) != null) {
//                Games aux = new Games(Integer.parseInt(nextRecord[0]),nextRecord[1],nextRecord[2],Integer.parseInt(nextRecord[3]),nextRecord[4],nextRecord[5],Double.parseDouble(nextRecord[6]),Double.parseDouble(nextRecord[7]),Double.parseDouble(nextRecord[8]),Double.parseDouble(nextRecord[9]));
//
//                System.out.println(nextRecord[1] + "\t");
////
////                for (String cell : nextRecord) {
////
//////                    System.out.println(nextRecord[1] + "\t");
////                    //System.out.print(cell + "\t");
////
////                }
//                System.out.println();
//            }
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
