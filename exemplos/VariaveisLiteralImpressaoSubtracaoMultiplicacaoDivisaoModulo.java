public class VariaveisLiteralImpressaoSubtracaoMultiplicacaoDivisaoModulo {
    public static void main(String[] args) {

        int anoAtual = 2023;
        int proximoAno = 2024;

        //Adição
        int adicao = proximoAno + 100 + anoAtual;
        System.out.println("Resultado adicao : " + adicao);

        //Subtração
        int subtracao = proximoAno - 100;
        System.out.println("Resultado subtracao : " + subtracao);

        //Multiplicação
        int multiplicacao = anoAtual * 2;
        System.out.println("Resultado multiplicacao : " + multiplicacao);

        //Divisão
        int divisao = anoAtual / 2;
        System.out.println("Resultado divisao : " + divisao);

        //Modulo
        int modulo = 5 / 2;
        System.out.println("Resultado modulo : " + modulo);
    }
}