package com.moalli.desafiocapgemini.questoes;

// Questão 1 - Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
// A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

public class QuestaoUm {

    static public void printSteps(int n) {
        if(n <= 0) {
            System.out.println("Please, insert a number bigger than zero");
        } else {
            String step = "*";
            String spacing = "";
            for(int i = 1; i <= n; i++) {
                while(spacing.length() < (n-i)) {
                    spacing = spacing.concat(" ");
                }
                System.out.println(spacing + step);
                step = step.concat("*");
                spacing = "";
            }
        }
    }
}

