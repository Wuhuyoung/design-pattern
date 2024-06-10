package version1.pattern.structure.bridging;

public class Client {
    public static void main(String[] args) {
        Windows windows = new Windows(new RMVBFile());
        windows.play("盗梦空间");
    }
}
