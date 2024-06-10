package version1.pattern.structure.adaptor.class_adaptor;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        String msg = computer.readFromSDCard(sdCard);
        System.out.println(msg);
        computer.writeToSDCard(sdCard, "数据");

        System.out.println("============================");

        TFAdaptorSD TFAdaptor = new TFAdaptorSD();
        String msg1 = computer.readFromSDCard(TFAdaptor);
        System.out.println(msg1);
        computer.writeToSDCard(TFAdaptor, "新数据");
    }
}
