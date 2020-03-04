import java.util.Scanner;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Password_Checker {


        public static void main(String [] args)throws Exception{

            String password;
            String [] log={"Albert~122","Allie1000","Pass.word"};
            Scanner key=new Scanner(System.in);


            System.out.println("Password criteria:\n" +
                    "1.    password should exist\n" +
                    "2.    password should be longer than than 8 characters\n" +
                    "3.    password should have at least one lowercase letter\n" +
                    "4.    password should have at least one uppercase letter\n" +
                    "5.    password should at least have one digit\n" +
                    "6.    password should have at least one special character\n");


            System.out.println("Enter password: ");
            password=key.next();

            try
            {
                for(String exist:log) {
                    if (password.matches(exist)) {

                        validatePassword(password);
                    }

                }

            }
            catch (PasswordException e)
            {
                System.out.println(e.getMessage());
            }


        }
        public static void validatePassword(String password)throws Exception {

            boolean checkUpper = false;
            boolean checkLower = false;
            boolean checkNumber = false;
            boolean specCharacters = false;



            if (password.length() < 8) {

                throw new PasswordException("password should be longer than than 8 characters");
            }


            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {


                    checkUpper = true;
                }

                if (Character.isLowerCase(c)) {

                    checkLower = true;
                }

                if (Character.isDigit(c)) {

                    checkNumber = true;
                }
                if (password.matches("(?=.*[~!@#$%^&*()_-" + "]).*")) {

                    specCharacters = true;

                }
            }

            if (!checkUpper) {
                throw new PasswordException("password should have at least one uppercase letter");
            }
            if (!checkLower) {
                throw new PasswordException("password should have at least one lowercase letter");
            }
            if (!checkNumber) {
                throw new PasswordException("password should at least have one digit");
            }
            if (!specCharacters) {
                throw new PasswordException("password should have at least one special character");
            }

            System.out.println("Your password is valid!");



        }

    }


