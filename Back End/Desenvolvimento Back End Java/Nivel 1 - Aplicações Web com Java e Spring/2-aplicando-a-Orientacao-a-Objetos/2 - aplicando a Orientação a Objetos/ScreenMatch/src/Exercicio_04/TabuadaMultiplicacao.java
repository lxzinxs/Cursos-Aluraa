package Exercicio_04;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        for(int i = 0; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println("Tabuada do " + num + " = " + i * num);
        }
    }
}
