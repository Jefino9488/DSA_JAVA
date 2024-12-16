package Encapsulation;

class basicEncapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
    public static void main(String[] args) {
        basicEncapsulation person = new basicEncapsulation();
        person.setName("Alice");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}