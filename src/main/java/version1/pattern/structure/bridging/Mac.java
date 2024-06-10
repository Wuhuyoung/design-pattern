package version1.pattern.structure.bridging;

/**
 * 扩展抽象化角色：Mac操作系统
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("Mac operating system");
        videoFile.decode(fileName);
    }
}
