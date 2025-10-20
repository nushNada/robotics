package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Mers Inainte", group="Test")
public class MersInainteSimplu extends LinearOpMode
{
    DcMotor leftDrive = null;
    DcMotor rightDrive = null;

    @Override
    public void runOpMode()
    {
        // Initializare Motoare
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

        // Setam directia motoarelor
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addLine("Robotul este gata!");
        telemetry.update();

        // Asteptam Start
        waitForStart();

        if (opModeIsActive())
        {
            // Mers Inainte
            telemetry.addLine("Mers inainte...");
            telemetry.update();

            leftDrive.setPower(0.5);
            rightDrive.setPower(0.5);
            sleep(5000); // sa dureze 5 secunde

            // Oprire scurta
            leftDrive.setPower(0);
            rightDrive.setPower(0);
            sleep(500);

            // Intoarcere spre dreapta
            telemetry.addLine("Ma intorc spre dreapta...");
            telemetry.update();
            leftDrive.setPower(0.5);
            rightDrive.setPower(-0.5);
            sleep(1000); // sa dureze o secunda

            // Mers inapoi
            telemetry.addLine("Merg inapoi...");
            telemetry.update();
            leftDrive.setPower(-0.5);
            rightDrive.setPower(-0.5);
            sleep(1500);

            // Oprire finala
            leftDrive.setPower(0);
            rightDrive.setPower(0);

            telemetry.addLine("Program finalizat.");
            telemetry.update();

        }
    }
}
