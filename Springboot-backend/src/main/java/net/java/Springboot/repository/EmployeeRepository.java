package net.java.Springboot.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.java.Springboot.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
	

}
