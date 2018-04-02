interface TableDataModel extends Model {
  public void setColumnSize();
  public void setRowSize();
  public int getColumnSize();
  public int getRowSize();
  public void setDataAt();
  public Model getDataAt();
  public Model[][] getTable();
  public void setTable(Model[][]);
}
