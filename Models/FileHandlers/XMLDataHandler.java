import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
class XMLDataHandler{
  private Document doc;
  public XMLDataHandler(XMLFileHandler file){
    try {
      doc = file.getXMLDocument();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void displayLetters(NodeList answers) {
    for(int items = 1; items <= answers.getLength(); items++){
      Node item = answers.item(items - 1);
      //items + 64 adds 64 so that the char value will start at ascii table 64 aka @ but our item starts at 1 so it will print A
      System.out.println(String.valueOf((char)(items + 64)) + ". " + item.getTextContent());
    }
  }

  private static void displayNumbers(NodeList answers){
    for(int items = 0; items < answers.getLength(); items++){
      Node item = answers.item(items);
      System.out.println((items + 1) + ". " + item.getTextContent());
    }
  }
  private void parseQuestions(){
    try {
      System.out.println("Root Element:" + doc.getDocumentElement().getNodeName());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
  void parseMulti(){
    NodeList nodeList = doc.getElementsByTagName("Multi");
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node currentNode = nodeList.item(i);
      if(currentNode.getNodeType() == Node.ELEMENT_NODE){
        System.out.println("Element:" + currentNode.getNodeName());
        Element nodeElement = (Element) currentNode;
        if(nodeElement.getAttribute("letters").equals("true")){
          displayLetters(answers);
        }
        if(nodeElement.getAttribute("letters").equals("false")){
          displayNumbers(answers);
        }
      }
    }
  }

  void parseMultiAnswer(){
    System.out.println(nodeElement.getElementsByTagName("Multi.Question").item(0).getTextContent());
    NodeList answers = nodeElement.getElementsByTagName("Multi.Answer");
  }

  private void storeDataMulti(){
    MultiQuestion data = new MultiQuestion();
    NodeList nodeList = doc.getElementsByTagName("Muti");
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node currentNode = nodeList.item(i);
      if(currentNode.getNodeType() == Node.ELEMENT_NODE){
        System.out.println("Element:" + currentNode.getNodeName());
        Element nodeElement = (Element) currentNode;
        System.out.println(nodeElement.getElementsByTagName("Multi.Question").item(0).getTextContent());
        NodeList answers = nodeElement.getElementsByTagName("Multi.Answer");
      }
    }
  }
}
