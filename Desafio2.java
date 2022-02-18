import java.util.List;
import java.util.Scanner;

public class Desafio2 {
    String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void prepare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = scan.nextLine();
        setSenha(senha);
    }

    public void prepare(String senha) {
        setSenha(senha);
    }

    public void start() {
        // Verifica se tem tamanho mínimo
        int tamanho = senha.length();
        int tamanhoMin = 6;
        boolean hasMinLenght = (tamanho >= tamanhoMin) ? true : false;

        // Verifica se os caracteres atendem requisitos
        boolean hasOneDigit = false;
        boolean hasOneLowerLetter = false;
        boolean hasOneUpperLetter = false;
        String caracteresEspeciais = "!@#$%^&*()-+";
        boolean hasSpecialChar = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) hasOneDigit = true; // Verifica se tem 1 digito
            if (Character.isLowerCase(caractere)) hasOneLowerLetter = true; // Verifica se tem 1 letra minuscula
            if (Character.isUpperCase(caractere)) hasOneUpperLetter = true; // Verifica se tem 1 letra maiuscula
            if (caracteresEspeciais.indexOf(caractere) != -1)
                hasSpecialChar = true; // Verifica se tem 1 caracter especial
        }

        boolean isPasswordSafe = (hasMinLenght && hasOneDigit && hasOneLowerLetter && hasOneUpperLetter && hasSpecialChar);

        if (isPasswordSafe) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca!");

            // Se não tiver tamanho mínimo, mostra quantos caracteres faltam
            if (!hasMinLenght) System.out.println(String.format("Adicione %s caracteres", tamanhoMin - tamanho));
            // Se não tiver um dígito, mostra mensagem para adicionar.
            if (!hasOneDigit) System.out.println("Adicione ao menos 1 dígito númerico!");
            // Se não tiver uma letra minúscula, mostra mensagem para adicionar.
            if (!hasOneLowerLetter) System.out.println("Adicione ao menos 1 letra minúscula!");
            // Se não tiver uma letra maiúscula, mostra mensagem para adicionar.
            if (!hasOneUpperLetter) System.out.println("Adicione ao menos 1 letra maiúscula!");
            // Se não tiver um caractere especial, mostra mensagem para adicionar.
            if (!hasSpecialChar) System.out.println("Adicione ao menos 1 caractere especial!");

        }

    }

    public static void main(String[] args) {
        Desafio2 desafio2 = new Desafio2();
        desafio2.prepare();
        desafio2.start();

    }
}
