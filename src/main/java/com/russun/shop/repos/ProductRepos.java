package com.russun.shop.repos;

import com.russun.shop.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepos extends CrudRepository<Product, Integer> {
}
