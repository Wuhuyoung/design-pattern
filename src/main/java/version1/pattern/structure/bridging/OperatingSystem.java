package version1.pattern.structure.bridging;

/**
 * 抽象化角色：操作系统类
 */
public abstract class OperatingSystem {
    //其中聚合了实现化对象的引用
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
