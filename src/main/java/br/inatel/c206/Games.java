package br.inatel.c206;

import lombok.Data;

@Data
public class Games {
    private int rank;
    private String rankString;
    private String name;
    private String platform;
    private int year;
    private String yearString;
    private String genre;
    private String publisher;
    private double na_sales;
    private String na_salesString;
    private double eu_sales;
    private String eu_salesString;
    private double jp_sales;
    private String jp_salesString;
    private double other_sales;
    private String other_salesString;
    private double global_sales;
    private String global_salesString;

    public Games(int rank, String name, String platform, int year, String genre, String publisher, double na_sales, double eu_sales, double jp_sales, double other_sales, double global_sales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;
    }

    public Games(String rankString, String name, String platform, String yearString, String genre, String publisher, String na_salesString, String eu_salesString, String jp_salesString, String other_salesString, String global_salesString) {
        this.rankString = rankString;
        this.name = name;
        this.platform = platform;
        this.yearString = yearString;
        this.genre = genre;
        this.publisher = publisher;
        this.na_salesString = na_salesString;
        this.eu_salesString = eu_salesString;
        this.jp_salesString = jp_salesString;
        this.other_salesString = other_salesString;
        this.global_salesString = global_salesString;
    }
}
