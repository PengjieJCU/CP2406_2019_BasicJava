package week8;

public class UseDivison {
    public static void main(String[] args) {
        InternationDivision internationDivision = new InternationDivision("Division 1",122345, "China", "Chinese");
        internationDivision.display();
        DomesticDivision domesticDivision = new DomesticDivision("Division name2",21455,"QLD");
        domesticDivision.display();
    }
}
