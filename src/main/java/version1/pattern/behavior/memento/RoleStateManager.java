package version1.pattern.behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 存储所有的备忘录状态
 */
public class RoleStateManager {
    private Deque<Memento> stack; // 使用栈来存储

    public RoleStateManager() {
        stack = new ArrayDeque<>();
    }

    public Memento getBackState() {
        return stack.pop();
    }

    public void addState(Memento memento) {
        stack.push(memento);
    }
}

