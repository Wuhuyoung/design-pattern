package version1.pattern.structure.adaptor.object_adaptor;

/**
 * TF卡接口
 */
public interface TFCard {
    String readTF();

    void writeTF(String msg);
}
