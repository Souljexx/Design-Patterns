import java.util.ArrayList;

public class Directory
{
    private ArrayList<IFileSystem> fileList;
    private String name;

    public Directory(String name)
    {
        this.name = name;
        fileList = new ArrayList<IFileSystem>();
    }

    public void add(IFileSystem fs)
    {
        fileList.add(fs);
    }

    public void remove(IFileSystem fs)
    {
        fileList.remove(fs);
    }

    public String getName()
    {
        String chaine = "Répertoire : " + name +"\n";
        for (IFileSystem fs : fileList){
            chaine += fs.getName()+"\n";
        }
        return chaine;
    }
}
