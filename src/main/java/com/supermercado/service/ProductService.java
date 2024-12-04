package com.supermercado.service;

import com.supermercado.model.Product;
import com.supermercado.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Slf4j
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        log.info("Salvando produto: {}", product.getName());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        log.info("Buscando todos os produtos");
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        log.info("Buscando produto com ID: {}", id);
        return productRepository.findById(id.intValue());
    }

    public void deleteProduct(Long id) {
        log.info("Deletando produto com ID: {}", id);
        productRepository.deleteById(id.intValue());
    }
}

