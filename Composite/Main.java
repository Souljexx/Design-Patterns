public class Main {
    public static void main(String[] args){
        Directory root = new Directory("/");
        Directory var = new Directory("/var");
        Directory boot = new Directory("/boot");
        Directory bin = new Directory("/bin");
        Directory etc = new Directory("/etc");

        root.add(new File("firewall.sh"));
        boot.add(new File("index.html"));

        System.out.println(root.getName());
        System.out.println(boot.getName());
    }
}
