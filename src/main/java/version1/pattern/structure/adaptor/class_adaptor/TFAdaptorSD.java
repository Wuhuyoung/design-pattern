package version1.pattern.structure.adaptor.class_adaptor;

/**
 * 适配器，将 TFCard接口转换为 SDCard接口
 */
public class TFAdaptorSD extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
