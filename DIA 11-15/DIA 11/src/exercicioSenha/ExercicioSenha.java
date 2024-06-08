package exercicioSenha;

import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = leitura.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida.");
        } catch (SenhaInvalidaExeption e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8){
            throw new SenhaInvalidaExeption("A senha deve conter, no mínimo, 8 caracteres");
        }
    }


}
