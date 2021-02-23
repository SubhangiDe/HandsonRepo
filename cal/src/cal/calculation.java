package cal;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class calculation {
public static double EMI,EMINEW,TotalPayable,Principal;

	public static String calculate(double principal,double rate,double tenure) {
		rate=rate/1200;
		Principal=principal;
		//System.out.println(rate);
		double equation=Math.pow((1+rate),tenure*12);
		//System.out.println(equation);
		EMI=principal*rate*(equation/(equation-1));
		//System.out.println(EMI);
		
	
		
		EMINEW=Math.round(EMI);
		//System.out.println(EMINEW);
		DecimalFormat df=new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		String value=df.format(EMINEW);
		return value;
		
	}
	public static String totalPaybleCalculate( int tenure) {
		TotalPayable=EMI*tenure*12;
		System.out.println(TotalPayable);
		TotalPayable=TotalPayable-Principal;
		//System.out.println(TotalPayable);
		DecimalFormat df1=new DecimalFormat("#");
		df1.setRoundingMode(RoundingMode.HALF_EVEN);
		//System.out.println(df1.format(TotalPayable));
		String value=df1.format(TotalPayable);
		return value;
		
	}

}