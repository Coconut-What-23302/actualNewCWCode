package org.firstinspires.ftc.teamcode.helperClasses;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.drive.TwoWheelTrackingLocalizer;

@TeleOp
public class targetLocationPose extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        RobotHardware robot = new RobotHardware();
        robot.init(hardwareMap);


        drive.setPoseEstimate(new Pose2d(0, 0, Math.toRadians(-90)));

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {





            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            double frontLeftPower = y - x + rx;
            double backLeftPower = y + x + rx;
            double frontRightPower = y + x - rx;
            double backRightPower = y - x - rx;

            robot.frontLeft.setPower(frontLeftPower);
            robot.backLeft.setPower(backLeftPower);
            robot.frontRight.setPower(frontRightPower);
            robot.backRight.setPower(backRightPower);

            int armPosition = 0;

            if (gamepad1.left_bumper || gamepad1.right_bumper) {
                if (gamepad1.left_bumper) {
                    armPosition += 1;
                } else if (gamepad1.right_bumper) {
                    armPosition -= 1;
                }

                robot.clawArm.setTargetPosition(armPosition);
                robot.clawArm.setPower(0.2);
                robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }


            if (gamepad1.right_trigger > .5) {
                robot.clawWrist.setPosition(robot.clawWrist.getPosition() + .01);
            }

            if (gamepad1.left_trigger > .5) {
                robot.clawWrist.setPosition(robot.clawWrist.getPosition() - .01);
            }

            if (gamepad2.right_trigger > .5) {
                robot.leftClaw.setPosition(robot.leftClaw.getPosition() + .01);
            }
            if (gamepad2.left_trigger > .5) {
                robot.leftClaw.setPosition(robot.leftClaw.getPosition() - .01);
            }
            if (gamepad2.right_bumper) {
                robot.rightClaw.setPosition(robot.rightClaw.getPosition() + .01);
            }
            if (gamepad2.left_bumper) {
                robot.rightClaw.setPosition(robot.rightClaw.getPosition() - .01);
            }
            drive.update();
            Pose2d myPose = drive.getPoseEstimate();
            telemetry.addData("x", myPose.getX());
            telemetry.addData("y", myPose.getY());
            telemetry.addData("heading", myPose.getHeading());
            telemetry.addData("Arm Position", robot.clawArm.getCurrentPosition());
            telemetry.addData("wrist position", robot.clawWrist.getPosition());
            telemetry.addData("left claw position", robot.leftClaw.getPosition());
            telemetry.addData("right claw position", robot.rightClaw.getPosition());
            telemetry.update();
            PoseStorage.transferedPose = drive.getPoseEstimate();
        }

    }
}
