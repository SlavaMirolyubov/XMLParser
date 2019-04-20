package com.mirolyubov.parsers;

import javax.xml.bind.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        final String fileName = "src/main/java/com/mirolyubov/products.xml";

        Parser parser = new Parser();
        List<CategoryType> items = parser.parseJAXB(fileName);

        System.out.println("StAX + JAXB");
        System.out.println(items);

        System.out.println("Из XML to Json");
        Converter.toJSON(items);

        System.out.println("Json to Objects");
        System.out.println(Converter.toJavaObject());

    }

}
