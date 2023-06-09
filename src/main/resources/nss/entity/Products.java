package nss.entity;

import java.util.List;
/*
 * It is test entity for being mapped to kibana official data sample 'kibana_sample_data_ecommerce'
 */
public class Products {
    //If there are multiple data in a single field, the variable should be list.
    List<String> price;
    String product_name;
    List<String> manufacturer;
    public List<String> getPrice() {
        return price;
    }
    public void setPrice(List<String> price) {
        this.price = price;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public List<String> getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(List<String> manufacturer) {
        this.manufacturer = manufacturer;
    }
}
