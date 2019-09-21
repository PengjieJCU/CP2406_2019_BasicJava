package week8;

public abstract class Element {
    String symbol;
    int atomicNumber;
    int atomicWeight;

    public Element(String symbol1, int number, int weight){
        symbol = symbol1;
        atomicNumber = number;
        atomicWeight = weight;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getAtomicNumber(){
        return atomicNumber;
    }

    public int getAtomicWeight(){
        return atomicWeight;
    }

    public abstract void describeElement();
}
