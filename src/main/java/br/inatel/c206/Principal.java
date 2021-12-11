package br.inatel.c206;

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
        while (selecao != 0) {
            if (selecao == 1) {
                CSVUtils.readDataLineByLine();
            }

            if (selecao == 2) {
                ListaGames.addLista();
                System.out.println("Entre com o nome da Desenvolvedora:");
                ListaGames.filtrarDev(input.next());
            }

            if (selecao == 3) {
                ListaGames.addLista();
                System.out.println("Entre com o nome da plataforma:");
                ListaGames.filtrarPlat(input.next());
            }
            Menu.menuCorrente();
            selecao = input.nextInt();
        }
    }
}
