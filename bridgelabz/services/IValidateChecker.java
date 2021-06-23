package bridgelabz.services;

@FunctionalInterface
interface IValidateChecker {
    boolean validate(String pattern, String data);
}
