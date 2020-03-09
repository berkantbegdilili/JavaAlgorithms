package bb_projects;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/***
 *      _             ____  ____  
 *     | |           |  _ \|  _ \ 
 *     | |__  _   _  | |_) | |_) |
 *     | '_ \| | | | |  _ <|  _ < 
 *     | |_) | |_| | | |_) | |_) |
 *     |_.__/ \__, | |____/|____/ 
 *             __/ |              
 *            |___/               
 */

/**
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    static String[] board;
    static String turn;
    
    public static void main(String[] args) {
        board = new String[9];
        turn = "X";
        String winner = null;
        emptyBoard();
        System.out.println("2 Oyunculu XOX Oyununa Hosgeldiniz!");
        System.out.println("---------------------------------------");
        printBoard();
        System.out.print("Oyun X Oyuncusu Ile Baslicaktir. X Yerlestirmek Icin Bir Numara Giriniz: ");
        
        while(winner == null){
            byte input = scanner.nextByte();
            
            try{
               if(!(input<10 && input>0)){
                    System.out.print("Gecersiz Giris; Tekrar Numara Giriniz: ");
                    continue;
               }
            } catch(InputMismatchException e){
                System.out.print("Gecersiz Giris; Tekrar Numara Giriniz: ");
                continue;
            }
            
            if(board[input-1].equals(String.valueOf(input))){
                board[input-1] = turn;
                if(turn.equals("X")){
                    turn = "O";
                } else{
                    turn = "X";
                }
                printBoard();
                winner = control();
            } else{
                System.out.print("Numara Dolu; Tekrar Numara Giriniz: ");
            }
        }
        
        if(winner.equalsIgnoreCase("draw")){
            System.out.println("      ____  _____ ____      _    ____  _____ ____  _     ___ _  __");
            System.out.println("     | __ )| ____|  _ \\    / \\  | __ )| ____|  _ \\| |   |_ _| |/ /");
            System.out.println("     |  _ \\|  _| | |_) |  / _ \\ |  _ \\|  _| | |_) | |    | || ' /");
            System.out.println("     | |_) | |___|  _ <  / ___ \\| |_) | |___|  _ <| |___ | || . \\");
            System.out.println("     |____/|_____|_| \\_\\/_/   \\_\\____/|_____|_| \\_\\_____|___|_|\\_\\");
        } else{
            System.out.println("Oyunu "+winner+" Kazandi. TEBRIKLER!");
        }
    }
    
    static void emptyBoard(){
        for(int i=0 ; i<9 ; i++)
            board[i] = String.valueOf(i+1);
    }
    
    static void printBoard(){
        System.out.println("\t\t\t_             ____  ____  ");
        System.out.println("/ --- | --- | --- \\    | |           |  _ \\|  _ \\ ");
        System.out.println("|  "+ board[0] +"  |  "+ board[1] + "  |  "+ board[2] +"  |    | |__  _   _  | |_) | |_) |");
        System.out.println("| --- | --- | --- |    | '_ \\| | | | |  _ <|  _ <");
        System.out.println("|  "+ board[3] +"  |  "+ board[4] + "  |  "+ board[5] +"  |    | |_) | |_| | | |_) | |_) |");
        System.out.println("| --- | --- | --- |    |_.__/ \\__, | |____/|____/ ");
        System.out.println("|  "+ board[6] +"  |  "+ board[7] + "  |  "+ board[8] +"  |            __/ |");
        System.out.println("\\ --- | --- | --- /           |___/");
    }
    
    static String control(){
        for(int i=0 ; i<8 ; i++){
            String place = null;
            
            switch(i){
                case 0:
                    place = board[0] + board[1] + board[2];
                    break;
                case 1:
                    place = board[3] + board[4] + board[5];
                    break;
                case 2:
                    place = board[6] + board[7] + board[8];
                    break;
                case 3:
                    place = board[0] + board[3] + board[6];
                    break;
                case 4:
                    place = board[1] + board[4] + board[7];
                    break;
                case 5:
                    place = board[2] + board[5] + board[8];
                    break;
                case 6:
                    place = board[0] + board[4] + board[8];
                    break;
                case 7:
                    place = board[2] + board[4] + board[6];
                    break;
            }
            
            if(place.equals("XXX")){
                return "X";
            } else if(place.equals("OOO")){
                return "O";
            }
        }
        
        for(int i=0 ; i<9 ; i++){
            if(Arrays.asList(board).contains(String.valueOf(i+1))){
                break;
            } else if(i==8){
                return "DRAW";
            }
        }
        
        System.out.print("SIRA "+turn+"; "+turn+" Yerlestirmek Icin Bir Numara Giriniz: ");
        return null;
    }
}