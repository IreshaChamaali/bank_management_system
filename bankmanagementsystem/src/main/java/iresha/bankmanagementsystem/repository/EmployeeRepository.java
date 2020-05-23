package iresha.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iresha.bankmanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
