package version1.pattern.structure.adaptor.object_adaptor;

/**
 * SD卡实现类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "read from SD card";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("write to SD Card: " + msg);
    }
}
