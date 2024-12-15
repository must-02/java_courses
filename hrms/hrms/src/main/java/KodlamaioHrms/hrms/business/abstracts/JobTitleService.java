package KodlamaioHrms.hrms.business.abstracts;

import java.util.List;

import KodlamaioHrms.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
