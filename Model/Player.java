package RPS.Model;

import java.util.Scanner;

public class Player {

    Scanner scan;
    private String janken1, janken2;

    public Player() {
      this.scan = new Scanner(System.in);
    }

    public String getJanken(){
        return janken1;
    }

    public void generateJanken(){
        String s = scan.next();
        this.janken1 = s;
    }



    public String getJankenCOM(){
        return janken2;
    }

    public void generateJankenCOM(){
        int n = (int)(3 * Math.random());

        if(n == 0){
            janken2 = "P";
        }else if (n == 1){
            janken2 = "T";
        }else if(n == 2){
            janken2 = "G";
        }
    }

    public String getSelect(){
       
        return scan.next();
    }
}
