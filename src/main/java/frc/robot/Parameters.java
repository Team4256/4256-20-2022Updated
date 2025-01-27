package frc.robot;
import edu.wpi.first.wpilibj.util.Color;
import com.revrobotics.ColorMatch;

public class Parameters{
    // Gyro
    public static final byte GYRO_UPDATE_HZ = 50;
    public static final double GYRO_OFFSET = 0;

    //Automomous
    public static final double AUTO_SWERVE_TRACTION_SPEED = 0.2; //TODO get the actual speed
    public static final double FALCON_PERCENT_TO_ENCODER_SPEED = 18000; //TODO get the actual speed
    public static final double CROSS_WHITE_LINE_DISTANCE_IN_INCHES = 15; //TODO get the actual DISTANCE
    public static final double MOVE_BACK_RIGHT_TRENCH_DISTANCE_IN_INCHES = 136; //TODO get the actual DISTANCE
    public static final double MOVE_BACK_LEFT_TRENCH_DISTANCE_IN_INCHES = 80; //TODO get the actual DISTANCE mode 4 only after crossing the white line
    public static final double DRIVE_FROM_TRENCH_TO_PORT_MODE2 = 100; //TODO get the actual DISTANCE
    public static final double DRIVE_BACK_MODE_4_AND_5 = 70; //TODO get the actual DISTANCE
    //public static final double STARTING_DISTANCE_FROM_LEFT_IN_INCHES = 0; //TODO get the actual DISTANCE

    


    // Swerve Motors
    public static final int ROTATION_MOTOR_A_ID = 11; //Front Left
    public static final int ROTATION_MOTOR_B_ID = 12; //Front Right
    public static final int ROTATION_MOTOR_C_ID = 13; // AFT Left
    public static final int ROTATION_MOTOR_D_ID = 14; // AFT Right

    public static final int TRACTION_MOTOR_A_ID = 21; //Front Left
    public static final int TRACTION_MOTOR_B_ID = 22; //Front Right
    public static final int TRACTION_MOTOR_C_ID = 23; // AFT Left
    public static final int TRACTION_MOTOR_D_ID = 24; // AFT Right
    public static final double TRACTION_MOTORkP = 0.;
    public static final double TRACTION_MOTORkD = 0.;
    public static final double TRACTION_MOTORkF = 0.04542; // 0.04542 kF value calculated by F-gain = (100% X 1023) / 22522
    public static final int TRACTION_PID_ID = 0;
    public static final int TRACTION_MOTOR_TIMEOUTMS = 30;
    public static final double TRACTION_RPM_TO_COUNT_PER_100MS = 6380 * 2048.0 / 600.0;
   // Color Wheel
    public static final int WHEEL_ARM_MOTOR_ID = 15; // Main
    // public static final int WHEEL_ARM_UP_SOLENOID_CHANNEL = 4; //EXTEND
    // public static final int WHEEL_ARM_DOWN_SOLENOID_CHANNEL = 5; // RETRACT
    public static final double COLOR_MOTOR_SPEED = 0.5;
    public static final int TARGET_WEDGE_COUNT = 3*8+4; // 3 REVOLUTIONS, 8 WEDGES PER REVOLUTION, + 4 EXTRA WEDGES

    //Color Sensor
    public static final Color myBlue = new Color(0.128174, 0.431152, 0.440674);
    public static final Color myGreen = new Color(0.172363, 0.579834, 0.247803);
    public static final Color myRed = new Color(0.513428, 0.351807, 0.134766);
    public static final Color myYellow = new Color(0.320557, 0.556641, 0.122803);

    //soloniod motor stuff in competition up will be 2 down will be 3
    public static final int CLIMBER_LOCK_FORWARD_CHANNEL =  4; //Lock gear engage for climbing on Falcons
    public static final int CLIMBER_LOCK_REVERSE_CHANNEL =  5; //Lock gear disengage for climbing on Falcons
    public static final int CLIMBER_FORWARD_CHANNEL = 6; //Climber rotate arms up channel Solonoid Port Extend
    public static final int CLIMBER_REVERSE_CHANNEL = 7; //Climber rotate arms down channel solenoid port Retract
    public static final double CLIMBING_SPEED_LOW = 0.2;
    // add motors for arm going up and down
    public static final int R_CLIMBER_MOTOR_ID = 29; //Climber Motor right
    public static final int L_CLIMBER_MOTOR_ID = 28; //Climber Motor left
    //need actual encoder values, from engineering team
    public static double MED_HEIGHT_COUNT = 10;
    public static double MAX_HEIGHT_COUNT = 10;
    public static final double CLIMBER_MOTOR_SPEED_DPAD = 0.2; //need the actual speed. This is for the Dpad when both poles retract at the same time
    public static final double CLIMBER_MOTOR_SPEED_INDIVIDUAL = 0.2;//This is for when the joysticks are controlling individual motors
    public static final int CLIMBER_LEFT_RETRACT_LIMIT_SWITCH_ID = 0;
    public static final int CLIMBER_RIGHT_RETRACT_LIMIT_SWITCH_ID = 1;

    //INTAKE
    public static final int SUCCMOTOR_ID = 16; //Intake Motor
    public static final int INTAKE_FORWARD_CHANNEL = 0;//TODO need to get the real channel ID
    public static final double INTAKE_SUCC_MOTOR = 0.4;//TODO need to get the actual channel ID
    public static final double INTAKE_OUTAKE_SPEED = 0.4;
    public static final int INTAKE_REVERSE_CHANNEL = 1; //TODO get the actual intake motor speed 

