package frc.team555.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {
    WPI_TalonSRX fl = new WPI_TalonSRX(1);
    WPI_TalonSRX fr = new WPI_TalonSRX(7);
    WPI_TalonSRX bl = new WPI_TalonSRX(3);
    WPI_TalonSRX br = new WPI_TalonSRX(8);

    DriveTrain dt;

    Joystick driveJoystick;
    @Override
    public void robotInit () {
        dt = new DriveTrain(fl, fr, bl, br);
        driveJoystick = new Joystick(0);
    }
    @Override
    public void teleopPeriodic() {
        dt.drive(driveJoystick);
    }

}