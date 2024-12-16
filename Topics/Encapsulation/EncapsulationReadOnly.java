package Encapsulation;

class EncapsulationReadOnly {
    private final String name;
    private final int age;

    public EncapsulationReadOnly(String name, int age) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 1 and 120.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            EncapsulationReadOnly person = new EncapsulationReadOnly("Alice", 25);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
