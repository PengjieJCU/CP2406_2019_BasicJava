package week7;

public class DemoHorses {
    public static void main(String[] args) {
        Horse horse0 = new Horse();
        horse0.setName("HORSE 0");
        horse0.setBirthYear(2019);
        horse0.setColor("White");
        RaceHorse horse1 = new RaceHorse();
        horse1.setRaces(11324);
        System.out.println("Horse name: "+horse0.getName() + "\nbirth year: " + horse0.getBirthYear() + "\nthe color is" + horse0.getColor()+"\nthe race is " + horse1.getRaces());
    }
}
