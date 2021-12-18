package JavaLearning;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {

    @Test
    public  void test15() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Ricky",11);
        map.put("Bianca",7);
        map.put("Maddy",36);
// size of hashmap
       int mapSize= map.size();
        System.out.println(mapSize);

        //
        if(map.containsKey("Maddy")){
           int i=  map.get("Maddy");
            System.out.println("value for key"+ " Maddy" + "is " + i);

        }





    }
}
