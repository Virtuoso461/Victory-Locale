package Book81;

import java.time.LocalDate;

public class Product3 {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.parse("2020-09-01");
		LocalDate endDate = LocalDate.parse("2021-07-01");
		System.out.println((endDate.toEpochDay() - startDate.toEpochDay()));
	}
}

