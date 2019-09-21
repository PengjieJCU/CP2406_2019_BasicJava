package week8;

public class ElementArray {
    public static void main(String[] args) {
        Element element[] = new Element[2];

        element[0] = new MetalElement("Meltal Element type 1", 13,203);
        element[1] = new NonMetalElement("Non-metal element type 2", 51, 143);

        for(int i = 0; i < element.length; ++i){
            element[i].describeElement();
        }
    }
}
