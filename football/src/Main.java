import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.print("Hello and welcome!" + "\n" +"You can calculate the ability of the player and change it in some conditons here" + "\n");
            Scanner scanner = new Scanner(System.in);
            String Foward= "Foward";
            String Midfield = "Midfield";
            String Defender = "Defender";
            System.out.print("Please give the position of the palyer ( Foward or Midfield or Defender ):");
            String position = scanner.nextLine();

            if(position.equals(Foward)){

            System.out.print("Please give the name:");
            String Name = scanner.nextLine();
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
            double ability = calculation3.AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
            System.out.print("The player" + Name + "ability is" + ability );}

            else if(position.equals(Midfield)){

                System.out.print("Please give the name:");
                String Name = scanner.nextLine();
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
                double ability = calculation3.AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
                System.out.print("The player" + Name + "ability is" + ability );

            }
            else if(position.equals(Defender)){

                System.out.print("Please give the name:");
                String Name = scanner.nextLine();
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
                double ability = calculation3.AbilityCalculate(GroundPassing,AerialPassing,Shooting,Heading,Jumping,OffeensiveAwareness,BallControl,Dribbling,Arc,Speed,Accelerateing,BodyContact,BodyControl);
                System.out.print("The player" + Name + "ability is" + ability );
            }



    }

}