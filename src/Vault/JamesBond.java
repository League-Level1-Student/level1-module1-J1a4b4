package Vault;

public class JamesBond {
void findCode(Vault vault) {
for (int i = 0; i < 1000001; i++) {
vault.tryCode(i);
if (vault.guessAccuracy == true) {
System.out.println(i);
}
}
}
}
