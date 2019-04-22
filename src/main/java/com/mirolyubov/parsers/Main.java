package com.mirolyubov.parsers;

import javax.xml.bind.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        final String fileName = "src/main/java/com/mirolyubov/products.xml";

        Parser parser = new Parser();
        Converter converter = new Converter();
        List<CategoryType> items = parser.parseJAXB(fileName);

        System.out.println("Валидация");
        if (new XMLValidator().XMLValidation("src/main/java/com/mirolyubov/products.xml", "src/main/java/com/mirolyubov/products.xsd")) {


            System.out.println("StAX + JAXB");
            System.out.println(items);

            System.out.println("Из XML to Json");
            converter.toJSON(items);

            System.out.println("Json to Objects");
            System.out.println(converter.toJavaObject());
        } else {
            System.out.println("XML не прошел валидацию");
        }

    }

}
