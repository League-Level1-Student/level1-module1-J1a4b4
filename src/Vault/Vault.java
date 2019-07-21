package Vault;

import java.util.Random;

public class Vault {
int secretCode = new Random().nextInt(1000001);
boolean guessAccuracy = false;
void tryCode(int guess) {
	if (secretCode == guess) {
	guessAccuracy = true;
	}else if (secretCode != guess) {
	guessAccuracy = false;
	}
}
}
