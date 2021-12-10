package br.inatel.c206;

import br.inatel.c206.enums.Platforms;
import br.inatel.c206.enums.Publishers;
import br.inatel.c206.utils.CSVUtils;
import br.inatel.c206.utils.ListaGames;
import br.inatel.c206.utils.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selecao = 0;

        Menu.menuInicial();
        selecao = input.nextInt();

        if(selecao == 1){
            CSVUtils.readDataLineByLine();
        }

        if(selecao == 2){
            ListaGames.addLista();
            System.out.println("Entre com o nome da desenvolvedora:");
            ListaGames.filtrarPlataforma(input.next());

        }

    }
}
