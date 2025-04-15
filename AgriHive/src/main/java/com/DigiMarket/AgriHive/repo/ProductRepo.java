package com.DigiMarket.AgriHive.repo;

import com.DigiMarket.AgriHive.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByFarmFarmId(Long farmId);

}
