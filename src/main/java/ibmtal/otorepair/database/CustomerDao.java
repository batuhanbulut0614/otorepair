package ibmtal.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
