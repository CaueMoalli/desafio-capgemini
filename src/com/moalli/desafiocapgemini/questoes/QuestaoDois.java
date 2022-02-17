package com.moalli.desafiocapgemini.questoes;

// Questão 2 - Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro
// exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.

public class QuestaoDois {
    static public void checkPasswordLength(String password){
        final int PASSWORDREQUIREDLENGHT = 6;
        password = password.replace(" ", ""); //This avoids people entering 6 blank spaces as password
        if (password.length() < PASSWORDREQUIREDLENGHT) {
            System.out.println((PASSWORDREQUIREDLENGHT - password.length()));
        } else {
            System.out.println("""
                    Your password has the minimum required length.
                    If the system still does not accept your password, check if it meets the following additional requirements:
                    1) Contain at least 1 digit;
                    2) Contain at least 1 upper case letter;
                    3) Contain at least 1 lower case letter;
                    4) Contain at least 1 special character !@#$%^&*()-+""");
        }
    }
}
