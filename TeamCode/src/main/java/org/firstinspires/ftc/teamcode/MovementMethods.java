package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

public class MovementMethods{


    HardwareFluffy robot       = new HardwareFluffy();
    private ElapsedTime runtime = new ElapsedTime();




    public void Drivetrain(double Left, double Right) {

        robot.leftDrive.setPower(Left);
        robot.rightDrive.setPower(Right);
    }









}

