package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Experience;

public interface ExperienceService {

	Result add(Experience experience);
	
	Result addAll(List<Experience> experiences);
	
	DataResult<List<Experience>> getExperiencesDescById(int jobSeekerId);
}
