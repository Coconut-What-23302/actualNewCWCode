package org.firstinspires.ftc.teamcode.helperClasses.AutoPaths;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.helperClasses.RobotHardware;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;
public class backstageBlue {

    public static TrajectorySequence Middle(SampleMecanumDrive drive, RobotHardware robot) {
        Pose2d startPose = new Pose2d(0, 0, Math.toRadians(-90));


        drive.setPoseEstimate(startPose);


        return drive.trajectorySequenceBuilder(startPose)




                .splineTo(new Vector2d(38, -27), 0)
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                    robot.clawMarcos(RobotHardware.Marcos.ROW5POS);
                    robot.clawArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                })
                .waitSeconds(2)
                .UNSTABLE_addTemporalMarkerOffset(0.0001, () -> {
                   robot.clawPosSingle(true,false);
                    robot.clawPosSingle(false,false);
                })
                .waitSeconds(25)
                .splineTo(new Vector2d(38, -22), 2)


                // logic here
                .build();
    }

    public static TrajectorySequence Left(SampleMecanumDrive drive, RobotHardware robot) {
        Pose2d startPose = new Pose2d(-39, 70, Math.toRadians(-90));

        drive.setPoseEstimate(startPose);

        return drive.trajectorySequenceBuilder(startPose)
                // logic here

                // logic here
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
