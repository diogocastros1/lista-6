package br.inatel.c206;

import br.inatel.c206.enums.Publishers;
import br.inatel.c206.utils.CSVUtils;
import br.inatel.c206.utils.ListaGames;
import br.inatel.c206.utils.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String caminho = "vendas-games.csv";

        Scanner input = new Scanner(System.in);

        Menu.menuInicial();

        if(input.nextInt() == 1){
            CSVUtils.readDataLineByLine(caminho);
        }

        if(input.nextInt() == 2){
            ListaGames.addLista(caminho);
            System.out.println("Entre com o nome da desenvolvedora:");

            ListaGames.filtrarPlataforma(input.next());

        }

    }
}
