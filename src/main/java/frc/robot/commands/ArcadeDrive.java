package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.DistanceSensorSubsystem;


public class ArcadeDrive extends CommandBase {
  private final DriveTrainSubsystem drivetrainsubsystem;
  private final XboxController joystick1;
  private final DistanceSensorSubsystem distancesensorsubsystem;

  public ArcadeDrive(DriveTrainSubsystem drivetrainsubsystem, XboxController joystick1, DistanceSensorSubsystem distancesensorsubsystem) {
    this.drivetrainsubsystem = drivetrainsubsystem;
    this.joystick1 = joystick1;
    this.distancesensorsubsystem = distancesensorsubsystem;
    
    addRequirements(this.drivetrainsubsystem);
  }

  @Override
  public void initialize() {
    // Initialization code here
  }

  @Override
  public void execute() {
    double target = 0;
    if (distancesensorsubsystem.getDistance() <= target) {
      DriveTrainSubsystem.breaks();
    } else {
      if (joystick1.getLeftY() > 0) {
        drivetrainsubsystem.setPower(joystick1.getLeftX() * 0.5);
      } else {
        if (joystick1.getLeftY() < 0) {
          drivetrainsubsystem.setPower(joystick1.getLeftY() * -0.5);
        } else {
          DriveTrainSubsystem.breaks();
        }
      }
      if (joystick1.getRightX() > 0) {
        drivetrainsubsystem.Turnright(joystick1.getRightX() * 0.5);
      } else {
        if (joystick1.getRightX() < 0) {
          drivetrainsubsystem.Turnleft(joystick1.getRightX() * 0.5);
        } else {
          DriveTrainSubsystem.breaks();
        }
      }
    }
  }

  @Override
  public void end(boolean interrupted) {
    DriveTrainSubsystem.breaks();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}