package com.russun.shop.repos;

import com.russun.shop.domain.Basket;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepos extends CrudRepository<Basket, Integer> {
}
