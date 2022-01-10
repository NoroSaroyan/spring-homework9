package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.ProductDiscount;

public interface ProductDiscountRepository extends PagingAndSortingRepository<ProductDiscount, Long> {

}