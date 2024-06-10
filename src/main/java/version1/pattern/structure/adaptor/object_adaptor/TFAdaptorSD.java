package version1.pattern.structure.adaptor.object_adaptor;

/**
 * 适配器，将TF接口转换为SD接口,将TFCard对象聚合到适配器中
 */
public class TFAdaptorSD implements SDCard {

    private TFCard tfCard;

    public TFAdaptorSD(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
