//package files;
//
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        Map<String, String> inData = parseFile();
//    }
//        private static Map<String,String> parseFile() throws IOException {
//            HashMap<String,String> data = new HashMap<>();
//            Files.readAllLines(Paths.get(".src/files/resources.file.txt")).forEach(
//                    l->{
//                        String[] tmp = l.split(":");
//                        data.put(tmp[0].trim(),tmp[1].trim());
//                    }
//
//
//            );
//
//
//        return data;
//        }
//        public void readXML() throws IOException, SAXException, ParserConfigurationException {
//        File XmlFile = new File ("data.xml")
//
//
//    }
//}
