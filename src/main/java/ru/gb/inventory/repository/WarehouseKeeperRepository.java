package ru.gb.inventory.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.inventory.entity.WarehouseKeeper;

import java.util.Optional;

@Repository
public interface WarehouseKeeperRepository extends JpaRepository<WarehouseKeeper, Long> {
    Optional<WarehouseKeeper> findByEmail(String email);
}