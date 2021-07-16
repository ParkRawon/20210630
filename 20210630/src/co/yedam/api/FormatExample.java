package co.yedam.api;

import java.text.DecimalFormat;

public class FormatExample {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$ #,###.###");
		df = new DecimalFormat("00000000000000.0000");
		df = new DecimalFormat("##############.####");

		double num = 127863456.789;
		
		System.out.println(df.format(num));
	}

}
