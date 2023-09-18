import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> infoList = new ArrayList<BuddyInfo>();

    public AddressBook(){}
    public AddressBook(ArrayList<BuddyInfo> infoList){
        this.infoList = infoList;
    }

    public void addBuddy(BuddyInfo buddy) {
        infoList.add(buddy);
    }

    public BuddyInfo removeBuddy(BuddyInfo buddy){
        if(infoList.contains(buddy)){
            infoList.remove(buddy);
            return buddy;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    /**
     * Didnt work the first time so I'm just commenting it out instead of rewriting everything
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(buddy);

    }
**/

}
