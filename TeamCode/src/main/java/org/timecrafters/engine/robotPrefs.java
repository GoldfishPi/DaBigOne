package org.timecrafters.engine;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.I2cDevice;
import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorMRRangeSensor;

/**
 * Created by t420 on 9/29/2016.
 */

//Setup robot prefrance

public abstract class RobotPrefs extends OpMode {

    public volatile DeviceInterfaceModule deviceInterfaceModule;

    public volatile ColorSensor colorSensorRight;
    public volatile ColorSensor colorSensorLeft;

    public volatile DcMotor dcBackLeft;
    public volatile DcMotor dcBackRight;
    public volatile DcMotor dcShooter;
    public volatile DcMotor dcPresser;

    public volatile I2cDevice distanceSensorFront;
    public volatile I2cDevice distanceSensorRight;

    public volatile I2cDeviceSynch dsFrontReader;
    public volatile I2cDeviceSynch dsRightReader;

    public volatile TouchSensor touchSensor;

    //TODO organise servos
    public volatile Servo servoOne;
    public volatile Servo servoTwo;


}