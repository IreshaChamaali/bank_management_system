package iresha.bankmanagementsystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="branch")
@Setter
@Getter
@ToString
public class Branch {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	@ManyToOne
	@JoinColumn(name="bank_id",nullable=false)
	private Bank bank;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="branch" )
	private Set<Employee> employee;
	
}
