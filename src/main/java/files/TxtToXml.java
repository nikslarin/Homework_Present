package files;

import java.io.*;

import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;


public class TxtToXml {

    BufferedReader in;
    StreamResult out;
    TransformerHandler th;

    public static void main(String args[]) {
        new TxtToXml().begin();
    }

    public void begin() {
        try {
            in = new BufferedReader(new FileReader("./src/files/resources/file.txt"));
            out = new StreamResult("./src/files/resources/data.xml");
            openXml();
            String str;
            while ((str = in.readLine()) != null) {
                process(str);
            }
            in.close();
            closeXml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openXml() throws TransformerConfigurationException, SAXException {

        SAXTransformerFactory tf = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        th = tf.newTransformerHandler();

        // pretty XML output
        Transformer serializer = th.getTransformer();
        serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        serializer.setOutputProperty(OutputKeys.INDENT, "yes");

        th.setResult(out);
        th.startDocument();
        th.startElement(null, null, "Item", null);
    }

    public void process(String str) throws SAXException {
        th.startElement(null, null, "value", null);
        th.characters(str.toCharArray(), 0, str.length());
        th.endElement(null, null, "value");
    }

    public void closeXml() throws SAXException {
        th.endElement(null, null, "Item");
        th.endDocument();
    }
}