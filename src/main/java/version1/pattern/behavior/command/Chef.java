package version1.pattern.behavior.command;

/**
 * 接收者：执行命令的对象
 */
public class Chef {
    public void makeFood(String name, int num) {
        System.out.println(name + "做好了" + num + "份");
    }
}
