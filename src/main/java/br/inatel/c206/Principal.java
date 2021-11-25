package br.inatel.c206;

import br.inatel.c206.utils.CSVUtils;

public class Principal {
    public static void main(String[] args) {
        CSVUtils.readDataLineByLine("vendas-games.csv");
    }
}
