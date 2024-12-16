    package Encapsulation;

class EncapsulationDerivedProperties {
    private final String firstName;
    private final String lastName;

    public EncapsulationDerivedProperties(String firstName, String lastName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name cannot be empty.");
        }

        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName; // Derived property
    }

    public static void main(String[] args) {
        try {
            EncapsulationDerivedProperties person = new EncapsulationDerivedProperties("John", "Doe");
            System.out.println("Full Name: " + person.getFullName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
