package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
public class DriveTrainSubsystem extends SubsystemBase {
  private static TalonFX armTalonFX1;
  private static TalonFX armTalonFX2;
  private static TalonFX armTalonFX3;
  private static TalonFX armTalonFX4;
  public DriveTrainSubsystem() {
    // instantiate your sensor
    armTalonFX1 = new TalonFX(Constants.CANIds.leftFalcon1.id);
    armTalonFX2 = new TalonFX(Constants.CANIds.leftFalcon2.id);
    armTalonFX3 = new TalonFX(Constants.CANIds.rightFalcon1.id);
    armTalonFX4 = new TalonFX(Constants.CANIds.rightFalcon2.id);
    
  }

  public void setPower(double power){
    armTalonFX1.set(ControlMode.PercentOutput, power);
    armTalonFX2.set(ControlMode.PercentOutput, power);
    armTalonFX3.set(ControlMode.PercentOutput, power);
    armTalonFX4.set(ControlMode.PercentOutput, power);
  }

  public static void breaks (){
    armTalonFX1.setNeutralMode(NeutralMode.Brake);
    armTalonFX1.set(ControlMode.PercentOutput, 0);
    armTalonFX2.setNeutralMode(NeutralMode.Brake);
    armTalonFX2.set(ControlMode.PercentOutput, 0);
    armTalonFX3.setNeutralMode(NeutralMode.Brake);
    armTalonFX3.set(ControlMode.PercentOutput, 0);
    armTalonFX4.setNeutralMode(NeutralMode.Brake);
    armTalonFX4.set(ControlMode.PercentOutput, 0);
    }

  public void coast (){
    armTalonFX1.setNeutralMode(NeutralMode.Coast);
    armTalonFX2.setNeutralMode(NeutralMode.Coast);
    armTalonFX3.setNeutralMode(NeutralMode.Coast);
    armTalonFX4.setNeutralMode(NeutralMode.Coast);
  }

  public void Turnleft (double power){
    armTalonFX1.setNeutralMode(NeutralMode.Coast);
    armTalonFX2.setNeutralMode(NeutralMode.Coast);
    armTalonFX3.set(ControlMode.PercentOutput, power);
    armTalonFX4.set(ControlMode.PercentOutput, power);
  }

  public void Turnright (double power){
    armTalonFX3.setNeutralMode(NeutralMode.Coast);
    armTalonFX4.setNeutralMode(NeutralMode.Coast);
    armTalonFX1.set(ControlMode.PercentOutput, power);
    armTalonFX2.set(ControlMode.PercentOutput, power);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}