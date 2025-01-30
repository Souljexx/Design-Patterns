import java.io.File;

public class StrategieRAR implements IStrategie {
  
    @Override
    public void execute(File file) {
        System.out.println("Compressé avec RAR : "+file.getName());
    }
}
