import java.awt.Image;
import java.awt.event.KeyEvent;

//backround ajillah function
public class Background {
    //private turuluur Image functiong uu duudaj ugun
    private Image image;
    //baiguulagch funciton
    Background(){
    	
    }
    //image function doo get eer utga awan
    public Image getImage () {

        if (image == null) {
            image = Util.loadImage("assets/bg.png");     
        }
        
        return image;
    }
}
