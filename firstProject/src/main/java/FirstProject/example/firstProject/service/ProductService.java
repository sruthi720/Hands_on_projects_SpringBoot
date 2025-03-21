package FirstProject.example.firstProject.service;

import FirstProject.example.firstProject.model.Product;
import FirstProject.example.firstProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create or update a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }


    // Delete a product by ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }


}
