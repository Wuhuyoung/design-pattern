package version1.pattern.structure.bridging;

/**
 * 具体实现化（RMVB视频文件类）
 */
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB视频文件:" + fileName);
    }
}
