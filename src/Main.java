import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args) {
        Console console1 = new Console("Nintendo Switch", 2017);
        Console console2 = new Console("Playstation 1", 1994);
        Console console3 = new Console("Xbox 360", 2005);

        //first method of initialization
        Map<String, Console> Consoles = new HashMap<>();
        Consoles.put("Nintendo", console1);
        Consoles.put("Sony", console2);
        Consoles.put("Xbox", console3);
        System.out.println("Consoles: " + Consoles);

        //second method of initialization
        Map<String, Console> Consoles2 = Map.of("Nintendo", console1, "Sony", console2, "Xbox", console3 );
        System.out.println("Consoles2: " + Consoles2);

        //third method of initialization
        Map<String, Console> Consoles3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Nintendo", console1),
                new AbstractMap.SimpleEntry<>("Sony", console2),
                new AbstractMap.SimpleEntry<>("Xbox", console3)
        );
        System.out.println("Consoles3: " + Consoles3);
    }
}