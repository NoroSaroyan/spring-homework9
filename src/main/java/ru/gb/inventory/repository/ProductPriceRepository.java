package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.ProductPrice;

public interface ProductPriceRepository extends PagingAndSortingRepository<ProductPrice, Long> {

}