package KodlamaioHrms.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="job_titles")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="job_title")
	String jobTitle;
}
