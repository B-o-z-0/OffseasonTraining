package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Ultrasonic;

public class DistanceSensorSubsystem extends SubsystemBase {
  // create your private AnalogPotentiometer instance variable
  private Ultrasonic m_range;
  public DistanceSensorSubsystem() {
    // instantiate your sensor
    m_range = new Ultrasonic(1,2);

  }
  
  // make a getDistance method
  public double getDistance(){
    double distanceInInches = m_range.getRangeInches();
    return distanceInInches;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
