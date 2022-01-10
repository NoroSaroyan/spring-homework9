package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.ProductCategory;

public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Long> {

}