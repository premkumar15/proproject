package basic;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 extends BaseClassintestng {

	@BeforeClass
	public void tc() throws InterruptedException {
		driver();
		url("http://adactinhotelapp.com/");

	}

	public void verification() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority = -1)
	public void tc0() throws IOException {
		Login l = new Login();
		send(l.getTxtusername(), file(0, 0));
		send(l.getPassword(), file(0, 1));
		l.getLogbtn().click();

	}

	@Test
	public void tc01() throws IOException {
		Searchhotellocators1 n = new Searchhotellocators1();
		ddselectByVisibleText(n.getLocation(), file(0, 2));
		ddselectByVisibleText(n.getHotel(), file(0, 3));
		ddselectByValue(n.getRoomtype(), file(0, 4));
		ddselectByIndex(n.getRoomno(), 5);
		clear(n.getDatepick());
		send(n.getDatepick(), file(0, 6));
		clear(n.getDatepick_out());
		send(n.getDatepick_out(), file(0, 7));
		ddselectByValue(n.getAdult_room(), file(0, 8));
		ddselectByValue(n.getChild_room(), file(0, 9));
		click(n.getSubmit1());
		click(n.getRadiobutton_0());

		click(n.getButton());

	}

	@Test
	public void tc02() throws IOException, InterruptedException {

		BookHotellocator2 h = new BookHotellocator2();
		send(h.getFirst_name(), file(0, 10));
		send(h.getLast_name(), file(0, 11));
		send(h.getAddress(), file(0, 12));
		ddselectByValue(h.getCc_type(), file(0, 13));
		send(h.getCc_num(), file(0, 14));

		ddselectByValue(h.getCc_exp_month(), file(0, 15));
		ddselectByValue(h.getCc_exp_year(), file(0, 16));
		
		send(h.getCc_cvv(), file(0, 17));

		click(h.getBook_now());
		Thread.sleep(5000);
		 
		String att = h.getOrder().getAttribute("value");
		
		System.out.println(att);
		
		booking(0,18,att);

	}
}