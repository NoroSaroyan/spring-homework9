package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import ru.gb.inventory.entity.UsersAccess;

import java.util.Optional;

public interface UsersAccessRepository extends PagingAndSortingRepository <UsersAccess, Long> {
    Optional<UsersAccess> findByEmail(@Param("email") String email);
}