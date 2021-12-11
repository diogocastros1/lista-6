package br.inatel.c206;

import br.inatel.c206.enums.Platforms;
import br.inatel.c206.enums.Publishers;
import br.inatel.c206.utils.CSVUtils;
import br.inatel.c206.utils.ListaGames;
import br.inatel.c206.utils.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selecao = 0;

        Menu.menuInicial();
        selecao = input.nextInt();
        while (selecao != 0) {
            if (selecao == 1) CSVUtils.readDataLineByLine();

            if (selecao == 2) {
                ListaGames.addLista();
                System.out.println("Escolha uma das desenvolvedoras abaixo:");

                for (Publishers dev : Publishers.values()) {
                    System.out.println(dev.ordinal() + ". " + dev.getDescricao());
                }

                selecao = input.nextInt();

                for (Publishers dev : Publishers.values()) {
                    if (selecao == dev.ordinal()) {
                        ListaGames.filtrarDev(dev.getDescricao());

                    }
                }

            }

            if (selecao == 3) {
                ListaGames.addLista();
                System.out.println("Selecione uma das  com o nome da plataforma:");

                for (Platforms plat : Platforms.values()) {
                    System.out.println(plat.ordinal() + ". " + plat.getDescricao());
                }

                selecao = input.nextInt();

                for (Platforms plat : Platforms.values()) {
                    if (selecao == plat.ordinal()) {
                        ListaGames.filtrarPlat(plat.getDescricao());
                    }
                }

            }
            Menu.menuCorrente();
            selecao = input.nextInt();
        }
    }
}
