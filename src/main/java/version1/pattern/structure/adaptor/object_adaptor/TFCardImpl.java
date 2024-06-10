package version1.pattern.structure.adaptor.object_adaptor;

/**
 * TF卡实现类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "read from TF card";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("write to TF card:" + msg);
    }
}
