package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.helperClasses.AutoPaths.frontstageRed;
import org.firstinspires.ftc.teamcode.helperClasses.PoseStorage;
import org.firstinspires.ftc.teamcode.helperClasses.RobotHardware;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

import java.util.Dictionary;
import java.util.Hashtable;

@Autonomous

public class CWAuto extends LinearOpMode {


    int startLocation = -1;
    int spikeLocation = 2;
    boolean startVarsPicked = false;

    @Override
    public void runOpMode() throws InterruptedException {
// Define variables to track previous DPad which is false
//        boolean previousDPadUp = false;
//        boolean previousDPadDown = false;
//        boolean previousDPadLeft = false;
//        boolean previousDPadRight = false;
//        // Create instances of SampleMecanumDrive and RobotHardware - allowing for access to hardware and path methods then init robot hardware
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        RobotHardware robot = new RobotHardware();
        robot.init(hardwareMap);
//
//        // Create a dictionary mapping start locations to text descriptions
//        Dictionary<Integer, String> startLocationText = new Hashtable<>();
//        startLocationText.put(0, "Backstage Red");
//        startLocationText.put(1, "Backstage Blue");
//        startLocationText.put(2, "Frontstage Red");
//        startLocationText.put(3, "Frontstage Blue");
//
//
//        while (!startVarsPicked) {
//
//            boolean currentDPadUp = gamepad1.dpad_up;
//            boolean currentDPadDown = gamepad1.dpad_down;
//            boolean currentDPadLeft = gamepad1.dpad_left;
//            boolean currentDPadRight = gamepad1.dpad_right;
//            if (startLocation == -1) {
//                telemetry.addLine("Select Robot Start Location");
//                telemetry.update();
//                if (currentDPadUp && !previousDPadUp) {
//                    startLocation = 0;
//                } else if (currentDPadRight && !previousDPadRight) {
//                    startLocation = 1;
//                } else if (currentDPadDown && !previousDPadDown) {
//                    startLocation = 2;
//                } else if (currentDPadLeft && !previousDPadLeft) {
//                    startLocation = 3;
//                }
//
//            } else {
//                startVarsPicked = true;
//            }
//            previousDPadLeft = currentDPadLeft;
//            previousDPadRight = currentDPadRight;
//            previousDPadUp = currentDPadUp;
//            previousDPadDown = currentDPadDown;
//        }
//
//// Display the correct robot start location
//        telemetry.addData("Select Robot Start Location", startLocationText.get(startLocation));
//        telemetry.update();

        /*
         *   Division between main code loop and initialization code because i'm blind
         */
        robot.clawPosSingle(true,false);
        waitForStart();
        if (isStopRequested()) return;


        TrajectorySequence spikeLeftTrajectory = frontstageRed.Left(drive, robot);
        drive.followTrajectorySequence(spikeLeftTrajectory);


//        switch (startLocation) { // start outer switch statement for location relative to field (backstage red, backstage blue, frontstage red, frontstage blue)
//            case 0: //
//                // If start location is 0, execute Backstage Red Trajectory
//                switch (spikeLocation) { //  start inner switch statement for spike location
//                    case 0: // spike is on the left
//                        TrajectorySequence spikeLeftTrajectory = backstageRed.Left(drive, robot);
//                        drive.followTrajectorySequence(spikeLeftTrajectory);
//                        break;
//                    case 1: // spike is on the middle
//                        TrajectorySequence spikeMiddleTrajectory = backstageRed.Middle(drive, robot);
//                        drive.followTrajectorySequence(spikeMiddleTrajectory);
//                        break;
//                    case 2: //spike is on the right
//                        TrajectorySequence spikeRightTrajectory = backstageRed.Right(drive, robot);
//                        drive.followTrajectorySequence(spikeRightTrajectory);
//                        break;
//                }
//                break; // break out of outer swtich statement for location relative to field
//            case 1:
//                // If start location is 1, execute Backstage Blue Trajectory
//                switch (spikeLocation) {
//                    case 0: // spike is on the left
//                        TrajectorySequence spikeLeftTrajectory = backstageBlue.Left(drive, robot);
//                        drive.followTrajectorySequence(spikeLeftTrajectory);
//                        break;
//                    case 1: // spike is on the middle
//                        TrajectorySequence spikeMiddleTrajectory = backstageBlue.Middle(drive, robot);
//                        drive.followTrajectorySequence(spikeMiddleTrajectory);
//                        break;
//                    case 2: //spike is on the right
//                        TrajectorySequence spikeRightTrajectory = backstageBlue.Right(drive, robot);
//                        drive.followTrajectorySequence(spikeRightTrajectory);
//                        break;
//                }
//                break;
//            case 2:
//                // If start location is 2, run frontstage Red Trajectory
//                switch(spikeLocation) {
//                    case 0: // spike is on the left
//                        TrajectorySequence spikeLeftTrajectory = frontstageRed.Left(drive, robot);
//                        drive.followTrajectorySequence(spikeLeftTrajectory);
//                        break;
//                    case 1: // spike is on the middle
//                        TrajectorySequence spikeMiddleTrajectory = frontstageRed.Middle(drive, robot);
//                        drive.followTrajectorySequence(spikeMiddleTrajectory);
//                        break;
//                    case 2: //spike is on the right
//                        TrajectorySequence spikeRightTrajectory = frontstageRed.Right(drive, robot);
//                        drive.followTrajectorySequence(spikeRightTrajectory);
//                        break;
//                }
//                break;
//            case 3:
//                // If start location is 3, run Frontstage Blue Trajectory
//                switch(spikeLocation) {
//                    case 0: // spike is on the left
//                        TrajectorySequence spikeLeftTrajectory = frontstageBlue.Left(drive, robot);
//                        drive.followTrajectorySequence(spikeLeftTrajectory);
//                        break;
//                    case 1: // spike is on the middle
//                        TrajectorySequence spikeMiddleTrajectory = frontstageBlue.Middle(drive, robot);
//                        drive.followTrajectorySequence(spikeMiddleTrajectory);
//                        break;
//                    case 2: //spike is on the right
//                        TrajectorySequence spikeRightTrajectory = frontstageBlue.Right(drive, robot);
//                        drive.followTrajectorySequence(spikeRightTrajectory);
//                        break;
//                }
//                break;
//        } //end outer switch statement for location relative to field (backstage red, backstage blue, frontstage red, frontstage blue)


        PoseStorage.transferedPose = drive.getPoseEstimate(); // transfer pose between op modes
    }
}