package version1.pattern.structure.bridging;

/**
 * 具体实现化（avi视频文件类）
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件:" + fileName);
    }
}
