public class Capgemini {

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        Desafio2 desafio2 = new Desafio2();
        Desafio3 desafio3 = new Desafio3();

        if (args.length == 0){
            //Executa todos os desafios de forma padrão
            System.out.println("Iniciando Desafio 1\n");
            desafio1.prepare();
            desafio1.start();
            System.out.println("\nFim Desafio 1\n");

            System.out.println("Iniciando Desafio 2\n");
            desafio2.prepare();
            desafio2.start();
            System.out.println("\nFim Desafio 2\n");

            System.out.println("Iniciando Desafio 3\n");
            desafio3.prepare();
            desafio3.start();
            System.out.println("\nFim Desafio 3\n");
        }else if(args.length > 3){
            System.err.println("Sintaxe de uso incorreta!");
            System.out.println("Tente utilizar essa sequência: <DesafioX> <String Sem Espaço> <-Detalhes (Opcional)>");
        }
        else {
            switch (args[0].toLowerCase()){
                case "desafio1":
                    if(args.length > 1) desafio1.prepare(args[1]);
                    else desafio1.prepare();
                    desafio1.start();
                    break;
                case "desafio2":
                    if(args.length > 1) desafio2.prepare(args[1]);
                    else desafio2.prepare();
                    desafio2.start();
                    break;
                case "desafio3":
                    if(args.length == 2) {
                        desafio3.prepare(args[1]);
                    }
                    else if(args.length > 2){
                        desafio3.prepare(args[1], args[2]);
                    }
                    else {
                        desafio3.prepare();
                    }
                    desafio3.start();
                    break;
                default:
                    System.out.println("Desafio não encontrado!");
                    System.out.println("Os desafios disponiveis são:");
                    System.out.println("Desafio1");
                    System.out.println("Desafio2");
                    System.out.println("Desafio3");
            }
        }
    }
}
