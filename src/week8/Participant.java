package week8;

public class Participant {
    int participantAge;
    String participantname;
    String participantAddress;

    public Participant(String name, int ages, String address){
        participantname = name;
        participantAge = ages;
        participantAddress = address;
    }

    public String getParticipantname(){
        return participantname;
    }

    public int getParticipantAge(){
        return participantAge;
    }

    public String getParticipantAddress(){
        return participantAddress;
    }

    public String toString(){
        return "Participant Name: " + participantname + "Participant Age: " + participantAge + "Participant Address: " + participantAddress;
    }

    public void equals(Participant participant){
        if (participantname.equals(participant.getParticipantname()))
            if (participantAge == participant.getParticipantAge())
                if (participantAddress.equals(participant.getParticipantAddress()))
                    System.out.println("Two participants are one person");

    }
}
