import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Trees_homework {
  public static void main(String... args){
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("type", "oak");
    row0.put("leaf color", "green");
    row0.put("age", 22);
    row0.put("sex", "male")
    map.add( row0 );

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("type", "birch");
    row1.put("leaf color", "brown");
    row1.put("age", 12);
    row1.put("sex", "male")
    map.add( row1 );

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("type", "maple");
    row2.put("leaf color", "red");
    row2.put("age", 40);
    row2.put("sex", "female")
    map.add( row2 );

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("type", "apple tree");
    row3.put("leaf color", "green");
    row3.put("age", 40);
    row3.put("sex", "female")
    map.add( row3 );

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("type", "pear tree");
    row4.put("leaf color", "grey");
    row4.put("age", 3);
    row4.put("sex", "female")
    map.add( row4 );



  }
}

