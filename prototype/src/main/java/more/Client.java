package more;

/**
 * Created by yangyibo on 17/7/17.
 */
public class Client {
    public static void main(String[] args) {
        MoreCopy moreCopy = new MoreCopy();
        moreCopy.setValue("abel");
        MoreCopy clone = moreCopy.clone();
        clone.setValue("an");

        System.out.println(moreCopy.getValue());
    }
}