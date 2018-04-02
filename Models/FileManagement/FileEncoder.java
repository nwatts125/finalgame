package Models.FileManagement;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileEncoder{
  /**
   * Save takes in a object the implements Model.
   * It will then save it to a .xml file and later be decoded.
   */
  public void save(Model mdl){
    try{
        FileOutputStream fos = new FileOutputStream("saveFile.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(mdl);
        encoder.close();
        fos.close();
    } catch (IOException ioe){
        ioe.printStackTrace();
    }
  }
}
