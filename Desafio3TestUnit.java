import org.junit.Test;
import static org.junit.Assert.*;


public class Desafio3TestUnit {

    public void isAnagramTest(String testarStr1, String testarStr2){
        boolean resultado;
        Desafio3 instanciaTeste = new Desafio3();

        resultado =  instanciaTeste.isAnagram(testarStr1, testarStr2);
        assertEquals(true, resultado);
    }

    public void isQtdRight(String palavraTeste, int qtdEsperada){
        Desafio3 instanciaTeste = new Desafio3();
        instanciaTeste.prepare(palavraTeste);
        instanciaTeste.start();

        assertEquals(qtdEsperada, instanciaTeste.qtdTest);

    }

    @Test
    public void testePalavrasAnagrams(){
        isAnagramTest("esquilo", "loqueis");
        isAnagramTest("esquilo", "eiuslqo");
        isAnagramTest("esquilo", "oesiulq");
        isAnagramTest("esquilo", "queisol");
    }

    @Test
    public void testeQuantidade(){
        isQtdRight("ovo", 2);
        isQtdRight("ifailuhkqq", 3);
    }

}
