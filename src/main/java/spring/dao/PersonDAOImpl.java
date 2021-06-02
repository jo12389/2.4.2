package spring.dao;

import org.springframework.stereotype.Repository;
import spring.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Person> getPersonList() {
        return entityManager.createQuery("select  u from  person  u", Person.class).getResultList();
    }

    @Override
    @Transactional
    public Person show(int id) {
        return entityManager.find(Person.class,id);
    }

    @Override
    @Transactional
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    public void update(Person updatedPerson) {
        entityManager.merge(updatedPerson);
    }

    @Override
    @Transactional
    public void delete(int id) {

       entityManager.createQuery("delete from person where id = :id").setParameter("id", id).executeUpdate();


      //  entityManager.remove(entityManager.find(User.class,id));

    }
}
