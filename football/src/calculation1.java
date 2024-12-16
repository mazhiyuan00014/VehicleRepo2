import java.util.Scanner;

public class calculation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give the name:");
        int Name = scanner.nextInt();
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
        double OffeensiveAwareness = scanner.nextDouble();
        System.out.print("Please give the BallContol Ability:");
        double BallControl = scanner.nextDouble();
        System.out.print("Please give the Dribbling Ability:");
        double Dribbling = scanner.nextDouble();
        System.out.print("Please give the Arc Ability:");
        double Arc = scanner.nextDouble();
        System.out.print("Please give the Speed Ability:");
        double Speed = scanner.nextDouble();
        System.out.print("Please give the Accelerating Ability:");
        double Accelerateing = scanner.nextDouble();
        System.out.print("Please give the  + BodyControl Ability:");
        double BodyContact = scanner.nextDouble();
        System.out.print("Please give the BodyControl Ability:");
        double BodyControl = scanner.nextDouble();
        double Play1Ability = AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
        System.out.print("The player" + Name + "ability is" + Play1Ability );}
        public static double AbilityCalculate(double GroundPassing,double AerialPassing,double Shooting,double Heading,double Jumping,double OffeensiveAwareness,double BallControl,double Dribbling,double Arc, double Speed,double Accelerateing,double BodyContact,double BodyControl){
            return GroundPassing*0.05 + AerialPassing*0.05 + Shooting*0.2 + Heading*0.1 + Jumping*0.1 + OffeensiveAwareness*0.2 + BallControl*0.15 + Dribbling*0.15 + Arc*0.1 + Speed*0.15 + Accelerateing*0.15 + BodyContact*0.15 + BodyControl*0.15;



    }

}
