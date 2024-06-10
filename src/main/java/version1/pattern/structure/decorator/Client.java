package version1.pattern.structure.decorator;

public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getName() + " " + food.cost() + "元");

        //加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getName() + " " + food.cost() + "元");

        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getName() + " " + food.cost() + "元");

        //再加一个培根
        food = new Bacon(food);
        System.out.println(food.getName() + " " + food.cost() + "元");
    }
}
