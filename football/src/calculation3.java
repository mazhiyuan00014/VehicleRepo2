import java.util.Scanner;

public class calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        double GroundPassing = scanner.nextDouble();
        double AerialPassing = scanner.nextDouble();
        double Shooting = scanner.nextDouble();
        double Heading = scanner.nextDouble();
        double Jumping = scanner.nextDouble();
        double OffeensiveAwareness = scanner.nextDouble();
        double BallControl = scanner.nextDouble();
        double Dribbling = scanner.nextDouble();
        double Arc = scanner.nextDouble();
        double Speed = scanner.nextDouble();
        double Accelerateing = scanner.nextDouble();
        double BodyContact = scanner.nextDouble();
        double BodyControl = scanner.nextDouble();
        double Play1Ability = AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
        System.out.print("The player" + Name + "ability is" + Play1Ability );}
    public static double AbilityCalculate(double GroundPassing,double AerialPassing,double Shooting,double Heading,double Jumping,double OffeensiveAwareness,double BallControl,double Dribbling,double Arc, double Speed,double Accelerateing,double BodyContact,double BodyControl){
        return GroundPassing*0.05 + AerialPassing*0.05 + Shooting*0.2 + Heading*0.1 + Jumping*0.1 + OffeensiveAwareness*0.2 + BallControl*0.15 + Dribbling*0.15 + Arc*0.1 + Speed*0.15 + Accelerateing*0.15 + BodyContact*0.15 + BodyControl*0.15;



    }

}
