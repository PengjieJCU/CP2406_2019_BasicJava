package week8;

public class NonMetalElement extends Element {
    public NonMetalElement(String symbol1, int number, int weight){
        super(symbol1,number,weight);
    }
    @Override
    public void describeElement() {
        System.out.println("***********Non-Metal Element***********");
        System.out.println("Symbol: " + getSymbol()+"\nAtomic number: " + getAtomicNumber() + "\nAtomic weight: "+getAtomicWeight());
    }
}
