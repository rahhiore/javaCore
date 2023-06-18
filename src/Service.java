import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Service {
    public static void checkLoginAndPassword(LinkedList list, String login, String password, String confirmPassword) {
        try {
            check(list, login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password or can't confirmed password");
        }

    }
    private static void check(LinkedList list, String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String regex = "[a-zA-Z0-9_]{0,19}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        if (!matcherLogin.matches()) {
            throw new WrongLoginException();
        } else if (!matcherPassword.matches() || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        LinkedList.insert(list, login, password);
    }
}
