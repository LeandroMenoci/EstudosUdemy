package Excecao.personalizadaA;

import Excecao.Aluno;

public class TesteValidacao {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("", 7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Fim");
    }
}
