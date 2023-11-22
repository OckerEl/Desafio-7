// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {

  private WPI_TalonSRX leftMaster = new WPI_TalonSRX(0);
  private VictorSPX leftSlave = new VictorSPX(1);
  private WPI_TalonSRX rightMaster = new WPI_TalonSRX(2);
  private VictorSPX rightSlave = new VictorSPX(3);

  private DifferentialDrive diffDrive = new DifferentialDrive(leftMaster, rightMaster);

  /** Creates a new drivetrain. */
  public drivetrain() {
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);
  }

  public void tankDrive(double leftVel, double rightVel)
  {
    leftMaster.set(0.6);
    rightMaster.set(0.6);
  }
/*
  public void tankDrive(double leftVel, double rightVel)
  {
    diffDrive.tankDrive(leftVel, rightVel);
  }
*/
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
