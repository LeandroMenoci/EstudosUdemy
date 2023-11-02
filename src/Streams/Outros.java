package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Denis", 9.1);
        Aluno a6 = new Aluno("Lia", 8.7);
        Aluno a7 = new Aluno("Fer", 5.6);
        Aluno a8 = new Aluno("Fer", 5.6);
        Aluno a9 = new Aluno("Jose", 7);
        Aluno a10 = new Aluno("Jose", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

        System.out.println("Distinct....");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit...");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile...");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7) // enquanto a condição for verdadeira, ele continuará rodando
                .forEach(System.out::println);

    }
}
