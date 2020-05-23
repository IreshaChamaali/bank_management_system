package iresha.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import iresha.bankmanagementsystem.entity.Branch;

@RepositoryRestResource(collectionResourceRel="branch", path="branch")
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
