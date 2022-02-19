import java.util.*;

public class Desafio3 {
    String palavra;
    String extra;

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setExtra(String extra) {
        this.extra = extra.toLowerCase();
    }

    public static boolean isAnagram(String s1, String s2) {
        //se as duas strings não tem o mesmo tamanho, não é anagrama
        if ( s1.length() != s2.length() ) {
            return false;
        }
        //transfroma em arrays para poder ordenar
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        //ordena para garantir a comparação simplificada
        Arrays.sort(c1);
        Arrays.sort(c2);
        //cria as novas strings baseadas nos arrays ordenados
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }

    public void prepare(String palavra) {
        setPalavra(palavra);
        setExtra("");
    }

    public void prepare(String palavra, String extra) {
        setPalavra(palavra);
        setExtra(extra);
    }

    public void prepare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavraAnagrama = scan.next();
        setPalavra(palavraAnagrama);
        setExtra("");
    }

    public void start() {
        ArrayList<String> anagramasParesWithout = new ArrayList();
        ArrayList<String> anagramasParesWith = new ArrayList();

        ArrayList<String> combinacoesParaTestar = new ArrayList();

        for (int x=0;x<palavra.length();x++){
            for (int y=0;y<=palavra.length();y++){
                if(!(x>y) && (x!=y)){
                    String content = palavra.substring(x, y);
                    combinacoesParaTestar.add(content);
                }
            }
        }

        int conteudo1Index = 0;
        for(String conteudo1 : combinacoesParaTestar) {
            int conteudo2Index = 0;
            for (String conteudo2 : combinacoesParaTestar) {
                if (isAnagram(conteudo1, conteudo2) && (conteudo1Index != conteudo2Index)){
                    String detalhes1 = String.format("[%s, %s]", conteudo1, conteudo2);
                    String detalhes2 = String.format("[%s, %s]", conteudo2, conteudo1);

                    // ISSUE REPORTADO POR EMAIL

                    //Não conta repetidos...
                    if(!(anagramasParesWithout.contains(detalhes1) || anagramasParesWithout.contains(detalhes2))){
                        anagramasParesWithout.add(detalhes1);
                    }

                    //Conta repetidos...
                    if(!(anagramasParesWith.contains(detalhes1))){
                        anagramasParesWith.add(detalhes1);
                    }
                }
                conteudo2Index += 1;
            }
            conteudo1Index += 1;
        }

        if(extra.equals("-detalhes")) {
            System.out.println("Detalhes para anagramas sem repetição");
            System.out.println("Quantidade de Anagramas Pares sem repetição: " + anagramasParesWithout.size());

            //Exibir a lista sem repetição
            for (String item : anagramasParesWithout) System.out.println(item);

            System.out.println();

            System.out.println("Detalhes para anagramas com repetição");
            System.out.println("Quantidade de Anagramas Pares com repetição: " + anagramasParesWith.size());
            //Exibir a lista com repetição
            for (String item : anagramasParesWith) System.out.println(item);
        }else{

            // Levando em consideração o ISSUE #1, o retorno de saída deve exibir os Anagramas Pares sem repetição.

            System.out.println("Anagramas Pares: " + anagramasParesWithout.size());
        }
    }

    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();
        desafio3.prepare();
        desafio3.start();

    }

}
