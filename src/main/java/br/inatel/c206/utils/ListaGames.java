package br.inatel.c206.utils;

import br.inatel.c206.Games;
import br.inatel.c206.enums.Platforms;
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
import java.util.Locale;

public class ListaGames {

    public static void addLista() {
        List<Games> listGames = new ArrayList<>();

        try {
            FileReader filereader = new FileReader(Caminhos.file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext(); //pulando a primeira linha
            while ((nextRecord = csvReader.readNext()) != null) {
                listadd(listGames, nextRecord);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void filtrarPlat(String plat){
        List<Games> listGames = new ArrayList<>();

        try {
            FileReader filereader = new FileReader(Caminhos.file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext(); //pulando a primeira linha
            Games cabecalho = new Games(
                    nextRecord[0],
                    nextRecord[1],
                    nextRecord[2],
                    nextRecord[3],
                    nextRecord[4],
                    nextRecord[5],
                    nextRecord[6],
                    nextRecord[7],
                    nextRecord[8],
                    nextRecord[9],
                    nextRecord[10]
            );
            while ((nextRecord = csvReader.readNext()) != null) {
                if(nextRecord[2].equals(plat)) {
                    listadd(listGames, nextRecord);
                }
            }
            System.out.println("Jogos de "+ plat);
            System.out.println(
                    cabecalho.getRankString() + " " +
                            cabecalho.getName() + " " +
                            cabecalho.getPlatform() + " " +
                            cabecalho.getYearString() + " " +
                            cabecalho.getGenre() + " " +
                            cabecalho.getPublisher() + " " +
                            cabecalho.getNa_salesString() + " " +
                            cabecalho.getEu_salesString() + " " +
                            cabecalho.getJp_salesString() + " " +
                            cabecalho.getOther_salesString() + " " +
                            cabecalho.getGlobal_salesString() + " "
            );
            listGames.forEach(l -> {
                System.out.println(
                        l.getRank() + " " +
                                l.getName() + " " +
                                l.getPlatform() + " " +
                                l.getYear() + " " +
                                l.getGenre() + " " +
                                l.getPublisher() + " " +
                                l.getNa_sales() + " " +
                                l.getEu_sales() + " " +
                                l.getJp_sales() + " " +
                                l.getOther_sales() + " " +
                                l.getGlobal_sales() + " "
                );
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void filtrarDev(String dev){
        List<Games> listGames = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(Caminhos.file);

            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext(); //pulando a primeira linha
            Games cabecalho = new Games(
                    nextRecord[0],
                    nextRecord[1],
                    nextRecord[2],
                    nextRecord[3],
                    nextRecord[4],
                    nextRecord[5],
                    nextRecord[6],
                    nextRecord[7],
                    nextRecord[8],
                    nextRecord[9],
                    nextRecord[10]
            );
            while ((nextRecord = csvReader.readNext()) != null) {
                if(nextRecord[5].equals(dev)) {
                    listadd(listGames, nextRecord);
                }
            }
            System.out.println("Jogos de "+ dev);
            System.out.println(
                    cabecalho.getRankString() + " " +
                            cabecalho.getName() + " " +
                            cabecalho.getPlatform() + " " +
                            cabecalho.getYearString() + " " +
                            cabecalho.getGenre() + " " +
                            cabecalho.getPublisher() + " " +
                            cabecalho.getNa_salesString() + " " +
                            cabecalho.getEu_salesString() + " " +
                            cabecalho.getJp_salesString() + " " +
                            cabecalho.getOther_salesString() + " " +
                            cabecalho.getGlobal_salesString() + " "
            );
            listGames.forEach(l -> {
                System.out.println(
                        l.getRank() + " " +
                                l.getName() + " " +
                                l.getPlatform() + " " +
                                l.getYear() + " " +
                                l.getGenre() + " " +
                                l.getPublisher() + " " +
                                l.getNa_sales() + " " +
                                l.getEu_sales() + " " +
                                l.getJp_sales() + " " +
                                l.getOther_sales() + " " +
                                l.getGlobal_sales() + " "
                );
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listadd(List<Games> listGames, String[] nextRecord) {
        Games aux = new Games(
                Integer.parseInt(nextRecord[0]),
                nextRecord[1],
                nextRecord[2],
                Integer.parseInt(nextRecord[3]),
                nextRecord[4],
                nextRecord[5],
                Double.parseDouble(nextRecord[6]),
                Double.parseDouble(nextRecord[7]),
                Double.parseDouble(nextRecord[8]),
                Double.parseDouble(nextRecord[9]),
                Double.parseDouble(nextRecord[10]));

        listGames.add(aux);
    }
}
