package org.firstinspires.ftc.teamcode;
// ethan is a monkey
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
// ethan is a monkey
import org.firstinspires.ftc.teamcode.helperClasses.RobotHardware;

// ethan is a monkey
@Autonomous
public class CWEasyAutoTopRed extends LinearOpMode {
    // ethan is a monkey
    public void runOpMode() throws InterruptedException {
// ethan is a monkey
// ethan is a monkey
        RobotHardware robot = new RobotHardware();
        robot.init(hardwareMap);
        waitForStart();
        if (opModeIsActive()){
            robot.frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
// setting power
            robot.frontLeft.setPower(0.5);
            robot.frontRight.setPower(0.5);
            robot.backLeft.setPower(0.5);
            robot.backRight.setPower(0.5);
// strafe right
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(-21));
            robot.frontRight.setTargetPosition((int) robot.inchesToTicks(21));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(21));
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(-21));
// go forward
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
            while (robot.frontLeft.getCurrentPosition() > robot.frontLeft.getTargetPosition()){
                telemetry.addData("suck big", robot.frontLeft.getCurrentPosition());
                telemetry.addData("balls", robot.frontLeft.getTargetPosition());

                telemetry.update();
            }

            robot.clawMarcos(RobotHardware.Marcos.ROW3POS);
            robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

//lower claw
            while (robot.clawArm.getCurrentPosition() < robot.clawArm.getTargetPosition()) {
                telemetry.addData("Bigger", robot.clawArm.getCurrentPosition());
                telemetry.addData("Stronger", robot.clawArm.getTargetPosition());

                telemetry.update();
            }
            robot.frontLeft.setPower(0);
            robot.frontRight.setPower(0);
            robot.backLeft.setPower(0);
            robot.backRight.setPower(0);
// ethan is a monkey
            robot.frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
// ethan is a monkey
            robot.frontLeft.setPower(0.5);
            robot.frontRight.setPower(0.5);
            robot.backLeft.setPower(0.5);
            robot.backRight.setPower(0.5);
// ethan is a monkey
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(22));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(22));
            robot.frontRight.setTargetPosition((int)robot.inchesToTicks(22));
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(22));
// ethan is a monkey
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            while (robot.frontLeft.getCurrentPosition() < robot.frontLeft.getTargetPosition()){
                telemetry.addData("your mother", robot.frontLeft.getCurrentPosition());
                telemetry.addData("last night", robot.frontLeft.getTargetPosition());
                telemetry.update();
            }

            robot.leftClaw.setPosition(RobotHardware.ClawPos.LEFT_OPEN);
            robot.rightClaw.setPosition(RobotHardware.ClawPos.RIGHT_OPEN);

            sleep(2300);

            robot.clawArm.setPower(0.2);
            robot.clawArm.setTargetPosition(0);
            robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            while (robot.clawArm.getCurrentPosition() > robot.clawArm.getTargetPosition()){
                telemetry.addData("oo oo", robot.clawArm.getCurrentPosition());
                telemetry.addData("aa aa", robot.clawArm.getTargetPosition());
            }


            robot.frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
// setting power
            robot.frontLeft.setPower(0.5);
            robot.frontRight.setPower(0.5);
            robot.backLeft.setPower(0.5);
            robot.backRight.setPower(0.5);
// strafe right
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(26));
            robot.frontRight.setTargetPosition((int) robot.inchesToTicks(-26));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(-26));
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(26));
// go forward
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
            while (robot.frontLeft.getCurrentPosition() < robot.frontLeft.getTargetPosition()){
                telemetry.addData("suck big", robot.frontLeft.getCurrentPosition());
                telemetry.addData("balls", robot.frontLeft.getTargetPosition());

                telemetry.update();
            }
            robot.frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            robot.backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
// ethan is a monkey
            robot.frontLeft.setPower(0.5);
            robot.frontRight.setPower(0.5);
            robot.backLeft.setPower(0.5);
            robot.backRight.setPower(0.5);
// ethan is a monkey
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(12));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(12));
            robot.frontRight.setTargetPosition((int)robot.inchesToTicks(12));
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(12));
// ethan is a monkey
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            while (robot.frontLeft.getCurrentPosition() < robot.frontLeft.getTargetPosition()){
                telemetry.addData("bing", robot.frontLeft.getCurrentPosition());
                telemetry.addData("chilling", robot.frontLeft.getTargetPosition());
                telemetry.update();
            }

        }

    }
// ethan is a monkey
}
