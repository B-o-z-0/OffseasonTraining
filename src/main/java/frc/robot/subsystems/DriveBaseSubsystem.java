package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
  // create your private TalonFXs
  public DriveBaseSubsystem() {
    // initialize da motors with CANIds from Constants.java
    TalonFX armTalonFX1;
    TalonFX armTalonFX2;
    TalonFX armTalonFX3;
    TalonFX armTalonFX4;
  }
  
  // write your setPower methods

  @Override
  public void periodic() {}
}
