package ru.itis.tableinheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.itis.tableinheritance.models.Human;

public interface HumansRepository extends CrudRepository<Human, Long> {
}
