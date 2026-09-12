// Prog06_XMLRootChildNodes.java
// Unit 2: Write a Java program to display the root node and child nodes of an XML document.

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Prog06_XMLRootChildNodes {
    public static void main(String[] args) {
        try {
            // 1. Cross-platform file check (handles Windows '\' and Linux '/')
            File xmlFile = new File("unit2" + File.separator + "sample.xml");
            if (!xmlFile.exists()) {
                xmlFile = new File("sample.xml");
            }

            // 2. Initialize DOM parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;

            if (xmlFile.exists()) {
                doc = builder.parse(xmlFile);
            } else {
                // Fallback XML string: guarantees it runs even if sample.xml is not found!
                String sampleXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<university name=\"Tech University\">\n" +
                        "    <department id=\"CSE\">\n" +
                        "        <name>Computer Science</name>\n" +
                        "        <head>Dr. Smith</head>\n" +
                        "    </department>\n" +
                        "    <department id=\"ECE\">\n" +
                        "        <name>Electronics</name>\n" +
                        "        <head>Dr. Jones</head>\n" +
                        "    </department>\n" +
                        "</university>";
                InputStream is = new ByteArrayInputStream(sampleXml.getBytes(StandardCharsets.UTF_8));
                doc = builder.parse(is);
            }

            doc.getDocumentElement().normalize();

            // 3. Display Root Node
            Element root = doc.getDocumentElement();
            System.out.println("Root Node: <" + root.getNodeName() + ">");
            System.out.println("----------------------------------------------");

            // 4. Display Child Nodes of Root
            NodeList nodeList = root.getChildNodes();
            System.out.println("Child Nodes under <" + root.getNodeName() + ">:");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                // Ignore formatting/whitespace text nodes
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;
                    System.out.println("\n[Child Element]: <" + elem.getNodeName() + 
                                       (elem.hasAttribute("id") ? " id=\"" + elem.getAttribute("id") + "\"" : "") + ">");

                    // Display sub-child nodes
                    NodeList subChildren = elem.getChildNodes();
                    for (int j = 0; j < subChildren.getLength(); j++) {
                        Node subNode = subChildren.item(j);
                        if (subNode.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println("   -> " + subNode.getNodeName() + ": " + subNode.getTextContent().trim());
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error parsing XML: " + e.getMessage());
        }
    }
}
