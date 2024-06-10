package version1.pattern.structure.adaptor.class_adaptor;

/**
 * 计算机类，只有SD卡接口
 */
public class Computer {
    public String readFromSDCard(SDCard sdCard) {
        String msg = sdCard.readSD();
        return msg;
    }

    public void writeToSDCard(SDCard sdCard, String msg) {
        sdCard.writeSD(msg);
    }
}
