package ru.gb.inventory.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.inventory.entity.Product;
import ru.gb.inventory.entity.Warehouse;
import ru.gb.inventory.entity.WarehouseItem;
import ru.gb.inventory.entity.WarehouseItemId;

import java.util.Optional;

public interface WarehouseItemRepository extends JpaRepository<WarehouseItem, WarehouseItemId> {
    Optional<WarehouseItem> findByWarehouseAndProduct(Warehouse warehouse, Product product);
}