public class Captain {
    int spirituality;
    int clam;
    int SpeechAbility;
    public static double captain(int spirituality,int clam, int SpeechAbility){
        return spirituality* 0.4+clam*0.4+SpeechAbility*0.2;
    }

    public int getSpirituality() {
        return spirituality;
    }
    public int getClam(){
        return clam;
    }
    public int getSpeechAbility(){
        return SpeechAbility;
    }
}
