//Some code to prove that I did this part of the lab!
import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> infoList;

    public AddressBook(){ infoList = new ArrayList<>();}

    public void addBuddy(BuddyInfo bud){
        if(bud != null){
            infoList.add(bud);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < infoList.size()){
            return infoList.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("boy", "School", "512321");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);

    }

}
