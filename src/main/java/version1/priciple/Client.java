package version1.priciple;

public class Client {
    public static void main(String[] args) {
        SouGouInput input = new SouGouInput();
        // AbstractSkin skin = new DefaultSkin();
        AbstractSkin skin = new BlackSkin();
        input.setSkin(skin);
        input.display();
    }
}
