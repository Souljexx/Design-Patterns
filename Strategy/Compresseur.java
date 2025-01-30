import java.io.File;
import java.util.ArrayList;

public class Compresseur {
    private IStrategie strategie;
    private ArrayList<File> files;

    public void setStrategie(IStrategie str){
        this.strategie = str;
    }

    public void setFichier(ArrayList<File> fichiers){
        this.files = fichiers;
    }

    public void creerArchive(){
        for(File fs: files){
            strategie.execute(fs);
        }
    }
}
