package version1.pattern.behavior.interpret;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 创建变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 6);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 创建表达式 a - (b + c - d)
        AbstractExpression expression = new Minus(a, new Minus(new Plus(b, c), d));
        int result = expression.interpret(context);
        System.out.println(expression);
        System.out.println(result);
    }
}
