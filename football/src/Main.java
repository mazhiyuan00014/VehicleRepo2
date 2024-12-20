import javax.naming.ldap.Control;
import javax.swing.*;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {

    String Forward = "Forward";
    String Midfield = "Midfield";
    String Defender = "Defender";
    String Yes = "Yes";
    String No = "No";
    String ControlBall = "Ball Control";
    String Counterattack = "Counterattack";
    static int[] Number;
    static double[] PlayerAbility;
    static String[] PlayerPosition;
    static double[] PlayerNumber;
    static double[] PlayerAbilitynow;
    static String[] PlayerTactical;
    static String[] PlayerName;
    Scanner scanner = new Scanner(System.in);
    private int mainMenu(){
        System.out.print("""
            Data Menu
            ---------
            1)Set player's ability
            2)compare
            3)List the players' foundational ability
            4)add new players' ability
            5)Set the tactical of the player
            6)Set the player as Captain
            7)List the players, ability after being gived the tactical
            8)Delete a player
            0)Exit
            ==>>"""
        );
        int option = scanner.nextInt();
        return  option;
    }
    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case 1 -> setAbility();
                case 2 -> compare();
                case 3 -> listFoundationalAbility();
                case 4 -> add();
                case 5 -> setTactical();
                case 6 -> Captain();
                case 7 -> listTacticalAbility();
                case 8 -> Delete();
                default -> System.out.print("Invalid option entered: " + option);

            }
            System.out.print("\nPress enter key to continue");
            scanner.nextLine();
            scanner.nextLine();
            option = mainMenu();

        }
        System.out.print("\n" + "It's over.Thank you for the using");
        System.exit(0);
    }

    public  static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.print("Hello and welcome!" + "\n" + "You can calculate the ability of the player and change it in some conditions here" + "\n");
        Scanner scanner = new Scanner(System.in);



        Number = new int[20];
        PlayerAbility = new double[150];
        PlayerAbilitynow = new double[150];
        PlayerPosition = new String[20];
        PlayerTactical = new String[20];
        PlayerName = new  String[20];
        Main main = new Main();
        main.mainMenu();
        main.runMenu();



        String in  = scanner.nextLine();
        System.out.print(in);//To avoid the Bug of Java

        System.out.print("\n" + "Thanks for your using.\n Wish you happy");



    }//end of main
    public void  setAbility(){
        System.out.print("How many players' abilities do you want to set up?(No more  than 10 players)");
        int numbers = scanner.nextInt();
        Number[1]= numbers;
        PlayerNumber = new double[numbers+1];


        int i = 0;
        while (i < numbers) {

            System.out.print("Please give the position of the player ( Forward or Midfield or Defender ):" + "\n");
            String position = scanner.nextLine();
            PlayerPosition[i]= position;

            if (position.equals(Forward)) {

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
                double OffensiveAwareness = scanner.nextDouble();
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
                double ability = calculation1.AbilityCalculate(GroundPassing, AerialPassing, Shooting, Heading, Jumping, OffensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl);
                System.out.print(" The player " + Name + " ability is " + ability);
                PlayerName[i] = Name;
                PlayerNumber[i] = ability;
                PlayerAbility[i*13+1]= GroundPassing;
                PlayerAbility[i*13+2]= AerialPassing;
                PlayerAbility[i*13+3]= Shooting;
                PlayerAbility[i*13+4]= Heading;
                PlayerAbility[i*13+1]= Jumping;
                PlayerAbility[i*13+6]= OffensiveAwareness;
                PlayerAbility[i*13+7]= BallControl;
                PlayerAbility[i*13+8]= Dribbling;
                PlayerAbility[i*13+9]= Arc;
                PlayerAbility[i*13+10]= Speed;
                PlayerAbility[i*13+11]= Accelerateing;
                PlayerAbility[i*13+12]= BodyContact;
                PlayerAbility[i*13+13]= BodyControl;
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

                double ability = calculation2.AbilityCalculate(GroundPassing, AerialPassing, Shooting,  OffeensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl, DefensiveAwareness, SlideTackle);
                System.out.print(" The player " + Name + " ability is " + ability);
                PlayerName[i] = Name;
                PlayerNumber[i] = ability;
                PlayerAbility[i*13+1]= GroundPassing;
                PlayerAbility[i*13+2]= AerialPassing;
                PlayerAbility[i*13+3]= Shooting;
                PlayerAbility[i*13+4]= OffeensiveAwareness;
                PlayerAbility[i*13+1]= BallControl;
                PlayerAbility[i*13+6]= Dribbling;
                PlayerAbility[i*13+7]= Arc;
                PlayerAbility[i*13+8]= Speed;
                PlayerAbility[i*13+9]= Accelerateing;
                PlayerAbility[i*13+10]= BodyContact;
                PlayerAbility[i*13+11]= BodyControl;
                PlayerAbility[i*13+12]= DefensiveAwareness;
                PlayerAbility[i*13+13]= SlideTackle;
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
                PlayerName[i] = Name;
                PlayerAbility[i*13+1]= GroundPassing;
                PlayerAbility[i*13+2]= AerialPassing;
                PlayerAbility[i*13+3]= Heading;
                PlayerAbility[i*13+4]= Jumping;
                PlayerAbility[i*13+1]= DefensiveAwareness;
                PlayerAbility[i*13+6]= SlideTackle;
                PlayerAbility[i*13+7]= BallControl;
                PlayerAbility[i*13+8]= Dribbling;
                PlayerAbility[i*13+9]= Arc;
                PlayerAbility[i*13+10]= Speed;
                PlayerAbility[i*13+11]= Accelerateing;
                PlayerAbility[i*13+12]= BodyContact;
                PlayerAbility[i*13+13]= BodyControl;
                i++;
            }//end of else if

        }//end of while



    }

        public void listFoundationalAbility(){
        for (int q = 0; q < Number[1]; q++) {
            int m = q + 1;
            System.out.print("\n" + "The Player" + m +"(" + PlayerName[m-1] + ")" +"'s ability is" + PlayerNumber[q]+"\nAnd his position is" + PlayerPosition[q]);
        }


    }
        public void listTacticalAbility(){
            for (int q = 0; q < Number[1]; q++) {
                int m = q + 1;
                System.out.print("\n" + "The Player(after being gived the tactical" + m +"(" + PlayerName[m-1] + ")" +"'s ability is" + PlayerAbilitynow[q]+"His tactical " + PlayerTactical[q] +"\nAnd his position is" + PlayerPosition[q]);
            }


        }
    public void compare(){
        String h  = scanner.nextLine();
        System.out.print(h);//To avoid the Bug of Java
        if(Number[1]>1) {
            System.out.print("\n" + "Do you want to compare the player's ability?(Yes or No):");
            String opinion = scanner.nextLine();
            if (opinion.equals(Yes)) {
                System.out.print("How many times do you want to compare?:");
                int Cyclenumber = scanner.nextInt();
                for (int l = 0; l < Cyclenumber; l++) {
                    System.out.print("Which two players do you want to compare?(Please give the playernumber):");
                    int o = scanner.nextInt();
                    int p = scanner.nextInt();
                    if (PlayerNumber[o - 1] > PlayerNumber[p - 1]) {
                        System.out.println("Player" + o + "is better" + "\n" + PlayerNumber[o - 1]);
                    } else if (PlayerNumber[o - 1] == PlayerNumber[p - 1]) {
                        System.out.println("Player" + p + " is better" + "\n" + PlayerNumber[p - 1]);
                    } else if (PlayerNumber[o - 1] < PlayerNumber[p - 1]) {
                        System.out.println("The two players' ability is equivalent" + "\n" + PlayerNumber[o - 1] + "\n" + PlayerNumber[p - 1]);
                    } else if (opinion.equals(No)) {
                        System.out.print("All right,this 'Compare'part is over");

                    }
                }//end of for
            }
        }//end of if
        else if (Number[1]<=1){
            System.out.print("\n" + "You only set up one player's ability,so there is no need to compare");

        }//end of else if
    }
    public void setTactical() {
        System.out.print("\n" + "How many players do you want to give Tactical?" + "\n" + "(You have set " + Number[1] + " playerability)");
        int numberTactical = scanner.nextInt();
        for (int q = 0; q < numberTactical; q++) {

            System.out.print("\n " + "Which player do you want to give the tactical?");
            int w = scanner.nextInt();
            System.out.print("\n" + "Which Tactical do you want to set for the Player?(Ball Control or Counterattack):");
            String b =scanner.nextLine();//avoid of the bug
            String Tactical = scanner.nextLine();
            PlayerTactical[w-1] =Tactical;
            System.out.print("\n" + "Please give the TacticalAdaptability of the player(1-100):");
            int Tacticalability = scanner.nextInt();
            double AddtionalWeiht = Tacticals.tactical(Tacticalability);
            if (Tactical.equals(ControlBall) && PlayerPosition[w - 1].equals(Forward)) {
                double abilitynow = calculation1.AbilityCalculate(PlayerAbility[(w-1)*13+1] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+2] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10], PlayerAbility[(w-1)*13+11], PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;

            } else if (Tactical.equals(ControlBall) && PlayerPosition[w - 1].equals(Midfield)) {
                double abilitynow = calculation2.AbilityCalculate(PlayerAbility[(w-1)*13+1] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+2] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10], PlayerAbility[(w-1)*13+11], PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;

            } else if (Tactical.equals(ControlBall) && PlayerPosition[w - 1].equals(Defender)) {
                double abilitynow = calculation3.AbilityCalculate(PlayerAbility[(w-1)*13+1] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+2] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10], PlayerAbility[(w-1)*13+11], PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13]);
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;


            } else if (Tactical.equals(Counterattack) && PlayerPosition[w - 1].equals(Forward)) {
                double abilitynow = calculation1.AbilityCalculate(PlayerAbility[(w-1)*13+1], PlayerAbility[(w-1)*13+2], PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7], PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+11] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13] * (1 + AddtionalWeiht));
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;

            } else if (Tactical.equals(Counterattack) && PlayerPosition[w - 1].equals(Midfield)) {
                double abilitynow = calculation2.AbilityCalculate(PlayerAbility[(w-1)*13+1], PlayerAbility[(w-1)*13+2], PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7], PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+11] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13] * (1 + AddtionalWeiht));
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;

            } else if (Tactical.equals(Counterattack) && PlayerPosition[w - 1].equals(Defender)) {
                double abilitynow = calculation3.AbilityCalculate(PlayerAbility[(w-1)*13+1], PlayerAbility[(w-1)*13+2], PlayerAbility[(w-1)*13+3], PlayerAbility[(w-1)*13+4], PlayerAbility[(w-1)*13+5], PlayerAbility[(w-1)*13+6], PlayerAbility[(w-1)*13+7], PlayerAbility[(w-1)*13+8], PlayerAbility[(w-1)*13+9], PlayerAbility[(w-1)*13+10] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+11] * (1 + AddtionalWeiht), PlayerAbility[(w-1)*13+12], PlayerAbility[(w-1)*13+13] * (1 + AddtionalWeiht));
                System.out.print("\n" + "The ability of the player now is " + abilitynow);
                PlayerAbilitynow[w-1] = abilitynow;

            }

        }//end of for(tactical)

    }
    public void Captain(){
        System.out.print("\nPlease give the abilities of spirituality,clam and SpeechAbility(1-100)");
        int spirituality = scanner.nextInt();
        int clam = scanner.nextInt();
        int SpeechAbility = scanner.nextInt();
        double ComprehensiveAbility = Captain.captain(spirituality,clam,SpeechAbility);
        if(ComprehensiveAbility>85){
            System.out.print("\n The Player is a wonderful leader and he is one of the best choices for the position of 'Captain'.\nHe can support his teammembers even in a desperate condition,and he can connect his team as one person and make his teammembers unity");

        }
        else if (ComprehensiveAbility > 65 && ComprehensiveAbility<=85){
            System.out.print("\n The Player is a good leader and he is a good choice for the position of 'Captain'.\nHe can give his members support and help on the spirit");
        }
        else if (ComprehensiveAbility <= 65){
            System.out.print("\n The player may not be a good leader and he may cannot encourage his members to keep fighting");
        }
    }



    public void add() {

        System.out.print("Please give the position of the player ( Forward or Midfield or Defender ):" + "\n");
        String w =scanner.nextLine();//avoid bug
        System.out.print(w);
        String position = scanner.nextLine();
        int i = Number[1];
        PlayerPosition[i] = position;


        if (position.equals(Forward)) {

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
            double OffensiveAwareness = scanner.nextDouble();
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
            double ability = calculation1.AbilityCalculate(GroundPassing, AerialPassing, Shooting, Heading, Jumping, OffensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl);
            System.out.print(" The player " + Name + " ability is " + ability);
            PlayerName[i] = Name;
            PlayerNumber[i] = ability;
            PlayerAbility[i*13+1]= GroundPassing;
            PlayerAbility[i*13+2]= AerialPassing;
            PlayerAbility[i*13+3]= Shooting;
            PlayerAbility[i*13+4]= Heading;
            PlayerAbility[i*13+1]= Jumping;
            PlayerAbility[i*13+6]= OffensiveAwareness;
            PlayerAbility[i*13+7]= BallControl;
            PlayerAbility[i*13+8]= Dribbling;
            PlayerAbility[i*13+9]= Arc;
            PlayerAbility[i*13+10]= Speed;
            PlayerAbility[i*13+11]= Accelerateing;
            PlayerAbility[i*13+12]= BodyContact;
            PlayerAbility[i*13+13]= BodyControl;
            Number[1]= i+1;
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

            double ability = calculation2.AbilityCalculate(GroundPassing, AerialPassing, Shooting,  OffeensiveAwareness, BallControl, Dribbling, Arc, Speed, Accelerateing, BodyContact, BodyControl, DefensiveAwareness, SlideTackle);
            System.out.print(" The player " + Name + " ability is " + ability);
            PlayerName[i] = Name;
            PlayerNumber[i] = ability;
            PlayerAbility[i*13+1]= GroundPassing;
            PlayerAbility[i*13+2]= AerialPassing;
            PlayerAbility[i*13+3]= Shooting;
            PlayerAbility[i*13+4]= OffeensiveAwareness;
            PlayerAbility[i*13+1]= BallControl;
            PlayerAbility[i*13+6]= Dribbling;
            PlayerAbility[i*13+7]= Arc;
            PlayerAbility[i*13+8]= Speed;
            PlayerAbility[i*13+9]= Accelerateing;
            PlayerAbility[i*13+10]= BodyContact;
            PlayerAbility[i*13+11]= BodyControl;
            PlayerAbility[i*13+12]= DefensiveAwareness;
            PlayerAbility[i*13+13]= SlideTackle;
            Number[1]= i+1;

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
            PlayerName[i] = Name;
            PlayerNumber[i] = ability;
            PlayerAbility[i*13+1]= GroundPassing;
            PlayerAbility[i*13+2]= AerialPassing;
            PlayerAbility[i*13+3]= Heading;
            PlayerAbility[i*13+4]= Jumping;
            PlayerAbility[i*13+1]= DefensiveAwareness;
            PlayerAbility[i*13+6]= SlideTackle;
            PlayerAbility[i*13+7]= BallControl;
            PlayerAbility[i*13+8]= Dribbling;
            PlayerAbility[i*13+9]= Arc;
            PlayerAbility[i*13+10]= Speed;
            PlayerAbility[i*13+11]= Accelerateing;
            PlayerAbility[i*13+12]= BodyContact;
            PlayerAbility[i*13+13]= BodyControl;
            Number[1]= i+1;


        }
    }
    public  void Delete() {
        System.out.print("\nHave the palyer you wan to Delete gived the tactical?(Yes or No)  ");
        String w = scanner.nextLine();
        String q = scanner.nextLine();
        if (q.equals(No)) {
            System.out.print("\n 'Which Player do you want to delete?(give the number of the number)");
            int d = scanner.nextInt();
            for (int i = d; i < Number[1] + 1; i++) {
                PlayerNumber[i - 1] = PlayerNumber[i];
                PlayerName[i - 1] = PlayerName[i];
                PlayerPosition[i-1] = PlayerPosition[i];
            }
            Number[1] = Number[1] - 1;
            System.out.print("\nYou have succeeded Deleting the Player's data");
        }
        else if( q.equals(Yes)){
            System.out.print("\n 'Which Player do you want to delete?(give the number of the number)");
            int d = scanner.nextInt();
            for (int i = d; i < Number[1] + 1; i++) {
                PlayerNumber[i - 1] = PlayerNumber[i];
                PlayerName[i - 1] = PlayerName[i];
                PlayerPosition[i-1] = PlayerPosition[i];
            }
            PlayerAbilitynow[d-1] = PlayerAbilitynow[150];
            Number[1] = Number[1] - 1;
            System.out.print("\nYou have succeeded Deleting the Player's data");

        }
    }



    }//end of Class Main
