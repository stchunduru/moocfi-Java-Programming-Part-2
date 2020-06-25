/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

public class Dungeon {
    private Random random = new Random();
    private Scanner reader = new Scanner(System.in);
    private int length;
    private int height;
    private int vampireCount;
    private int movesLeft;
    private boolean vmov;
    private List<Vampire> vlist;
    private Player player;
    
    //Initializes Dungeon variables
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        if(vampires > (height * length) - 1){
            throw new IllegalArgumentException("too many vampires");
        }
        this.length = length;
        this.height = height;
        this.vampireCount = vampires;
        this.movesLeft = moves;
        this.vmov = vampiresMove;
        this.vlist = new ArrayList<Vampire>();
        this.player = new Player(this.height, this.length);

        for(int x = 0; x < vampireCount; x++){
            addVampire();
        }
    }


    public void run(){
        while(movesLeft > 0) {
            
            System.out.println(movesLeft);
            System.out.println();

            System.out.println(this.player);
            vampirePositions();
            System.out.println();
            draw();

            String read = reader.nextLine();
            playerMove(read);

            if(vlist.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }
        }
        if(movesLeft == 0){
            System.out.println("YOU LOSE");
        }
    }


    //Draws vampire positions, player, and board.
    public void draw(){
        for(int x = 0; x < height; x++){
            for(int j = 0; j < length; j++){
                if(x == player.getX() && j == player.getY()){
                    System.out.print("@");
                }else if(vampireExists(x,j)){
                    System.out.print("v");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


    //Reads in player input. Moves vampire after each step. Lowers movesleft once.
    public void playerMove(String move){
        String []moves = move.split("");
        movesLeft-=1;
        for(String m : moves) {
            this.player.move(m);
            playerKill();
            if(this.vmov){
                vampireMoves();
            }
        }
    }

    //Checks if player and vampire occupy same spot. Kills vampire if true;
    public void playerKill(){
        Vampire test = null;
        for(Vampire x : this.vlist){
            if(x.getX() == player.getX() && x.getY() == player.getY()){
                test = new Vampire(height,length,x.getX(),x.getY());
            }
        }
        this.vlist.remove(test);
    }

    //Returns true if vampire exists
    public boolean vampireExists(int a, int b){
        for(Vampire x : this.vlist){
            if(x.getX() == a && x.getY() == b){
                return true;
            }
        }
        return false;
    }

    //Adds a vampire. Makes sure it is not spawned in existing vampire postion
    public void addVampire(){
        while(true) {
            int test = 0;
            Vampire x = new Vampire(height, length);
            if (this.vlist.isEmpty()) {
                this.vlist.add(x);
                break;
            } else {
                for (Vampire vamp : this.vlist) {
                    if (vamp.toString().equals(x.toString())) {
                        test += 1;
                    }
                }
            }
            if (test == 0) {
                this.vlist.add(x);
                break;
            }
        }
    }

    //Displays vampire coordinates
    public void vampirePositions(){
        for(Vampire vamp : this.vlist){
            System.out.println(vamp);
        }
    }

    //Moves vampire. If player or another exists at move, vampire goes back to original spot
    public void vampireMoves() {
        for (Vampire vamp : this.vlist) {
            int holdx = vamp.getX();
            int holdy = vamp.getY();
            vamp.move();
            if (Collections.frequency(this.vlist, vamp) > 1) {
                vamp.setX(holdx);
                vamp.setY(holdy);
            }
            if (vamp.getX() == player.getX() && vamp.getY() == player.getX()) {
                vamp.setX(holdx);
                vamp.setY(holdy);
            }
        }
    }
}
