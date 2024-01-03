package org.firstinspires.ftc.teamcode.helperClasses.AutoPaths;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.helperClasses.RobotHardware;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

import java.util.Vector;

public class frontstageRed {

    public static TrajectorySequence Middle(SampleMecanumDrive drive, RobotHardware robot) {
        Pose2d startPose = new Pose2d(-39, 70, Math.toRadians(-90));

        drive.setPoseEstimate(startPose);

        return drive.trajectorySequenceBuilder(startPose)
                // logic here

                // logic here
                .build();
    }

    public static TrajectorySequence Left(SampleMecanumDrive drive, RobotHardware robot) {
        Pose2d startPose = new Pose2d(-39, 70, Math.toRadians(-90));

        drive.setPoseEstimate(startPose);

        return drive.trajectorySequenceBuilder(startPose)
                .splineTo(new Vector2d(-35.82, 46.00), Math.toRadians(-90.00))
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawArm.setTargetPosition(650);
                    robot.clawArm.setPower(0.2);
                    robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                })
                .waitSeconds(2)
                .lineToConstantHeading(new Vector2d(-25.00, 46.00))
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawArm.setTargetPosition(0);
                    robot.clawArm.setPower(0.2);
                    robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                })

                .lineTo(new Vector2d(-35.00, 46.00))
                .lineTo(new Vector2d(-39.00, 59.00))

                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawArm.setTargetPosition(650);
                    robot.clawArm.setPower(0.2);
                    robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                   robot.clawWrist.setPosition(0.319);
                })
                .waitSeconds(2)
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawPosSingle(true,true);
                })
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawArm.setTargetPosition(0);
                    robot.clawArm.setPower(0.2);
                    robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                })
                .lineTo(new Vector2d(-38.00, 59.00))




                .build();
    }

    public static TrajectorySequence Right(SampleMecanumDrive drive, RobotHardware robot) {
        Pose2d startPose = new Pose2d(-39, 70, Math.toRadians(-90));

        drive.setPoseEstimate(startPose);

        return drive.trajectorySequenceBuilder(startPose)
                // logic here

                // logic here
                .build();
    }


}
