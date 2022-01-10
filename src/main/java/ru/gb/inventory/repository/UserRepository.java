package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User getById (Long id);
}