// Archivo: src/main/java/fca/suayed/dto/ClientDto.java
package fca.suayed.dto;

public class ClientDto {
    private Integer id;  // La columna se llama "id" según veo
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rfc;
    
    // Constructor vacío (OBLIGATORIO para JDBI)
    public ClientDto() {}
    
    // Constructor con parámetros
    public ClientDto(String nombre, String apellidoPaterno, String apellidoMaterno, String rfc) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
    }
    
    // Getters y Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public String getRfc() {
        return rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public String toString() {
        return "ClientDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", rfc='" + rfc + '\'' +
                '}';
    }
}