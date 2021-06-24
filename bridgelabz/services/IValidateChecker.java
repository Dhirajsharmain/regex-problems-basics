package bridgelabz.services;

@FunctionalInterface
public
interface IValidateChecker {
    boolean validate(String regex, String data) throws ValidationException;
}
