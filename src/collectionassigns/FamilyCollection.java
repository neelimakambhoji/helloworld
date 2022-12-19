package collectionassigns;

import java.util.ArrayList;
import java.util.List;

public class FamilyCollection {
    public List<Family> getFamilies(){
        ArrayList<Family>Families = new ArrayList<>();
        Families.add(new Family("Neelima", "1851knightsBridgeRd",77,"Irving"));
        Families.add(new Family("Akshara", "1900LunaRd",234,"plano"));
        Families.add(new Family("Advaith", "1850knightsBridgeRd",77,"valley"));
        return Families;
    }
}
