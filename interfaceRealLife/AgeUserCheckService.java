package interfaceRealLife;

public class AgeUserCheckService implements IUserCheckService {

	@Override
	public boolean checkUser(User user) {
		if (user.getAge() >= 18) {
			return true;
		} else {
			return false;
		}
	}

}
