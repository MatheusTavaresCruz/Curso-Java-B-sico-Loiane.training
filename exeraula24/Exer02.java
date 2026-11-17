package com.loiane.cursojava.exeraula24;

public class Exer02 {
    public static void main(String[] args) {

        Book book = new Book();

        book.name = "Fundamentos de Engenharia de Dados";
        book.character = "Desenvolvedor";
        book.genre = "Aprendizado de Tecnologia";
        book.language = "Portugues";
        book.numberOfPage = 527;

        book.namesAuthors = new String[2];

        book.namesAuthors [0]= "Joe Reis";
        book.namesAuthors [1]= "Matt Housley";

        System.out.println(book.character);
        System.out.println(book.name);
        System.out.println(book.namesAuthors[0]);
        System.out.println(book.namesAuthors[1]);
        System.out.println(book.language);
        System.out.println(book.numberOfPage);
        System.out.println(book.genre);
    }
}
