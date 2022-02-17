package com.moalli.desafiocapgemini;

import com.moalli.desafiocapgemini.questoes.QuestaoDois;
import com.moalli.desafiocapgemini.questoes.QuestaoUm;

public class Main {

    public static void main(String[] args) {
        //Questão 1
        System.out.println("Questão 1:");
        QuestaoUm.printSteps(6);
        System.out.println();
        QuestaoUm.printSteps(-2);
        System.out.println();
        QuestaoUm.printSteps(0);
        System.out.println();
        QuestaoUm.printSteps(10);
        System.out.println();
        QuestaoUm.printSteps(1);

        System.out.println();

        //Questão 2
        System.out.println("Questão 2:");
        QuestaoDois.checkPasswordLength("Ya3");
        System.out.println();
        QuestaoDois.checkPasswordLength("AukaIAJMA");
        System.out.println();
        QuestaoDois.checkPasswordLength("");
        System.out.println();
        QuestaoDois.checkPasswordLength("   ");
        System.out.println();
        QuestaoDois.checkPasswordLength("IJjHgT");
    }

}
