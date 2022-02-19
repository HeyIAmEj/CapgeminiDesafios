import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio1 {
    int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static String multiplicaChar(char caractere, int qtd) {
        StringBuilder strRetorno = new StringBuilder();
        for (int x = 0; x < qtd; x++) strRetorno.append(caractere);
        return strRetorno.toString();
    }

    public void prepare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do tamanho da escada: ");
        try {
            int qtd = scan.nextInt();
            if (qtd == 0) {
                throw new Exception();
            }
            setQuantidade(qtd);
        } catch (InputMismatchException e) {
            System.err.println("O tamanho digitado deve ser um número natural!");
        } catch (Exception e) {
            System.out.println("A escada não será exibida pois não tem altura mínima!");
        }
    }

    public void prepare(String qtd) {
        try{
            setQuantidade(Integer.parseInt(qtd));
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("O tamanho digitado deve ser um número natural!");
        }

    }

    public void start() {
            String ast;
            String esp;

            for (int i = 1; i <= quantidade; i++) {
                esp = multiplicaChar(' ', quantidade - i);
                ast = multiplicaChar('*', i);
                System.out.println(esp + ast);
            }

    }

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        desafio1.prepare();
        desafio1.start();

    }
}
