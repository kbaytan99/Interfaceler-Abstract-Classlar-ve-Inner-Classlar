package interfaceRealLife;

public class signUpManager {
	private IUserCheckService iUserCheckService;

	public signUpManager(IUserCheckService iUserCheckService) {
		this.iUserCheckService = iUserCheckService;
	}

	public void signUp(User user) {

		if (iUserCheckService.checkUser(user)) {
			System.out.println("Kullanici kayit oldu: " + user.getName());
		} else {
			System.out.println("Kayit olamadiniz..");
		}

	}
}
