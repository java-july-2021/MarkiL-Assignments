import java.util.HashMap;
import java.util.Set;
public class HashmatiqueMap {
    public static void main(String[] args){
        HashMap<String, String> ourMap = new HashMap<String, String>();
        ourMap.put("Cozy", "At the bonfire on the beach");
        ourMap.put("Waves", "Rock my boat");
        ourMap.put("Coral", "My beloved");
        ourMap.put("Starboard", "Follow the winds");

        String name = ourMap.get("Coral");
        System.out.println("The song title is: " + name);

        Set<String> keys = ourMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(ourMap.get(key));
        }
    }
}
