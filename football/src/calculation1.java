import java.util.Scanner;

public class calculation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give the name:");
        int Name =  scanner.nextInt();
        System.out.print("Please give the GroundPassing Ability:");
        double GroundPassing = scanner.nextDouble();
        System.out.print("Please give the AerialPassing Ability:");
        double AerialPassing = scanner.nextDouble();
        System.out.print("Please give the Shooting Ability:");
        double Shooting = scanner.nextDouble();
        System.out.print("Please give the Heading Ability:");
        double Heading = scanner.nextDouble();
        System.out.print("Please give the Jumping Ability:");
        double Jumping = scanner.nextDouble();
        System.out.print("Please give the OffensiveAwareness Ability:");
        double OfeensiveAwareness = scanner.nextDouble();
        System.out.print("Please give the BallContol Ability:");
        double BallControl = scanner.nextDouble();
        System.out.print("Please give the Dribbling Ability:");
        double Dribbling = scanner.nextDouble();
        System.out.print("Please give the Arc Ability:");
        double Arc = scanner.nextDouble();
        System.out.print("Please give the Speed Ability:");
        System.out.print("Please give the Accelerating Ability:");
        double Accelerateing = scanner.nextDouble();
        System.out.print("Please give the  + BodyControl Ability:");
        double BodyContact = scanner.nextDouble();
        System.out.print("Please give the BodyControl Ability:");
        double BodyControl = scanner.nextDouble();
        double Play1Ability = AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OfeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
        System.out.print("The player's ability is" + Play1Ability );}
        public static double AbilityCalculate(double GroundPassing,double AerialPassing,double Shooting,double Heading,double Jumping,double OfeensiveAwareness,double BallControl,double Dribbling,double Arc, double Speed,double Accelerateing,double BodyContact,double BodyControl){
            return GroundPassing*0.05 + AerialPassing*0.05 + Shooting*0.2 + Heading*0.1 + 
        }



    }

}
