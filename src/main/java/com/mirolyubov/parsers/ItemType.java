package com.mirolyubov.parsers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "manufacturer",
    "model",
    "dateOfManufacture",
    "color",
    "price",
    "amount"
})
public class ItemType {

    @JsonProperty("manufacturer")
    @XmlElement
    protected String manufacturer;

    @JsonProperty("model")
    @XmlElement
    protected String model;

    @JsonProperty("date_of_manufacture")
    @XmlElement(name="date_of_manufacture")
    protected String dateOfManufacture;

    @JsonProperty("color")
    @XmlElement
    protected String color;

    @JsonProperty("price")
    @XmlElement
    protected BigDecimal price;

    @JsonProperty("amount")
    @XmlElement
    protected BigInteger amount;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String value) {
        this.dateOfManufacture = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nmanufacturer='" + manufacturer + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \ndate_of_manufacture='" + dateOfManufacture + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nprice='" + price + '\'' +
                ", \namount='" + amount + '\'' +
                '\n';
    }

}
