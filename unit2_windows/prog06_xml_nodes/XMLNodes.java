// XMLNodes.java - Q6: Display root node and child nodes
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class XMLNodes {
    public static void main(String[] args) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance()
                        .newDocumentBuilder().parse(new File("input.xml"));
        Element root = doc.getDocumentElement();
        System.out.println("Root Node: " + root.getNodeName());

        NodeList list = root.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            Node n = list.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Child Node: " + n.getNodeName() + " = " + n.getTextContent().trim());
            }
        }
    }
}
