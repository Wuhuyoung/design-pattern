package version1.pattern.behavior.memento;

public class Client {
    public static void main(String[] args) {
        // 创建游戏用户
        GameRole gameRole = new GameRole();
        gameRole.initState();
        System.out.println("=========游戏开始===========");
        System.out.println(gameRole);

        // 创建备忘录管理者
        RoleStateManager roleStateManager = new RoleStateManager();
        roleStateManager.addState(gameRole.saveState());

        System.out.println("=========战斗===========");
        gameRole.fight();
        System.out.println(gameRole);

        System.out.println("=========重新开始===========");
        gameRole.recoverState(roleStateManager.getBackState());
        System.out.println(gameRole);
    }
}
