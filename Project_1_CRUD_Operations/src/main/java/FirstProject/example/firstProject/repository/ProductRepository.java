package FirstProject.example.firstProject.repository;

import FirstProject.example.firstProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}


//Explanation:
//JpaRepository<Product, Long> → Provides built-in CRUD operations for Product with Long as the ID type.