package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.WristSubsystem;
import frc.robot.subsystems.shoulderpid;

public class CubeMiddleScore extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final shoulderpid m_subsystem;
  private final WristSubsystem m_wristSubsystem; 

  public CubeMiddleScore(shoulderpid subsystem, WristSubsystem wristSub) {
    m_subsystem = subsystem;
    m_wristSubsystem = wristSub;
    addRequirements(subsystem);
  }

  @Override//
  public void initialize() {}

  @Override
  public void execute() {
    m_subsystem.moveArm(-2993.0);
    m_wristSubsystem.moveWrist(91968.0); 
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}