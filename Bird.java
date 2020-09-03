import java.awt.Image;
import java.awt.event.KeyEvent;

//shuvuu nii undsen uildeliin function 
public class Bird {
    
    //cordinatiin utga ba urgun undur bolon  utga 
    public int x;
    public int y;
    public int width;
    public int height;
    public boolean collision;
    // y tenhleh
    public double yvel;
    public double gravity;

    // button hoorondiin delay
    private int jumpDelay;

    private Image image;
    private Keyboard keyboard;
    
    //baiguulagch function
    public Bird () {
        x = 100;
        y = 200;
        yvel = 0;
        width = 40;
        height = 40;
        gravity = 0.6;
        jumpDelay = 0;
        collision = false;
        keyboard = Keyboard.getInstance();
    }
    // murgult hiisen esehiig shalgah function
    private void checkCollision(){
        //System.out.println(y);
        if(y > 380){
            collision = true;
        }
    }
    
    //shinechleltiig orj irj bui utgaas hamaaran shinechleh function
    public void update () {
        yvel += gravity;

        if (jumpDelay > 0)
            jumpDelay--;

        if (keyboard.isDown(KeyEvent.VK_SPACE) && jumpDelay <= 0) {
            yvel = -10;
            jumpDelay = 10;
        }

        checkCollision();
        if(!collision){
            y += (int)yvel;
        }

            
    }
    //image class iig ashiglan zurgan utgaa awj bui function
    public Image getImage () {

        if (image == null) {
            image = Util.loadImage("assets/bird.png");     
        }
        
        return image;
    }
}
