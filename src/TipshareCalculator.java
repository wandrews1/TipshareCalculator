
import java.text.NumberFormat;
import java.util.Locale;


/**
 * TIPSHARE CALCULATOR
 *
 * @author Billy Andrews
 * @version
 */
public class TipshareCalculator {

    public static String formatDecimal(double amount) {
         Locale locale = new Locale("en", "US");      
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    return (currencyFormatter.format(amount));
    } 

    public static void main(String args[]) {
        double totalTips = 400;
        double mHours = 0;
        double lHours = 4;
        double dHours = 0;
        double tHours = 0;
        double bHours = 6;
        double wHours = 4;
        double cHours = 0;
        double aHours = 0;

        double totalHours = (mHours + lHours + dHours + tHours + bHours + wHours + cHours + aHours);
        double mTips = ((totalTips * mHours) / totalHours);
        double lTips = ((totalTips * lHours) / totalHours);
        double dTips = ((totalTips * dHours) / totalHours);
        double tTips = ((totalTips * tHours) / totalHours);
        double bTips = ((totalTips * bHours) / totalHours);
        double wTips = ((totalTips * wHours) / totalHours);
        double cTips = ((totalTips * cHours) / totalHours);
        double aTips = ((totalTips * aHours) / totalHours);
        double hourlyRate = totalTips / totalHours;

        System.out.println("PARK LANE TAVERN BARTENDER TIPSHARE");
        System.out.println();
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Hourly Rate: " + formatDecimal(hourlyRate));
        System.out.println();

        if (mTips != 0.0) System.out.println("Michelle made " + formatDecimal(mTips) + " in " + mHours + " hours.");
        if (lTips != 0.0) System.out.println("Lauren made " + formatDecimal(lTips) + " in " + lHours + " hours.");
        if (dTips != 0.0) System.out.println("Drew made " + formatDecimal(dTips) + " in " + dHours + " hours.");
        if (tTips != 0.0) System.out.println("Tyler made " + formatDecimal(tTips) + " in " + tHours + " hours.");
        if (bTips != 0.0) System.out.println("Billy made " + formatDecimal(bTips) + " in " + bHours + " hours.");
        if (wTips != 0.0) System.out.println("Whitney made " + formatDecimal(wTips) + " in " + wHours + " hours.");
        if (cTips != 0.0) System.out.println("Courtney made " + formatDecimal(cTips) + " in " + cHours + " hours.");
        if (aTips != 0.0) System.out.println("Alex made " + formatDecimal(aTips) + " in " + aHours + " hours.");
    }

}
