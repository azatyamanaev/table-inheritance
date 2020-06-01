package ru.itis.tableinheritance.repositories;

import org.springframework.stereotype.Repository;
import ru.itis.tableinheritance.models.Student;
import ru.itis.tableinheritance.models.University;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class UniversitiesRepositoryImpl implements UniversitiesRepository{

    //language=SQL
    private static final String SQL_SELECT_ALL = "select u from universities";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <S extends University> S save(S s) {
        return null;
    }

    @Override
    public <S extends University> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<University> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<University> findAll() {
        return entityManager.createQuery(SQL_SELECT_ALL, University.class).getResultList();
    }

    @Override
    public Iterable<University> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(University university) {

    }

    @Override
    public void deleteAll(Iterable<? extends University> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
