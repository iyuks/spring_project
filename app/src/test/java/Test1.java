import org.junit.Test;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test1 {
    @Test
    public void  test1(){
        String str="";
        System.out.println("".equals(str));//true

        System.out.println(""!=str);//false
    }
    @Test
    public void test2() throws ParseException {
        DecimalFormat df=new DecimalFormat("0.00");

        String format = df.format(1.225);
        System.out.println(format);

        Number parse = df.parse("1.23");
        System.out.println(parse);
    }
}
