public class BuddyInfo {
    public BuddyInfo(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {
        BuddyInfo name1 = new BuddyInfo("Homer");
        System.out.println("Hello " + name1.name);
    }
}