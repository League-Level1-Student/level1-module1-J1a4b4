package Vault;

public class VaultRunner {

	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond james = new JamesBond();
		james.findCode(vault);
	}

}
