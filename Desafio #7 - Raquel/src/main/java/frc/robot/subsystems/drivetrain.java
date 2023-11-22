// O comando abaixo tá pegando todos os subsystems do robô.
package frc.robot.subsystems;

// O comando tá importando todos os motores que o robô usa.
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// Os comandos abaixo tá 
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

    rightMaster.isInverted(true);
    rightSlave.isInverted(true);
    
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);
  }

  public void tankDrive(double leftVel, double rightVel)
  {
    leftMaster.set(leftVel);
    rightMaster.set(rightVel);
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
