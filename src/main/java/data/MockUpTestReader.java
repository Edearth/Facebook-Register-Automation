package data;

public class MockUpTestReader {
	
	public static RegisterData getRegisterData() {
		RegisterData data = new RegisterData();

		data.setName("Alice");
		data.setLastname("Smith");

		data.setMail("test@test.com");
		data.setPassword("test123456");

		data.setBirthDay(10);
		data.setBirthMonth("oct");
		data.setBirthYear(1990);

		data.setGender(RegistrationGender.FEMALE);

		data.setPhoneNumber("987654321");

		return data;
	}
}
