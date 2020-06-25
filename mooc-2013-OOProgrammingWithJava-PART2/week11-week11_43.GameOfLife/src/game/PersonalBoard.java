/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Cruzer
 */
public class PersonalBoard extends GameOfLifeBoard{
    private Random random = new Random();
    
    public PersonalBoard(int w, int h){
        super(w, h);
        
    }
    
    public void initiateRandomCells(double arg0){
        for(int x = 0; x < super.getWidth(); x++){
            for(int j = 0; j < super.getHeight(); j++){
                if (new Random().nextDouble() < arg0) {
                    turnToLiving(x, j);
                }
            }
        }
    }
    

    public boolean isAlive(int arg0, int arg1){
        if((arg0 > super.getWidth()-1 || arg1 > super.getHeight()-1) || (arg0 < 0 || arg1 < 0)){
            return false;
        }else{
            return super.getBoard()[arg0][arg1];
        }
    }

    public void turnToLiving(int arg0, int arg1){
        if(arg0 <= super.getWidth()-1 && arg1 <= super.getHeight()-1 && arg0 >= 0 && arg1 >= 0){
            super.getBoard()[arg0][arg1] = true;
        }
    }

    public void turnToDead(int arg0, int arg1){
        if(arg0 <= super.getWidth()-1 && arg1 <= super.getHeight()-1 && arg0 >= 0 && arg1 >= 0){
            super.getBoard()[arg0][arg1] = false;
        }
    }
    
    public int getNumberOfLivingNeighbours(int arg0, int arg1){
        int count = 0;
        
        //top left
        if(arg0 == 0 && arg1 == 0){
            for(int x = 0; x <= 1; x++){
                if(super.getBoard()[x][0] == true){
                    count += 1;
                }
                if(super.getBoard()[x][1] == true){
                    count += 1;
                }
            }
        }
        
        //top right
        if(arg0 == super.getWidth()-1 && arg1 == 0){
            for(int x = super.getWidth()-2; x <= super.getWidth()-1; x++){
                if(super.getBoard()[x][0] == true){
                    count += 1;
                }
                if(super.getBoard()[x][1] == true){
                    count += 1;
                }
            }
        }
        
        //bottom left
        if(arg0 == 0 && arg1 == super.getHeight()-1){
            for(int x = 0; x <= 1; x++){
                if(super.getBoard()[x][super.getHeight()-1] == true){
                    count += 1;
                }
                if(super.getBoard()[x][super.getHeight()-2] == true){
                    count += 1;
                }
            }
        }
        
        //bottom right
        if(arg0 == super.getWidth()-1 && arg1 == super.getHeight()-1){
            for(int x = super.getWidth()-2; x <= super.getWidth()-1; x++){
                if(super.getBoard()[x][super.getHeight()-1]){
                    count += 1;
                }
                if(super.getBoard()[x][super.getHeight()-2]){
                    count += 1;
                }
            }
        }
        
        //top line
        if(arg0 > 0 && arg0 < super.getWidth() - 1 && arg1 == 0){
            for(int x = arg0-1; x <= arg0+1; x++){
                if(super.getBoard()[x][0]){
                    count += 1;
                }
                if(super.getBoard()[x][1]){
                    count += 1;
                }
            }
        }
        
        //left line
        if(arg0 == 0 && arg1 < super.getHeight()-1 && arg1 > 0){
            for(int x = arg1-1; x <= arg1+1; x++){
                if(super.getBoard()[0][x]){
                    count += 1;
                }
                if(super.getBoard()[1][x]){
                    count += 1;
                }
            }
        }
        
        //right line
        if(arg0 == super.getWidth() - 1 && arg1 < super.getHeight()-1 && arg1 > 0){
            for(int x = arg1-1; x<= arg1+1; x++){
                if(super.getBoard()[arg0][x]){
                    count += 1;
                }
                if(super.getBoard()[arg0-1][x]){
                    count += 1;
                }
                
            }
        }
        
        //bottom line
        if(arg0 > 0 && arg0 < super.getWidth()-1 && arg1 == super.getHeight()-1){
            for(int x = arg0-1; x <= arg0+1; x++){
                if(super.getBoard()[x][arg1]){
                    count += 1;
                }
                if(super.getBoard()[x][arg1-1]){
                    count += 1;
                }
            }
        }
        // all else
        if(arg0 > 0 && arg0 < super.getWidth()-1 && arg1 > 0 && arg1 < super.getHeight() -1){
            for(int x = arg0-1; x <= arg0+1; x++){
                if(super.getBoard()[x][arg1]){
                    count += 1;
                }
                if(super.getBoard()[x][arg1-1]){
                    count += 1;
                }
                if(super.getBoard()[x][arg1+1]){
                    count += 1;
                }
            }
        }
 
        if(super.getBoard()[arg0][arg1]){
            return count - 1;
        }else{
            return count;
        }
    }

    public void manageCell(int arg0, int arg1, int arg2){
        if(arg2 < 2){
            super.getBoard()[arg0][arg1] = false;
        }
        if(arg2 >= 3){
            super.getBoard()[arg0][arg1] = false;
        }
        if(super.getBoard()[arg0][arg1] && (arg2 == 2 || arg2 == 3)){
            super.getBoard()[arg0][arg1] = true;
        }
        if(!(super.getBoard()[arg0][arg1]) && arg2 == 3){
            super.getBoard()[arg0][arg1] = true;
        }
    }
    
}
