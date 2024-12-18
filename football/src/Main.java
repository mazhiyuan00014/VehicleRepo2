import javax.naming.ldap.Control;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.print("Hello and welcome!" + "\n" + "You can calculate the ability of the player and change it in some conditons here" + "\n");
        Scanner scanner = new Scanner(System.in);
        String Foward = "Foward";
        String Midfield = "Midfield";
        String Defender = "Defender";
        String Yes = "Yes";
        String No = "No";
        String ControlBall = "Ball Control";
        String Counterattack = "Counterattack";

        double[] PlayerAbility;
        PlayerAbility = new double[20];

        String[] PlayerPosition;
        PlayerPosition = new String[20];

        double[] PlayerNumber;
        System.out.print("How many players'abilities do you want to set up?");
        int numbers = scanner.nextInt();
        PlayerNumber = new double[numbers];

        int i = 0;
        while (i < numbers) {

            System.out.print("Please give the position of the palyer ( Foward or Midfield or Defender ):" + "\n");
            String position = scanner.nextLine();
            PlayerPosition[i]= position;

            if (position.equals(Foward)) {

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
                System.out.print("Please give the BodyConract Ability:");
                double BodyContact = scanner.nextDouble();
                System.out.print("Please give the BodyControl Ability:");
                double BodyControl = scanner.nextDouble();
                double ability = calculation1.AbilityCalculate(GroundPassing, AerialPassing, Shooting, Heading, Jumping, OffeensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl);
                System.out.print(" The player " + Name + " ability is " + ability);
                PlayerNumber[i] = ability;
                PlayerAbility[1]= GroundPassing;
                PlayerAbility[2]= AerialPassing;
                PlayerAbility[3]= Shooting;
                PlayerAbility[4]= Heading;
                PlayerAbility[5]= Jumping;
                PlayerAbility[6]= OffeensiveAwareness;
                PlayerAbility[7]= BallControl;
                PlayerAbility[8]= Dribbling;
                PlayerAbility[9]= Arc;
                PlayerAbility[10]= Speed;
                PlayerAbility[11]= Accelerateing;
                PlayerAbility[12]= BodyContact;
                PlayerAbility[13]= BodyControl;
                i++;
            }//end of if

            else if (position.equals(Midfield)) {

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
                System.out.print("Please give the BodyContact Ability:");
                double BodyContact = scanner.nextDouble();
                System.out.print("Please give the BodyControl Ability:");
                double BodyControl = scanner.nextDouble();
                System.out.print("Please give the DefensiveAwareness Ability:");
                double DefensiveAwareness = scanner.nextDouble();
                System.out.print("Please give the SlideTackle Ability:");
                double SlideTackle = scanner.nextDouble();

                double ability = calculation2.AbilityCalculate(GroundPassing, AerialPassing, Shooting, Heading, Jumping, OffeensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl, DefensiveAwareness, SlideTackle);
                System.out.print(" The player " + Name + " ability is " + ability);
                PlayerNumber[i] = ability;
                PlayerAbility[1]= GroundPassing;
                PlayerAbility[2]= AerialPassing;
                PlayerAbility[3]= Shooting;
                PlayerAbility[4]= Heading;
                PlayerAbility[5]= Jumping;
                PlayerAbility[6]= OffeensiveAwareness;
                PlayerAbility[7]= BallControl;
                PlayerAbility[8]= Dribbling;
                PlayerAbility[9]= Arc;
                PlayerAbility[10]= Speed;
                PlayerAbility[11]= Accelerateing;
                PlayerAbility[12]= BodyContact;
                PlayerAbility[13]= BodyControl;
                PlayerAbility[14]= DefensiveAwareness;
                PlayerAbility[15]= SlideTackle;
                i++;

            }//end of else if
            else if (position.equals(Defender)) {

                System.out.print("Please give the name:");
                String Name = scanner.nextLine();
                System.out.print("Please give the GroundPassing Ability:");
                double GroundPassing = scanner.nextDouble();
                System.out.print("Please give the AerialPassing Ability:");
                double AerialPassing = scanner.nextDouble();
                System.out.print("Please give the Heading Ability:");
                double Heading = scanner.nextDouble();
                System.out.print("Please give the Jumping Ability:");
                double Jumping = scanner.nextDouble();
                System.out.print("Please give the DefensiveAwareness Ability:");
                double DefensiveAwareness = scanner.nextDouble();
                System.out.print("Please give the SlideTackle Ability");
                double SlideTackle = scanner.nextDouble();
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
                System.out.print("Please give the BodyContact Ability:");
                double BodyContact = scanner.nextDouble();
                System.out.print("Please give the BodyControl Ability:");
                double BodyControl = scanner.nextDouble();
                double ability = calculation3.AbilityCalculate(GroundPassing, AerialPassing, Heading, Jumping, DefensiveAwareness, SlideTackle, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl);
                System.out.print(" The player " + Name + " ability is " + ability);
                PlayerNumber[i] = ability;
                PlayerAbility[1]= GroundPassing;
                PlayerAbility[2]= AerialPassing;
                PlayerAbility[3]= Heading;
                PlayerAbility[4]= Jumping;
                PlayerAbility[5]= DefensiveAwareness;
                PlayerAbility[6]= SlideTackle;
                PlayerAbility[7]= BallControl;
                PlayerAbility[8]= Dribbling;
                PlayerAbility[9]= Arc;
                PlayerAbility[10]= Speed;
                PlayerAbility[11]= Accelerateing;
                PlayerAbility[12]= BodyContact;
                PlayerAbility[13]= BodyControl;
                i++;
            }//end of else if
        }//end of while

        for (int q = 0; q < numbers; q++) {
            int m = q + 1;
            System.out.print("\n" + "The Player" + m + "'s ability is" + PlayerNumber[q]);

        }
        String h  = scanner.nextLine();
        System.out.print(h);//To avoid the Bug of Java

        if(numbers>1) {
            System.out.print("\n" + "Do you want to compare the player's ability?(Yes or No):");
            String opinion = scanner.nextLine();
            if (opinion.equals(Yes)) {
                System.out.print("Which two players do you want to compare?(Please give the playernumber):");
                int o = scanner.nextInt();
                int p = scanner.nextInt();
                if (PlayerNumber[o - 1] > PlayerNumber[p - 1]) {
                    System.out.println("Player" + o + "is better" + "\n" + PlayerNumber[o - 1]);
                } else if (PlayerNumber[o - 1] == PlayerNumber[p - 1]) {
                    System.out.println("Player" + p + " is better" + "\n" + PlayerNumber[p - 1]);
                } else if (PlayerNumber[o - 1] < PlayerNumber[p - 1]) {
                    System.out.println("The two players' ability is equivalent" + "\n" + PlayerNumber[o - 1] + "\n" + PlayerNumber[p - 1]);
                }
            } else if (opinion.equals(No)) {
                System.out.print("All right,this 'Compare'part is over");

            }
        }//end of if
        else if (numbers<=1){
            System.out.print("\n" + "You only set up one player's ability,so there is no need to compare");

        }//end of else if
        String in  = scanner.nextLine();
        System.out.print(in);//To avoid the Bug of Java

        System.out.print("\n" + "How many players do you want to give Tactical?"+ "\n" + "(You have set "+ numbers +" playerability)");
        int numberTactical = scanner.nextInt();
        for(int q =0;q<numberTactical;q++) {
            System.out.print("\n " + "Which player do you want to give the");
            int w = scanner.nextInt();
            System.out.print("\n" + "Which Tactical do you want to set for the Player?(Ball Control or Counterattack):");
            String Tactical = scanner.nextLine();
            System.out.print("\n" + "Please give the TacticalAdaptability of the player(1-100):");
            int Tacticalability = scanner.nextInt();
            double AddtionalWeiht = Tacticals.tactical(Tacticalability);
            if(Tactical.equals(ControlBall)&& PlayerPosition[w-1].equals(Foward)) {
                double abilitynow = calculation1.AbilityCalculate(PlayerAbility[1]*(1+AddtionalWeiht),PlayerAbility[2]*(1+AddtionalWeiht),PlayerAbility[3],PlayerAbility[4],PlayerAbility[5],PlayerAbility[6],PlayerAbility[7]*(1+AddtionalWeiht),PlayerAbility[8],PlayerAbility[9],PlayerAbility[10],PlayerAbility[11],PlayerAbility[12],PlayerAbility[13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
            }
            else if(Tactical.equals(ControlBall)&& PlayerPosition[w-1].equals(Midfield)){
                double abilitynow = calculation2.AbilityCalculate(PlayerAbility[1]*(1+AddtionalWeiht),PlayerAbility[2]*(1+AddtionalWeiht),PlayerAbility[3],PlayerAbility[4],PlayerAbility[5],PlayerAbility[6],PlayerAbility[7]*(1+AddtionalWeiht),PlayerAbility[8],PlayerAbility[9],PlayerAbility[10],PlayerAbility[11],PlayerAbility[12],PlayerAbility[13],PlayerAbility[14],PlayerAbility[15]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);

            }
            else if(Tactical.equals(ControlBall)&& PlayerPosition[w-1].equals(Defender)) {
                double abilitynow = calculation3.AbilityCalculate(PlayerAbility[1]*(1+AddtionalWeiht),PlayerAbility[2]*(1+AddtionalWeiht),PlayerAbility[3],PlayerAbility[4],PlayerAbility[5]*(1+AddtionalWeiht),PlayerAbility[6],PlayerAbility[7],PlayerAbility[8],PlayerAbility[9],PlayerAbility[10],PlayerAbility[11],PlayerAbility[12],PlayerAbility[13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);


            }
            else if(Tactical.equals(Counterattack)&& PlayerPosition[w-1].equals(Foward)) {
                double abilitynow = calculation1.AbilityCalculate(PlayerAbility[1],PlayerAbility[2],PlayerAbility[3],PlayerAbility[4],PlayerAbility[5],PlayerAbility[6],PlayerAbility[7],PlayerAbility[8],PlayerAbility[9],PlayerAbility[10]*(1+AddtionalWeiht),PlayerAbility[11]*(1+AddtionalWeiht),PlayerAbility[12],PlayerAbility[13]*(1+AddtionalWeiht));
                System.out.print("\n" + "The ability of the player now is " + abilitynow);

            }
            else if(Tactical.equals(Counterattack)&& PlayerPosition[w-1].equals(Midfield)) {
                double abilitynow = calculation2.AbilityCalculate(PlayerAbility[1],PlayerAbility[2],PlayerAbility[3],PlayerAbility[4],PlayerAbility[5],PlayerAbility[6],PlayerAbility[7],PlayerAbility[8],PlayerAbility[9],PlayerAbility[10]*(1+AddtionalWeiht),PlayerAbility[11]*(1+AddtionalWeiht),PlayerAbility[12],PlayerAbility[13],PlayerAbility[14]*(1+AddtionalWeiht),PlayerAbility[15]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);

            }
            else if(Tactical.equals(Counterattack)&& PlayerPosition[w-1].equals(Defender)) {
                double abilitynow = calculation3.AbilityCalculate(PlayerAbility[1],PlayerAbility[2],PlayerAbility[3],PlayerAbility[4],PlayerAbility[5],PlayerAbility[6],PlayerAbility[7],PlayerAbility[8],PlayerAbility[9],PlayerAbility[10]*(1+AddtionalWeiht),PlayerAbility[11]*(1+AddtionalWeiht),PlayerAbility[12]*(1+AddtionalWeiht),PlayerAbility[13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);

            }

        }//end of for(tactical)
        System.out.print("\n" + "You can set the player(s) to be Captain(Yes or No):");

        System.out.print("\n" + "It's over.Thank you for the using");




    }//end of main




    }//end of Class Main
