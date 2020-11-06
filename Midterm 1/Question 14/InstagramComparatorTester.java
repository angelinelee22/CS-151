import java.util.ArrayList;
import java.util.Collections;

public class InstagramComparatorTester {
    public static void main(String[] args) {
        InstagramAccount acc1 = new InstagramAccount("maria", 100, 120);
        InstagramAccount acc2 = new InstagramAccount("joseph", 150, 40);
        InstagramAccount acc3 = new InstagramAccount("my_cat", 100, 7);

        ArrayList<InstagramAccount> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        Collections.sort(accounts);
        for(InstagramAccount acc : accounts) {
            System.out.println(acc);
        }
    }
}