package version1.pattern.behavior.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 服务请求者
 */
public class Waiter {
    private List<Command> commands = new ArrayList<>();

    public void setCommands(Command... command) {
        commands.addAll(Arrays.asList(command));
    }

    public void orderUp() {
        System.out.println("服务员接单");
        for (Command command : commands) {
            command.execute();
        }
    }
}
