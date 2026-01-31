import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void testSendEmailWithoutCC_shouldThrowException() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Pen", 100);

        RuntimeException ex = assertThrows(
                RuntimeException.class,
                () -> emailService.sendEmail(order)
        );

        assertEquals("An Exception Occurred", ex.getMessage());
    }

    @Test
    void testSendEmailWithoutCC_customerNotifiedFalse() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Notebook", 200);

        try {
            emailService.sendEmail(order);
        } catch (RuntimeException e) {
        }

        assertFalse(order.isCustomerNotified());
    }

    @Test
    void testSendEmailWithCC_shouldReturnTrue() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(2, "Laptop", 50000);

        boolean result = emailService.sendEmail(order, "cc@test.com");

        assertTrue(result);
    }

    @Test
    void testSendEmailWithCC_customerNotifiedTrue() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Mouse", 1000);

        emailService.sendEmail(order, "cc@test.com");

        assertTrue(order.isCustomerNotified());
    }
}
