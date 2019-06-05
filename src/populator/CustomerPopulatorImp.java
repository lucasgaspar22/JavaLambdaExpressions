package populator;

import java.util.Date;
import java.util.GregorianCalendar;

import model.Customer;

public class CustomerPopulatorImp implements CustomerPopulator{

	@Override
	public Customer generateCustomer(Long id) {
		String name = "Cust_" + id;
        Date birthDate = generateRandomBirthDate();
        String gender = generateRandomGender();

        return new Customer(id, name, birthDate, gender);
	}
	
	private Date generateRandomBirthDate() {
        Long rDay = Math.round(Math.random() * 27 + 1);
        Long rMonth = Math.round(Math.random() * 11 + 1);
        Long rYear = Math.round(Math.random() * 50 + 1950);

        return new GregorianCalendar(rYear.intValue(), rMonth.intValue(), rDay.intValue()).getTime();
    }

    private String generateRandomGender() {
        return ((Math.round(Math.random() * 100)) % 2 == 0) ? "M" : "F";
    }

}
