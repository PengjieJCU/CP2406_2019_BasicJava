package week8;

public class TwoEventParticipants {
    public static void main(String[] args) {
        Participant minimarathon[] = new Participant[8];
        Participant divingCompetition[] = new Participant[8];

        minimarathon[0] = new Participant("Participant 1", 23, "JCU");
        minimarathon[1] = new Participant("Participant 2", 21, "JCU");
        minimarathon[2] = new Participant("Participant 3", 24, "JCU");
        minimarathon[3] = new Participant("Participant 4", 22, "JCU");
        minimarathon[4] = new Participant("Participant 5", 23, "JCU");
        minimarathon[5] = new Participant("Participant 6", 25, "JCU");
        minimarathon[6] = new Participant("Participant 7", 21, "JCU");
        minimarathon[7] = new Participant("Participant 8", 23, "JCU");

        divingCompetition[0] = new Participant("Participant 1", 26, "JCU");
        divingCompetition[1] = new Participant("Participant 2", 25, "JCU");
        divingCompetition[2] = new Participant("Participant 3", 28, "JCU");
        divingCompetition[3] = new Participant("Participant 4", 29, "JCU");
        divingCompetition[4] = new Participant("Participant 5", 29, "JCU");
        divingCompetition[5] = new Participant("Participant 6", 28, "JCU");
        divingCompetition[6] = new Participant("Participant 7", 25, "JCU");
        divingCompetition[7] = new Participant("Participant 8", 30, "JCU");

        System.out.println("*********Mini-Marathon*********");
        for (int i = 0; i < minimarathon.length; ++i){
            System.out.println(minimarathon[i].toString());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("*********Diving Competition*********");
        for (int a = 0; a < divingCompetition.length; ++a){
            System.out.println(divingCompetition[a].toString());
        }
    }
}
