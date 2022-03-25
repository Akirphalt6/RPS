package RPS.Controller;
import RPS.Model.Player;

public class GameController {

    Player player = new Player();
    
    public void start(){
        // janken starts!!!
        System.out.println("Let's play");
        System.out.println("Please input P, T or G");

        boolean isGameNotOver = true;
        while(isGameNotOver){
            player.generateJanken();
            player.generateJankenCOM();

          
            this.selectCommand();

            boolean isDraw = player.getJankenCOM() .equalsIgnoreCase(player.getJanken());
            if(isDraw){
                System.out.println("please input P(パー), T(チョキ) or G(グー)");
                System.out.println("enemy: " + player.getJankenCOM());
            }else if(!isDraw){
                fight();
                isGameNotOver = false;
            }       
        }

        boolean wantToPlayAgain = tryAgain();
        if(wantToPlayAgain){
            this.start();
        } else{
            System.out.println("Thanks for playing janken game!!!!");

        }
    }
    
    public void fight(){
        Player data = this.player;
        if(data.getJanken().equalsIgnoreCase("P") && data.getJankenCOM().equals("T")){
            System.out.println("YOU LOSE");
        }else if(data.getJanken().equalsIgnoreCase("T") && data.getJankenCOM().equals("G")){
            System.out.println("YOU LOSE");
        }else if(data.getJanken().equalsIgnoreCase("G") && data.getJankenCOM().equals("P")){
            System.out.println("YOU LOSE");
        }else if(data.getJanken().equalsIgnoreCase("T") && data.getJankenCOM().equals("P")){
            System.out.println("YOU WIN");
        }else if(data.getJanken().equalsIgnoreCase("P") && data.getJankenCOM().equals("G")){
            System.out.println("YOU WIN");
        }else if(data.getJanken().equalsIgnoreCase("G") && data.getJankenCOM().equals("T")){
            System.out.println("YOU WIN");
        }
        System.out.println("enemy: " + data.getJankenCOM());
        System.out.println("--------------------------------");
        
    } 

    public boolean tryAgain() {

        System.out.println("Do you want to play the game again?   y/n");

        boolean isEnteredNotCorrectly = false;
        while(!isEnteredNotCorrectly){
            String input = this.player.getSelect();
            if(input.equalsIgnoreCase("y")){
                isEnteredNotCorrectly = true;
                return true;
            }else if(input.equalsIgnoreCase("n")){
                isEnteredNotCorrectly = true;
                System.out.println("Finished game");
            }else{
                System.out.println("Please input y/n");
                continue;
            }
       
        }
    return false;
    }


    public boolean selectCommand(){

        while(true){

            if(player.getJanken().equalsIgnoreCase("P")){
                return true;
            }else if(player.getJanken().equalsIgnoreCase("T")){
                return true;
            }else if(player.getJanken().equalsIgnoreCase("G")){
                return true;
            }else{
                System.out.println("Please input P,T or G again!!!");
                player.generateJanken();
                continue;
            }

        }
    }

}
