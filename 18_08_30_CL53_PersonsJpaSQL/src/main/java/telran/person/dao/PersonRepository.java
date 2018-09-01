package telran.person.dao;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	Iterable<Person> findByBirthdateBetween(LocalDate fromDate, LocalDate toDate);

//	@Query("{'salary' : {'$gte':?0, '$lte':?1}}")
//	Iterable<Person> findEmployeeBySalaryBetween(int fromSalary, int toSalary);

	Stream<Person> findAllBy();
	
	Iterable<Person> findByAddressCity(String city);
}
