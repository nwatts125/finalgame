import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileEncoder{
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
