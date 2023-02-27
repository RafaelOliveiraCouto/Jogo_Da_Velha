package Exercicio_02;

import java.util.Scanner;

public class Jogo_Da_Velha {
    Scanner ler = new Scanner(System.in);
    private final char [][] ma = new char[3][3];
    private final int [] VetA = new int[3];
    private final int [] VetB = new int[3];
    public int A1 = 1;
    public int A2 = 1;
    public int A3 = 1;
    public int A4 = 1;

    public Jogo_Da_Velha() {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = '0';
            }
            VetA[i] = i + 1;
            VetB[i] = i + 1;
        }

        for (int i = 0; i < VetA.length; i++) {
            System.out.print("\t " + VetA[i]);
        }
        System.out.println("");
        for (int i = 0; i < ma.length; i++) {
            System.out.print(VetB[i]);
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print("\t|" + ma[i][j] + "|");
            }
            System.out.println("");
            System.out.println("\t-----------");
        }
        System.out.println("\n");
    }

    public void mostrarM(char [][]ma) {

        for (int i = 0; i < ma.length; i++) {
            VetA[i] = i + 1;
            VetB[i] = i + 1;
        }

        for (int i = 0; i < VetA.length; i++) {
            System.out.print("\t " + VetA[i]);
        }
        System.out.println("");
        for (int i = 0; i < ma.length; i++) {
            System.out.print(VetB[i]);
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print("\t|" + ma[i][j] + "|");
            }
            System.out.println("");
            System.out.println("\t-----------");
        }
    }

    public boolean comecar(char [][]ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                if (ma[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean parar(char [][]ma){
        if (ma[0][0] == 'X' && ma[1][1] == 'X' && ma[2][2] == 'X' ||
            ma[0][0] == 'O' && ma[1][1] == 'O' && ma[2][2] == 'O'){
            return true;
        }else if (ma[2][0] == 'X' && ma[1][1] == 'X' && ma[0][2] == 'X' ||
                  ma[2][0] == 'O' && ma[1][1] == 'O' && ma[0][2] == 'O'){
            return true;
        }else if (ma[0][0] == 'X' && ma[0][1] == 'X' && ma[0][2] == 'X' ||
                  ma[0][0] == 'O' && ma[0][1] == 'O' && ma[0][2] == 'O'){
            return true;
        }else if (ma[1][0] == 'X' && ma[1][1] == 'X' && ma[1][2] == 'X' ||
                  ma[1][0] == 'O' && ma[1][1] == 'O' && ma[1][2] == 'O'){
            return true;
        }else if (ma[2][0] == 'X' && ma[2][1] == 'X' && ma[2][2] == 'X' ||
                  ma[2][0] == 'O' && ma[2][1] == 'O' && ma[2][2] == 'O'){
            return true;
        }else if (ma[0][2] == 'X' && ma[1][2] == 'X' && ma[2][2] == 'X' ||
                  ma[0][2] == 'O' && ma[1][2] == 'O' && ma[2][2] == 'O'){
            return true;
        }else if (ma[0][1] == 'X' && ma[1][1] == 'X' && ma[2][1] == 'X' ||
                  ma[0][1] == 'O' && ma[1][1] == 'O' && ma[2][1] == 'O'){
            return true;
        }else if (ma[0][0] == 'X' && ma[1][0] == 'X' && ma[2][0] == 'X' ||
                  ma[0][0] == 'O' && ma[1][0] == 'O' && ma[2][0] == 'O'){
            return true;
        }else
            return false;
    }

    public void player1(char [][]ma){
        System.out.println("Jogador 1, digite o numero da linha e da coluna desejada para alterar seu valor para X: ");
        System.out.print("Digite o numero da linha desejada: ");
        A1 = ler.nextInt();
        int x = A1 - 1;
        System.out.print("Digite o numero da coluna desejada: ");
        A2 = ler.nextInt();
        int y = A2 - 1;
        if (x > 3 || x < 0 &&
                y > 3 || y < 0) {
            System.out.println("Linha ou Coluna não existentes. Favor preencher novamente:\n");
        }
        if (ma[x][y] == ' ') {
            ma[x][y] = 'X';
        } else {
            System.out.println("Não é permitido sobreescrever. Favor preencher novamente:\n");
        }
    }

    public void player2(char [][]ma){
        System.out.println("Jogador 2, digite o numero da linha e da coluna desejada para alterar seu valor para O: ");
        System.out.print("Digite o numero da linha desejada: ");
        A3 = ler.nextInt();
        int x = A3 - 1;
        System.out.print("Digite o numero da coluna desejada: ");
        A4 = ler.nextInt();
        int y = A4 - 1;
        if (x > 3 || x < 0 &&
                y > 3 || y < 0) {
            System.out.println("Linha ou Coluna não existentes. Favor preencher novamente:\n");
        }
        if (ma[x][y] == ' ') {
            ma[x][y] = 'O';
        } else {
            System.out.println("Não é permitido sobreescrever. Favor preencher novamente:\n");
        }
    }

    public boolean empate(char [][]ma){
        if (ma[0][0] != ' ' &&
            ma[0][1] != ' ' &&
            ma[0][2] != ' ' &&
            ma[1][0] != ' ' &&
            ma[1][1] != ' ' &&
            ma[1][2] != ' ' &&
            ma[2][0] != ' ' &&
            ma[2][1] != ' ' &&
            ma[2][2] != ' '){
            return true;
        }else
            return false;
    }


    public void conferir_vitoria(char [][]ma){
        System.out.println("");
        if (ma[0][0] == 'X' && ma[1][1] == 'X' && ma[2][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[2][0] == 'X' && ma[1][1] == 'X' && ma[0][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[0][0] == 'X' && ma[0][1] == 'X' && ma[0][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[1][0] == 'X' && ma[1][1] == 'X' && ma[1][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[2][0] == 'X' && ma[2][1] == 'X' && ma[2][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[0][2] == 'X' && ma[1][2] == 'X' && ma[2][2] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[0][1] == 'X' && ma[1][1] == 'X' && ma[2][1] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }else if (ma[0][0] == 'X' && ma[1][0] == 'X' && ma[2][0] == 'X'){
            System.out.println("------ Vitoria do player1!!! ------");
        }

        else if (ma[0][0] == 'O' && ma[1][1] == 'O' && ma[2][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[2][0] == 'O' && ma[1][1] == 'O' && ma[0][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[0][0] == 'O' && ma[0][1] == 'O' && ma[0][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[1][0] == 'O' && ma[1][1] == 'O' && ma[1][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[2][0] == 'O' && ma[2][1] == 'O' && ma[2][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[0][2] == 'O' && ma[1][2] == 'O' && ma[2][2] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[0][1] == 'O' && ma[1][1] == 'O' && ma[2][1] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }else if (ma[0][0] == 'O' && ma[1][0] == 'O' && ma[2][0] == 'O'){
            System.out.println("------ Vitoria do player2!!! ------");
        }

        else{
            System.out.println("------ Empate!!! ------");
        }
    }

    public void jogar(char [][]ma){
        if (comecar(ma)){
            while (parar(ma) == false) {
                player1(ma);
                mostrarM(ma);
                parar(ma);

                if (parar(ma) != false){
                    break;
                }
                if (empate(ma) == true){
                    break;
                }

                player2(ma);
                mostrarM(ma);
                parar(ma);
            }
        }
    }
}
