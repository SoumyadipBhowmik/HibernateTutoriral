package hibernate_basics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_basics.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void create(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		System.out.println("Created");
	}
	public void update(Employee employee) {
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}
	public void delete(Employee employee) {
		entityTransaction.begin();
		entityManager.remove(employee);
	}
	public Employee findByID(int id) {
		return entityManager.find(Employee.class, id);
	}
	public List<Employee> findAll() {
		 List<Employee> list = entityManager.createQuery("select a from Employee a", Employee.class).getResultList();
		 return list;
	}
}
