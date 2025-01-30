import java.io.File;

public class StrategieZIP implements IStrategie{
    
    @Override
    public void execute(File file){
        System.out.println("Compressé avec ZIP : "+file.getName());
    }
}
