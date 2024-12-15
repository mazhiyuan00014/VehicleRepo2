public class compare {
    double Play1Ability;
    double Play2Ability;
    compare(float Play1Ability , float Play2Ability) {
        this.Play1Ability = Play1Ability;
        this.Play2Ability = Play2Ability;
        if (Play1Ability>Play2Ability) {
            System.out.println("Player1 is better"+ "\n"+ Play1Ability);
        }else if (Play1Ability == Play2Ability) {
            System.out.println("Player2 is better" + "\n" + Play2Ability);
        }else if (Play1Ability<Play2Ability ){
            System.out.println("The two players' ability is equivalent" + "\n" + Play1Ability + "\n" +Play2Ability);
        }





    }//end of compare
}//end of class
