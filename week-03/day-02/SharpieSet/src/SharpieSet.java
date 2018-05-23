

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpies;

  public SharpieSet(){
    this.sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie){
    sharpies.add(sharpie);
  }

  public int countUsable(){
    int usableSharpies = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount <= 0) {
        sharpies.get(i).usable = false;
      } else {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  public void removeTrash(){
    int removedSharpies = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).usable == false){
        sharpies.remove(i);
        removedSharpies++;
      }
    }
    System.out.println("Removed " + removedSharpies + " unusable sharpie(s).");
  }


}
