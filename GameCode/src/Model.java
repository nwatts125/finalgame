interface Model{
    public void saveStrings(String[] s);
    public void saveInts(int[] i);
    public void saveBool(boolean[] b);
    public void saveList(Model[] m);
    public String[] getStrings();
    public int[] saveInts();
    public boolean[] saveBool();
    public Model[] saveList();
}