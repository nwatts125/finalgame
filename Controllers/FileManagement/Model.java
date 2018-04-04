package Models.FileManagement;
/**
 * This is used to declare the data you want to be saved to a XML file.
 * Use the method save from the class FileEncoder to save.
 * You should make a new object that is used to save the data.
 * for example if you want to save data about a person you should
 * make a new file called Person that has the data about the person
 * like name age so on.
 */

interface Model{
  public void setStrings(String[] s);
  public void setInts(int[] i);
  public void setBool(boolean[] b);
  public void setList(Model[] m);
  public String[] getStrings();
  public int[] getInts();
  public boolean[] getBool();
  public Model[] getList();
}
