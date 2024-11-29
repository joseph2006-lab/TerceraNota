import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transformador3 {

    public static List<Map<String, Object>> func(Map<String, Object> data) {
        
        List<String> nombres = (List<String>) data.get("nombres");
        List<Integer> edades = (List<Integer>) data.get("edades");

        List<Map<String, Object>> output = new ArrayList<>();

        for (int i = 0; i < nombres.size(); i++) {
            Map<String, Object> persona = new HashMap<>();
            persona.put("id", String.valueOf(i + 1)); 
            persona.put("nombre", nombres.get(i));  
            persona.put("edad", edades.get(i));  

            output.add(persona); 
        }

        return output;  
    }

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("nombres", List.of("Bruno", "Andrea"));
        data.put("edades", List.of(20, 19));

    
        List<Map<String, Object>> result = func(data);
        System.out.println(result);
    }
}

