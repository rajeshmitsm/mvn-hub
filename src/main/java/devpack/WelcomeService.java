package devpack;

import org.eiichiro.gig.Service;
import org.eiichiro.jaguar.inject.Inject;
import org.eiichiro.jaguar.inject.Name;

@Name("devpack.WelcomeService")
@Service
public class WelcomeService {

	@Inject private WelcomeRepository repository;
	
	public Welcome get() {
		return repository.get();
	}
	
}
