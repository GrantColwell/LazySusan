package ca._4976.steamworks.subsystems;

import ca._4976.library.AsynchronousRobot;
import ca._4976.library.listeners.ButtonListener;
import ca._4976.steamworks.Robot;
import edu.wpi.first.wpilibj.*;

/**
 * Created by Grant on 2/2/2017.
 */
public class LazySusan extends AsynchronousRobot{
    int midura = 1;          //midura is a placeholder for midura's ready, searching or failed variable
    public LazySusan(Robot module){
        //call midura's code
        module.driver.A.addListener(new ButtonListener() {
            @Override
            public void pressed() {
                super.pressed();
                if(midura == 0) {
                    for(int i = 0; i < 3; i++) {    //buzz's remote 3 times
                        stick.setRumble(GenericHID.RumbleType.kLeftRumble, 1);
                        stick.setRumble(GenericHID.RumbleType.kRightRumble, 1);
                        
                    }
                }
            }
        });
    }
}