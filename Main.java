package Exercicio_02;

//Não entendi muito bem como funciona a enumeração em java, por isso fiz de uma outra forma.
public class Main {
    public static void main(String[] args){
        char Ma[][] = new char[3][3];
        for (int i = 0; i < Ma.length; i++) {
            for (int j = 0; j < Ma[i].length; j++) {
                Ma[i][j] = ' ';
            }
        }

        Jogo_Da_Velha play = new Jogo_Da_Velha();

        play.mostrarM(Ma);
        play.comecar(Ma);
        play.jogar(Ma);
        play.conferir_vitoria(Ma);
    }
}

