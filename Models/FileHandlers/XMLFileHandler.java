import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

class XMLFileHandler{
  private Document docXML;
  public XMLFileHandler(String p){
    try{
      File xmlFile = new File(p);
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      docXML = dBuilder.parse(xmlFile);
      docXML.getDocumentElement().normalize();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Document getXMLDocument(){
    return docXML;
  }
}
