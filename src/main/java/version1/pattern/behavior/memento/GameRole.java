package version1.pattern.behavior.memento;

/**
 * 发起人
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public GameRole() {
    }

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 10;
        this.def = 10;
    }

    // 保存备忘录状态
    public Memento saveState() {
        RoleStateMemento roleStateMemento = new RoleStateMemento();
        roleStateMemento.setVit(vit);
        roleStateMemento.setAtk(atk);
        roleStateMemento.setDef(def);
        return roleStateMemento;
    }
    // 恢复备忘录状态
    public void recoverState(Memento memento) {
        // 向下转型，只有发起人才能使用、修改备忘录的所有内容
        RoleStateMemento r = (RoleStateMemento) memento;
        this.vit = r.vit;
        this.atk = r.atk;
        this.def = r.def;
    }

    private static class RoleStateMemento implements Memento {
        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
