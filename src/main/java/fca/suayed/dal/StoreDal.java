package fca.suayed.dal;

import fca.suayed.dao.StoreDao;
import fca.suayed.dto.ProductDto;
import fca.suayed.dto.ClientDto;
import fca.suayed.dto.ResponseDto;
import fca.suayed.services.JdbiService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

@ApplicationScoped
public class StoreDal {
    
    @Inject
    JdbiService jdbiService;
    
    private static final Logger LOG = Logger.getLogger(StoreDal.class);
    
    public ResponseDto<List<ProductDto>> getProducts() {
        ResponseDto<List<ProductDto>> responseDto = new ResponseDto<>();
        
        try {
            Jdbi jdbi = jdbiService.getInstance();
            List<ProductDto> products = jdbi.withExtension(StoreDao.class, dao -> dao.getProducts());
            
            responseDto.setSuccess(true);
            responseDto.setData(products);
            LOG.info("Productos obtenidos: " + products.size());
            
        } catch (Exception e) {
            responseDto.setSuccess(false);
            LOG.error("Error en getProducts: " + e.getMessage(), e);
        }
        
        return responseDto;
    }
    
    public ResponseDto<String> addProduct(ProductDto productDto) {
        ResponseDto<String> responseDto = new ResponseDto<>();
        
        try {
            Jdbi jdbi = jdbiService.getInstance();
            jdbi.useExtension(StoreDao.class, dao -> dao.addProduct(productDto));
            
            responseDto.setSuccess(true);
            responseDto.setData("Producto agregado exitosamente");
            LOG.info("Producto agregado: " + productDto.getName());
            
        } catch (Exception e) {
            responseDto.setSuccess(false);
            responseDto.setData("Error al agregar producto");
            LOG.error("Error en addProduct: " + e.getMessage(), e);
        }
        
        return responseDto;
    }
    
    public ResponseDto<List<ClientDto>> getClients() {
        ResponseDto<List<ClientDto>> responseDto = new ResponseDto<>();
        
        try {
            Jdbi jdbi = jdbiService.getInstance();
            List<ClientDto> clients = jdbi.withExtension(StoreDao.class, dao -> dao.getClients());
            
            responseDto.setSuccess(true);
            responseDto.setData(clients);
            LOG.info("Clientes obtenidos: " + clients.size());
            
        } catch (Exception e) {
            responseDto.setSuccess(false);
            LOG.error("Error en getClients: " + e.getMessage(), e);
        }
        
        return responseDto;
    }
}
