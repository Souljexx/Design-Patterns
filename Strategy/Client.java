import java.util.ArrayList;
import java.io.File;

public class Client {
    public static void main(String[] args){
        ArrayList<File> mesFichiers = new ArrayList<File>();
        Compresseur c = new Compresseur();
        mesFichiers.add(new File("fichier1.txt"));
        mesFichiers.add(new File("fichier2.txt"));
        c.setFichier(mesFichiers);
        c.setStrategie(new StrategieRAR());
        c.creerArchive();
        
        c.setStrategie(new StrategieZIP());
        c.creerArchive();
    }  
}
