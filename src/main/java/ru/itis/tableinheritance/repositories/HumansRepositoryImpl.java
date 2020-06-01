package ru.itis.tableinheritance.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.itis.tableinheritance.models.Human;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class HumansRepositoryImpl implements HumansRepository{

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from humans";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Human> humanRowMapper = (row, rowNumber) ->
    Human.builder()
            .firstName(row.getString("first_name"))
            .lastName(row.getString("last_name"))
            .age(row.getInt("age"))
            .height(row.getInt("height"))
            .weight(row.getInt("weight"))
            .build();

    @Override
    public <S extends Human> S save(S s) {
        return null;
    }

    @Override
    public <S extends Human> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Human> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Human> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, humanRowMapper);
    }

    @Override
    public Iterable<Human> findAllById(Iterable<Long> iterable) {
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
    public void delete(Human human) {

    }

    @Override
    public void deleteAll(Iterable<? extends Human> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
