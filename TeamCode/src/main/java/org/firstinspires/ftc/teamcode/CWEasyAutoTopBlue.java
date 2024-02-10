package org.firstinspires.ftc.teamcode;
// ethan is a monkey
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
// ethan is a monkey
import org.firstinspires.ftc.teamcode.helperClasses.RobotHardware;

// ethan is a monkey
@Autonomous
public class CWEasyAutoTopBlue extends LinearOpMode {
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
// ethan is a monkey
            robot.frontLeft.setPower(0.5);
            robot.frontRight.setPower(0.5);
            robot.backLeft.setPower(0.5);
            robot.backRight.setPower(0.5);
// ethan is a monkey
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(24));
            robot.frontRight.setTargetPosition((int) robot.inchesToTicks(-24));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(-24));
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(24));
// ethan is a monkey
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
// ethan is a monkey
            while (robot.frontLeft.getCurrentPosition() < robot.frontLeft.getTargetPosition()){
                telemetry.addData("suck big", robot.frontLeft.getCurrentPosition());
                telemetry.addData("balls", robot.frontLeft.getTargetPosition());
// ethan is a monkey
                telemetry.update();
            }
            robot.frontLeft.setPower(0);
            robot.frontRight.setPower(0);
            robot.backLeft.setPower(0);
            robot.backRight.setPower(0);

            robot.clawMarcos(RobotHardware.Marcos.ROW7MAXPOS);
            robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            while (robot.clawArm.getCurrentPosition() < robot.clawArm.getTargetPosition()) {
                telemetry.addData("Bigger", robot.clawArm.getCurrentPosition());
                telemetry.addData("Stronger", robot.clawArm.getTargetPosition());
// ethan is a monkey
                telemetry.update();
            }

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
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(24));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(24));
            robot.frontRight.setTargetPosition((int)robot.inchesToTicks(24));
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(24));
// ethan is a monkey
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            while (robot.frontLeft.getCurrentPosition() < robot.frontLeft.getTargetPosition()){
                telemetry.addData("your mother", robot.frontLeft.getCurrentPosition());
                telemetry.addData("last night", robot.frontLeft.getTargetPosition());
// ethan is a monkey
                telemetry.update();
            }

            robot.leftClaw.setPosition(RobotHardware.ClawPos.LEFT_OPEN);
            robot.rightClaw.setPosition(RobotHardware.ClawPos.RIGHT_OPEN);

            sleep(4000);

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
            robot.backRight.setTargetPosition((int)robot.inchesToTicks(-20));
            robot.backLeft.setTargetPosition((int)robot.inchesToTicks(-20));
            robot.frontRight.setTargetPosition((int)robot.inchesToTicks(-20));
            robot.frontLeft.setTargetPosition((int)robot.inchesToTicks(-20));
// ethan is a monkey
            robot.backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            while (robot.frontLeft.getCurrentPosition() > robot.frontLeft.getTargetPosition()){
                telemetry.addData("Big", robot.frontLeft.getCurrentPosition());
                telemetry.addData("Chungus", robot.frontLeft.getTargetPosition());
// ethan is a monkey
                telemetry.update();
            }
        }

    }
// ethan is a monkey
}
