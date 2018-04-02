import javax.swing.event.TableModelListener;

class Person implements Model {
  String[] names = new String[]{
    "John",
    "Billy"
  };
  int[] ages = new int[]{
    23,
    26
  };
  boolean[] isAlive = new boolean[]{
    true,
    false
  };
  public void saveStrings(String[] s){
    names = s;
  }
  public void saveInts(int[] i){
    ages = i;
  }
  public void saveBool(boolean[] b){
    isAlive = b;
  }
  public void saveList(Model[] m){
    m = null;
  }
  public String[] getStrings(){
    return names;
  }
  public int[] getInts(){
    return ages;
  }
  public boolean[] getBool(){
    return isAlive;
  }
  public Model[] getList(){
  }
}
