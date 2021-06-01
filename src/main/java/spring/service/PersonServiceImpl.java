package spring.service;

import spring.dao.PersonDAO;
import spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDAO personDao;

    public List<Person> getListFromService() {
            return personDao.getPersonList();
    }

    @Override
    public Person show(int id) {
        return personDao.show(id);
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(Person updatedPerson) {
        personDao.update(updatedPerson);
    }

    @Override
    public void delete(int id) {
        personDao.delete(id);
    }
}
