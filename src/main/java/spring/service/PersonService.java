package spring.service;

import spring.model.Person;

import java.util.List;


public interface PersonService {
    public List<Person> getListFromService();
    Person show(int id);
    public void save(Person person);
    public void update(Person updatedPerson);
    public void delete(int id);
}
