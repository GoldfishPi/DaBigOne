package org.timecrafters.team.gfp.leo;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.timecrafters.engine.Engine;

/**
 * Created by t420 on 11/1/2016.
 */

@Autonomous(name = "LEO:Drive", group = "LEO")
public class gfp_LeoEngine extends Engine {
    byte frontRangeSensor = 0;
    byte rightRangeSensor = 1;

    @Override
    public void setProcesses(){
        /*
        * 0 left back
        * 1 right back
        * 2 presser d
        * 3 shooter*/

        processes[0][0] = new gfp_LeoInit(this);
        processes[1][0] = new gfp_LeoDrive(this,0,0.5,processes[0][0]);
        /*processes[1][0] = new gfp_LeoEncoders(this,this.dcBackRight,500.0);
        processes[1][1] = new gfp_LeoEncoders(this,this.dcBackLeft,500.0);
        processes[1][2] = new gfp_LeoDrive(this,this.dcBackRight,0.5,processes[1][0]);
        processes[1][3] = new gfp_LeoDrive(this,dcBackLeft,0.5,processes[1][1]);*/
    }
}
//djslapdk dja0skdnm adjd ffskej aosjd  e  djeoas padi djd apskdmx iwm8mc8 ksim jd apskj pdsiusm aposkidj akiwim iim pid