package proj1.tamamtamam.thewall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoryListData {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> electronics = new ArrayList<String>();
        electronics.add("Mobile");
        electronics.add("Laptop");
        electronics.add("Charger");
        electronics.add("Computer");

        List<String> clothing = new ArrayList<String>();
        clothing.add("Dresses");
        clothing.add("Pants");
        clothing.add("Swimwear");
        clothing.add("Kids");
        clothing.add("Ties");

        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Tickets");
        hobbies.add("Books");
        hobbies.add("Records");
        hobbies.add("Toys");
        hobbies.add("Instruments");

        expandableListDetail.put("Electronics", electronics);
        expandableListDetail.put("Clothing", clothing);
        expandableListDetail.put("Sports & Leisure", hobbies);
        return expandableListDetail;
    }

    public static HashMap<String, Integer> getIcon() {
        HashMap<String, Integer> expandableListIcon = new HashMap<String, Integer>();

        expandableListIcon.put("Electronics", R.drawable.ic_search_black_24dp);
        expandableListIcon.put("Clothing", R.drawable.ic_home_black_24dp);
        expandableListIcon.put("Sports & Leisure", R.drawable.ic_add_circle_black_24dp);
        return expandableListIcon;
    }
}
