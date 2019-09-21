package week8;

public class MetalElement extends Element{
    public MetalElement(String symbol1, int number, int weight){
        super(symbol1,number,weight);
    }

    @Override
    public void describeElement() {
        System.out.println("***********Metal Element***********");
        System.out.println("Symbol: " + getSymbol()+"\nAtomic number: " + getAtomicNumber() + "\nAtomic weight: "+getAtomicWeight());
    }
}
