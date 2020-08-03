
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HCT
 */
public class Buoi4 {
    static Scanner sc = new Scanner(System.in);
    static int PLAYERX, PLAYERY;
    static int ENDX, ENDY;
    static char[][] MAP = new char[5][5];
    
    
    public static void main(String[] args) {
        PLAYERX = 2;
        PLAYERY = 2;
        do {
        ENDX = (int)(Math.random()*4); //random chạy 0 - 1. *4 thiwf giá trị 0 - 4
        ENDY = (int)(Math.random()*4);
        } while (ENDX == PLAYERX && ENDY == PLAYERY);
        
        for (int x=0; x<MAP.length; x++) {
            for (int y=0; y<MAP[0].length; y++) {
                if (x == PLAYERX && y == PLAYERY) {
                    MAP[x][y] = 'x';
                } else if (x == ENDX && y == ENDY) {
                    MAP[x][y] = 'o';
                } else {
                    MAP[x][y] = '-';
                }           
            }
        } 
        while (true) {
            loadMap();
            char input = input();
            System.out.println("Nguoi dung nhap: " + input);
            move(input);
            check();
        }
    }
    private static void loadMap() {
        for (int x=0; x<MAP.length; x++) {
            for (int y=0; y<MAP[0].length; y++) {
                System.out.print(MAP[x][y] + " ");
            }
            System.out.println();          
        }
    }

    private static void move(char input) {
        switch (input) {
            case 'W': 
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERX = (PLAYERX + 1)%5;
                MAP[PLAYERX][PLAYERY]='x';
                break;
            case 'S': 
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERX = (PLAYERX-1+5)%5;
                MAP[PLAYERX][PLAYERY]='x';
                break;
            case 'A': 
                if (PLAYERY == 0) {
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERY = 4;
                MAP[PLAYERX][PLAYERY]='x';
                } else {
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERY--;
                MAP[PLAYERX][PLAYERY]='x';
                }
                break;
            case 'D': 
                MAP[PLAYERX][PLAYERY]='-';
                PLAYERY = (PLAYERY+1)%5;
                MAP[PLAYERX][PLAYERY]='x';
                break;
        }
    }
    private static void check() {
       
    }
    private static char input() {
        System.out.println("Nhap vao WASD: ");
        String value = sc.nextLine(); //nextLine: nhập xong xuống dòng
        return value.charAt(0);
    }
    
           
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
