
package webadv.s99201105.p02;
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }

        if (args[0].equals("17206108史兴")) {
            System.out.println("用户名：" + args[0]);
            System.out.println("密文密码:" + sha256hex(args[1]));
            // flag = 1;
        }else{
            System.out.println("用户名输入错误，请重新输入");
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
