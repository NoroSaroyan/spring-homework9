package ru.gb.inventory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.inventory.entity.UsersRole;

public interface RoleRepository extends PagingAndSortingRepository<UsersRole, Long> {

}