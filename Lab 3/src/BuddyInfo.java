public class BuddyInfo {
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;
    public static void main(String[] args) {
        BuddyInfo name1 = new BuddyInfo("Homer", "Carleton", "613213");
        System.out.println("Hello " + name1.name);
    }
}
