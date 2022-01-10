package ru.gb.inventory.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}