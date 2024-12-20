import java.util.Scanner;

public class calculation2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String Name = scanner.nextLine();
    double GroundPassing = scanner.nextDouble();
    double AerialPassing = scanner.nextDouble();
    double Shooting = scanner.nextDouble();
    double OffeensiveAwareness = scanner.nextDouble();
    double BallControl = scanner.nextDouble();
    double Dribbling = scanner.nextDouble();
    double Arc = scanner.nextDouble();
    double Speed = scanner.nextDouble();
    double Accelerateing = scanner.nextDouble();
    double BodyContact = scanner.nextDouble();
    double BodyControl = scanner.nextDouble();
    double DefensiveAwareness = scanner.nextDouble();
    double SlideTackle = scanner.nextDouble();
    double PlayAbility = AbilityCalculate(GroundPassing,AerialPassing,Shooting,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl,DefensiveAwareness,SlideTackle);
    System.out.print("The player" + Name + "ability is" + PlayAbility );}
    public static double AbilityCalculate(double GroundPassing,double AerialPassing,double Shooting,double OffeensiveAwareness,double BallControl,double Dribbling,double Arc, double Speed,double Accelerateing,double BodyContact,double BodyControl,double DefensiveAwareness,double SlideTackle){
        return GroundPassing*0.15 + AerialPassing*0.15 + Shooting*0.05 +  OffeensiveAwareness*0.15 + BallControl*0.2 + Dribbling*0.15 + Arc*0.1 + Speed*0.15 + Accelerateing*0.15 + BodyContact*0.125 + BodyControl*0.125 + DefensiveAwareness*0.1 + SlideTackle*0.1;


    }

}





