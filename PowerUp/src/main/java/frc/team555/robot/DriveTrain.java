package frc.team555.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;

public class DriveTrain {
    WPI_TalonSRX fl;
    WPI_TalonSRX fr;
    WPI_TalonSRX br;
    WPI_TalonSRX bl;

    double leftPower;
    double rightPower;

    public DriveTrain(WPI_TalonSRX fl, WPI_TalonSRX fr, WPI_TalonSRX bl, WPI_TalonSRX br) {
        this.fl = fl;
        this.fr = fr;
        this.bl = bl;
        this.br = br;
    }

    public void drive(Joystick stick) {
        leftPower = stick.getX() + stick.getY();
        rightPower = stick.getY() - stick.getX();

        fr.set(rightPower);
        br.set(rightPower);//WALUIGI NUMBER 1
        fl.set(leftPower);
        bl.set(leftPower);
    }
}
