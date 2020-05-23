package iresha.bankmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employee")
@Setter
@Getter
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_photo")
	private String empPhoto;
	
	@Column(name="emp_address")
	private String empAddress;
	
	@Column(name="emp_password")
	private String empPassword;

	@ManyToOne
	@JoinColumn(name="branch_id",nullable=false)
	private Branch branch;
}
