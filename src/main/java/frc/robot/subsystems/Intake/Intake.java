package frc.robot.subsystems.Intake;

import static edu.wpi.first.units.Units.Rotations;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.signals.NeutralModeValue;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.util.LoggedTalon.TalonFX.LoggedTalonFX;

public class Intake extends SubsystemBase {
private final LoggedTalonFX deployMotor; 
private final LoggedTalonFX rollerMotor;

public Intake(LoggedTalonFX deployMotor, LoggedTalonFX rollerMotor) {
     this.deployMotor = deployMotor ; 
     this.rollerMotor = rollerMotor;
    
    this.deployMotor.withConfig(LoggedTalonFX.buildStandardConfig(40, 20,
      NeutralModeValue.Brake)); 
      this.rollerMotor.withConfig(LoggedTalonFX.buildStandardConfig(80, 40));
}
    @Override
    public void periodic() {
    deployMotor.periodic();
    rollerMotor.periodic();   
    }
} public class Intake extends SubsystemBase