    //shooter
    public static final int SHOOTERMOTOR_L_ID = 26;
    public static final int SHOOTERMOTOR_R_ID = 27;
    public static final int STIRRERMOTOR_ID = 18;
    public static final int FEEDERMOTOR_ID = 17;
    public static final int SHROUD_DOWN_CHANNEL = 3;
    public static final int SHROUD_UP_CHANNEL = 2;
    public static double SHOOTER_MOTOR_SPEED_LINE = 0.9;
    public static double SHOOTER_MOTOR_SPEED_TRENCH_CLOSE = 0.70;
    public static double SHOOTER_MOTOR_SPEED_TRENCH_FAR = 0.77;


    public static double FEEDER_STIRRER_MOTOR_SPEED = -0.6; // was 0.5 on march 6
    public static double STIRRER_MOTOR_SPEED = 0.3; // was .4 on march 6
    public static double STIRRER_MOTOR_DELAY = 0.75;
    //public static double MOTORSPEEDHIGH = 0.3;// we don't know yet what the engineers are going to do
    public static double DISTANCE_LOW_MIN = 4.5;
    public static double DISTANCE_LOW_MAX = 5.5;
    public static double DISTANCE_MED_MIN = 9.5;
    public static double DISTANCE_MED_MAX = 10.5;
    public static double DISTANCE_HIGH_MIN = 14.5;
    public static double DISTANCE_HIGH_MAX = 15.5;

    // Minimum and Maximum Voltage

    // public static final double angleEncoderMinVoltage[] = {.0354, .0219, .0073, .017};
    // public static final double angleEncoderMaxVoltage[] = {4.9218, 4.9243, 4.9145, 4.923};
    // public static final double angleEncoderTareVoltage[] = {3.5864,2.8491,2.3742,1.3354};//Swerve Number(A,B,C,D): PRACTICE 
    
    // PRACTICE ROBOT
    // public static final double angleEncoderMinVoltage[] = { 0.00366, 0.01099, 0.009766,  0.01343};
    // public static final double angleEncoderMaxVoltage[] = {4.9133, 4.9255, 4.9219, 4.9243};
    // public static final double angleEncoderTareVoltage[] = {4.155,1.752,1.297, 4.234};//Swerve Number(A,B,C,D): PRACTICE 
    // PRACTICE BOT
    //  * A (Swerve Number XX) MIN. VOL. = 0.00366, MAX. VOL. = 4.9133, TARE VOL. = 4.155
    //  * B (Swerve Number XX) MIN. VOL. = 0.01099, MAX. VOL. = 4.9255, TARE VOL. = 1.752
    //  * C (Swerve Number XX) MIN. VOL. = 0.009766, MAX. VOL. = 4.9219, TARE VOL. = 1.297
    //  * D (Swerve Number XX) MIN. VOL. = 0.01343, MAX. VOL. = 4.9243, TARE VOL. = 4.234

            //COMPETITION ROBOT (to be deleted)
            // public static final double angleEncoderMinVoltage[] = {0.0183, 0.0292, 0.0073, 0.0170};
            // public static final double angleEncoderMaxVoltage[] = {4.9243, 4.9218, 4.9145, 4.9194};
            // public static final double angleEncoderTareVoltage[] = {3.527,2.863,2.382,1.335};

            //COMPETITION ROBOT
            // public static final double angleEncoderMinVoltage[] = {0.0085, 0.004883, 0.0073, 0.0122};
            // public static final double angleEncoderMaxVoltage[] = {4.9243,4.916992, 4.9157, 4.9218};

              // COMPETITION ROBOT
            //ensure swerves are on analog 0-3
            /**
             * Swerve #1 = 1.99 B
             * Swerve #2 = 1.22
             * Swerve #3 = 4.35
             * Swerve #4 = 
             * Swerve #5 = 2.89
             * Swerve #6 = 4.86 
             * Swerve #7 = 4.2 D
             * Swerve #8 =  1.14 C
             * Swerve #9 = 1.00
             * Swerve #10 = 3.49 A
             */

            //  public static final double angleEncoderTareVoltage[] = {3.49, 1.99, 1.14, 4.2};     
            //  public static final double angleEncoderMinVoltage[] = {.0085, .0036, .018, .026};
            //  public static final double angleEncoderMaxVoltage[] = {4.9, 4.9, 4.9, 4.9};
            public static final double angleEncoderMinVoltage[] = {
              //   .008544921,
              //   .020751951,
              //   0.01220703,
              //   0.026855466,
              0.0037,
              0.0110,
              0.0208,
              0.01010
               };
              public static final double angleEncoderMaxVoltage[] = {
                // 4.921874496,
                // 4.921874496,
                // 4.913329475000001,
                // 4.887694812,
                4.880,
                4.9231,
                4.9243,
                4.9243
              };
              // COMPETITION ROBOT
              //ensure swerves are on analog 0-3
              /**
               * Swerve #1 = 3.21
               * Swerve #2 = 1.22
               * Swerve #3 = 0.68
               * Swerve #4 = 
               * Swerve #5 = 2.91
               * Swerve #6 = 4.31
               * Swerve #7 = 
               * Swerve #8 = 
               * Swerve #9 = 1.00
               *Swerve #10 = 2.29
               */
              //CURRENT COMPETITON SWERVES: A=2, B=6 , C=3, D=9
              public static final double angleEncoderTareVoltage[] = {
                3.21,
                2.29,
                2.91,
                0.68
              };
            // Aligner tolerances

    public static final double POSITION_TOLERANCE = 0.00;
    public static final double VELOCITY_TOLERANCE = 0.00;



}