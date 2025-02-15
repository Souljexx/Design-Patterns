public class File implements IFileSystem{
    private String name;

    public File(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return "Fichier : "+this.name;
    }
}
