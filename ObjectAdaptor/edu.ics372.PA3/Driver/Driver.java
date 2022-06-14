package Driver;

public class Driver {
	public static void main(String[] args) {

		Classes.DateImpl testdate = new Classes.DateImpl();

		// test object creation
		System.out.println(
				"Month " + testdate.getMonth() + " Day " + testdate.getDayOfMonth() + " Year " + testdate.getYear());

		// test setYear & getYear
		System.out.println("test setYear & getYear");
		testdate.setYear(2022);
		System.out.println(testdate.getYear());
		testdate.setYear(-100);
		System.out.println(testdate.getYear());

		System.out.println();
		// test setMonth & getMonth
		System.out.println("test setMonth & getMonth");
		testdate.setMonth(7);
		System.out.println(testdate.getMonth());
		testdate.setMonth(13);
		System.out.println(testdate.getMonth());

		System.out.println();
		// test setDayOfMonth & getDayOfMonth
		System.out.println("test setDayOfMonth & getDayOfMonth");
		testdate.setDayOfMonth(12);
		System.out.println(testdate.getDayOfMonth());
		testdate.setDayOfMonth(42);
		System.out.println(testdate.getDayOfMonth());

		System.out.println();
		// test setHours & getHours !!!!!!!!!! What is the default value for these?
		System.out.println("test setHours & getHours");
		testdate.setHours(5);
		System.out.println(testdate.getHours());
		testdate.setHours(77);
		System.out.println(testdate.getHours());

		System.out.println();
		// test setMinutes & getMinutes
		System.out.println("test setMinutes & getMinutes");
		System.out.println(testdate.getMinutes());
		testdate.setMinutes(25);
		System.out.println(testdate.getMinutes());
		testdate.setMinutes(62);
		System.out.println(testdate.getMinutes());

		System.out.println();
		// test setSeconds & getSeconds
		System.out.println("test setSeconds & getSeconds");
		System.out.println(testdate.getSeconds());
		testdate.setSeconds(33);
		System.out.println(testdate.getSeconds());
		testdate.setSeconds(77);
		System.out.println(testdate.getSeconds());

		System.out.println();
		// test isLeapYear
		System.out.println("isLeapYear");
		System.out.println(testdate.isLeapYear());
		testdate.setYear(2020);
		System.out.println(testdate.getYear());
		System.out.println(testdate.isLeapYear()); // !!!! 2020 not showing as leapyear

	}

}
