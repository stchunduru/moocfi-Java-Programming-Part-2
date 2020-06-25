package wormgame.game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;
import java.util.Random;
import wormgame.domain.Piece;



public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        
        addActionListener(this);
        setInitialDelay(2000);
        
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.apple = makeApple();
    }
    
    public Apple makeApple(){
        
        while(true){
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
            if(!this.worm.runsInto(new Piece(apple.getX(), apple.getY()))){
                return apple;
            }
        }
    }
    
    

    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm x){
        this.worm = x;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple x){
        this.apple = x; 
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        worm.move();
        if(this.worm.runsInto(apple)){
            worm.grow();
            apple = makeApple();
        }else if(worm.runsIntoItself()) {
            continues = false;
            super.stop();
        }else if(worm.head().getX() == this.width || worm.head().getX() < 0) {
            continues = false;
            super.stop();
        }else if(worm.head().getY() == this.height || worm.head().getY() < 0) {
            continues = false;
            super.stop();
        }
        
        System.out.println(continues);
        updatable.update();
        
        setDelay(1000/worm.getLength());

    }

}
