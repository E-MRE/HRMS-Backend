package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;

public interface PhotoService {

	Result add(Photo photo);
	
	Result addAll(List<Photo> photos);
	
	DataResult<Photo> getJobSeekerPhotoById(int jobSeekerId);
	
	DataResult<Photo> getPhotoById(int photoId);
}
