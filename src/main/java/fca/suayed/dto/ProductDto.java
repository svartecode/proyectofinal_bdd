package fca.suayed.dto;

public class ProductDto {
    private Integer idProducto;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Integer idCategoria;
    private String sku;
    
    // Constructor vacío
    public ProductDto() {}
    
    // Constructor con parámetros
    public ProductDto(String name, String description, Double price, Integer stock, String sku, Integer idCategoria) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.sku = sku;
        this.idCategoria = idCategoria;
    }
    
    // Getters y Setters
    public Integer getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Integer getStock() {
        return stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public Integer getIdCategoria() {
        return idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public String getSku() {
        return sku;
    }
    
    public void setSku(String sku) {
        this.sku = sku;
    }
    
    @Override
    public String toString() {
        return "ProductDto{" +
                "idProducto=" + idProducto +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", idCategoria=" + idCategoria +
                ", sku='" + sku + '\'' +
                '}';
    }
}