import java.util.Map;
import java.util.TreeMap;

public class Bank {

    private Map<String, Konto> kontoMap = new TreeMap<>();


    public boolean create(Konto konto) {
        if (!kontoMap.containsKey(konto.getName())) {
            kontoMap.put(konto.getName(), konto);
            return true;
        }
        return false;
    }

}

