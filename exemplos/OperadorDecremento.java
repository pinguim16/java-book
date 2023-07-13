public class OperadorDecremento {

    public static void main(String[] args) {

        int anoAtualPre = 2023;
        //pre-fixado
        int decrementoPreFixado = --anoAtual;
        System.out.println("AnoAtualPre : " + anoAtualPre);
        System.out.println("Decremento Pre Fixado: " + decrementoPreFixado);

        //pos-fixado
        int anoAtualPos = 2023;
        int decrementoPosFixado = anoAtual--;
        System.out.println("AnoAtualPos : " + anoAtualPos);
        System.out.println("Decremento Pos Fixado: " + decrementoPosFixado);

    }
}