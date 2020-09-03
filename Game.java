import java.awt.event.KeyEvent;
//game class
public class Game {
    
    public Keyboard keyboard;
    public Bird bird;
    // game iin baiguulagch function
    public Game () {
        
        keyboard = Keyboard.getInstance();
        bird = new Bird();
        
    }

    public void update(){
    	bird.update();
    }
}
