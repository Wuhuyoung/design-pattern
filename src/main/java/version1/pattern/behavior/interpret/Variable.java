package version1.pattern.behavior.interpret;

/**
 * 变量
 */
public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    int interpret(Context context) {
        return context.getValue(this);
    }
}
