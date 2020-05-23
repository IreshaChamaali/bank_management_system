package iresha.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iresha.bankmanagementsystem.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {

}
