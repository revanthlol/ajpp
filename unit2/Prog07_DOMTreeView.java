// Prog07_DOMTreeView.java
// Unit 2: Write a Java program to view the DOM tree.

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Prog07_DOMTreeView {

    // Recursive method to display the DOM tree with indentation
    public static void printDOMTree(Node node, String indent) {
        // Ignore whitespace-only text nodes for clean tree viewing
        if (node.getNodeType() == Node.TEXT_NODE && node.getNodeValue().trim().isEmpty()) {
            return;
        }

        // Display node based on its type (Pure ASCII for cross-platform cmd/terminal compatibility)
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println(indent + "+-- [ELEMENT] <" + node.getNodeName() + ">");
        } else if (node.getNodeType() == Node.TEXT_NODE) {
            System.out.println(indent + "    |-- [TEXT] \"" + node.getNodeValue().trim() + "\"");
        }

        // Recursively visit all child nodes
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            printDOMTree(children.item(i), indent + "    ");
        }
    }

    public static void main(String[] args) {
        try {
            // 1. Cross-platform file check (handles Windows '\' and Linux '/')
            File xmlFile = new File("unit2" + File.separator + "sample.xml");
            if (!xmlFile.exists()) {
                xmlFile = new File("sample.xml");
            }

            // 2. Parse XML into DOM
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

            System.out.println("==============================================");
            System.out.println("              DOM TREE STRUCTURE              ");
            System.out.println("==============================================");
            printDOMTree(doc.getDocumentElement(), "");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
