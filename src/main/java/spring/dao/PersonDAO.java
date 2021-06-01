package spring.dao;

import spring.model.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> getPersonList();
    Person show(int id);
    void save(Person person);
    void update(Person person);
    void delete(int id);
}
