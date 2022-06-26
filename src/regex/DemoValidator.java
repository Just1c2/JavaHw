package regex;

public class DemoValidator {
    public static void main(String [] args) {
        Validator simpleEmail=new Validator("^[\\\\w-_\\\\.+]*[\\\\w-_\\\\.]\\\\@([\\\\w]+\\\\.)+[\\\\w]+[\\\\w]$");
        System.out.println(simpleEmail.validate("abc@cde.com"));
        System.out.println(simpleEmail.validate("abccde.com"));
    }
}

