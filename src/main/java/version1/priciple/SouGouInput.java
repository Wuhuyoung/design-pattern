package version1.priciple;

/**
 * 搜狗输入
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
