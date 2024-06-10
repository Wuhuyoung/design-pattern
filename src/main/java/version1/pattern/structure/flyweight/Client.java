package version1.pattern.structure.flyweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        AbstractBox oBox = factory.getBox("OBox");
        oBox.display("红色");

        AbstractBox oBox1 = factory.getBox("OBox");
        oBox1.display("蓝色");

        System.out.println(oBox == oBox1);
    }
}
