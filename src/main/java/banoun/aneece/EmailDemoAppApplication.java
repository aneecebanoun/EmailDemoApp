package banoun.aneece;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailDemoAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmailDemoAppApplication.class, args);
	}

	@Autowired
	MailService mailService;

	@Override
	public void run(String... args) throws Exception {

		mailService.sendSimpleMessage("to@yahoo.com", "SUBJECT TEST", "BODY TEST");
		mailService.sendMessageWithAttachment("to@yahoo.com", "SUBJECT TEST", "BODY TEST", "TEST.txt");

	}

}
