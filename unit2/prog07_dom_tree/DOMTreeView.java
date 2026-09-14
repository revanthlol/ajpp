// DOMTreeView.java - Q7: View the DOM tree
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class DOMTreeView {

    static void printTree(Node node, String indent) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println(indent + "+-- <" + node.getNodeName() + ">");
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                printTree(children.item(i), indent + "    ");
            }
        } else if (node.getNodeType() == Node.TEXT_NODE && !node.getNodeValue().trim().isEmpty()) {
            System.out.println(indent + "|-- " + node.getNodeValue().trim());
        }
    }

    public static void main(String[] args) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance()
                        .newDocumentBuilder().parse(new File("input.xml"));
        System.out.println("=== DOM Tree Structure ===");
        printTree(doc.getDocumentElement(), "");
    }
}
