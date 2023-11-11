class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Example {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(-5); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
 }
    }
}