package com.russun.shop.repos;

import com.russun.shop.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepos extends CrudRepository<Client, Integer> {
}
