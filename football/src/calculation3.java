import java.util.Scanner;

public class calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        double GroundPassing = scanner.nextDouble();
        double AerialPassing = scanner.nextDouble();
        double Heading = scanner.nextDouble();
        double Jumping = scanner.nextDouble();
        double DefensiveAwareness = scanner.nextDouble();
        double SlideTackle = scanner.nextDouble();
        double BallControl = scanner.nextDouble();
        double Dribbling = scanner.nextDouble();
        double Arc = scanner.nextDouble();
        double Speed = scanner.nextDouble();
        double Accelerateing = scanner.nextDouble();
        double BodyContact = scanner.nextDouble();
        double BodyControl = scanner.nextDouble();
        double Play1Ability = AbilityCalculate(GroundPassing,AerialPassing,Heading,Jumping,DefensiveAwareness,SlideTackle,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
        System.out.print("The player" + Name + "ability is" + Play1Ability );}
        public static double AbilityCalculate(double GroundPassing,double AerialPassing,double Heading,double Jumping,double DefensiveAwareness,double SlideTackle,double BallControl,double Dribbling,double Arc, double Speed,double Accelerateing,double BodyContact,double BodyControl){
        return GroundPassing*0.05 + AerialPassing*0.05 +  Heading*0.15 + Jumping*0.15 + DefensiveAwareness*0.2 + SlideTackle*0.2 + BallControl*0.1 + Dribbling*0.05 + Arc*0.05 + Speed*0.15 + Accelerateing*0.15 + BodyContact*0.2 + BodyControl*0.2;



    }

}
