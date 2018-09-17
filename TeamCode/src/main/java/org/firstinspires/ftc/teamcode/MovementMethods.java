package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


public class MovementMethods extends LinearOpMode{


   // double ServoSpd;
    //double ServoAmt;




    @Override
    public void runOpMode(){
    }




    HardwareFluffy robot       = new HardwareFluffy();
    private ElapsedTime runtime = new ElapsedTime();




    public void Drivetrain(double Left, double Right) {

        robot.leftDrive.setPower(Left);
        robot.rightDrive.setPower(Right);
    }





    public void ServoMove(double servoSpd, double servoAmt){

        if (gamepad1.right_bumper)
             servoAmt += servoSpd;
        else if (gamepad1.left_bumper)
            servoAmt -= servoSpd;
    }





    public void DriveTime(double Left, double Right, int Time, int Step) {
        robot.leftDrive.setPower(Left);
        robot.rightDrive.setPower(Right);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < Time)) {
            telemetry.addData("Path", "Leg", Step, ": %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
    }

/*

    public void ArmMove(double Up, double Down){
        if (gamepad1.y)
            robot.leftArm.setPower(Up);
        else if (gamepad1.a)
            robot.leftArm.setPower(Down);
        else
            robot.leftArm.setPower(0.0);
    }
*/






}

