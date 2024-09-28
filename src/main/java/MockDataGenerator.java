import com.github.javafaker.Faker;

public class MockDataGenerator {
    public static void main(String[] args) {
        // Create an instance of the Faker class
        Faker faker = new Faker();

        // Generate a random name
        String name = faker.name().fullName(); // e.g., "John Doe"

        // Generate a random email address
        String email = faker.internet().emailAddress(); // e.g., "john.doe@example.com"

        // Generate a random phone number
        String phone = faker.phoneNumber().phoneNumber(); // e.g., "(555) 123-4567"

        // Generate a random address
        String address = faker.address().fullAddress(); // e.g., "123 Main St, Springfield, USA"

        // Generate a random company name
        String company = faker.company().name(); // e.g., "Acme Corp."

        // Display the generated mock data
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Company: " + company);
    }
}
