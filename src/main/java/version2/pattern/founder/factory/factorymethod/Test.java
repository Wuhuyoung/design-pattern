package version2.pattern.founder.factory.factorymethod;

public class Test {
    public static void main(String[] args) {
        RuleConfig ruleConfig = RuleConfigSource.load("./config.json");
        System.out.println(ruleConfig);
    }
}
