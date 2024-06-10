package version1.pattern.structure.adaptor.object_adaptor;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        String msg = computer.readFromSDCard(sdCard);
        System.out.println(msg);
        computer.writeToSDCard(sdCard, "数据");

        System.out.println("============================");
        TFCardImpl tfCard = new TFCardImpl();
        TFAdaptorSD adaptor = new TFAdaptorSD(tfCard);
        computer.writeToSDCard(adaptor, "新数据");
        System.out.println(computer.readFromSDCard(adaptor));
    }
}
