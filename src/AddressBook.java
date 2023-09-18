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



}
