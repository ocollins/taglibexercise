package edu.matc.taglibexercise;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by student on 3/26/17.
 */
public class SecondTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        Date playDate = new Date();

        JspWriter out = getJspContext().getOut();
        Calendar calendar = Calendar.getInstance();
//        calendar.clear(Calendar.HOUR);
//        calendar.clear(Calendar.MINUTE);
//        calendar.clear(Calendar.SECOND);
        playDate = calendar.getTime();
        out.println("Today is " + playDate + "\n");

        int dayOfTheWeek = Calendar.DAY_OF_WEEK;
        switch (dayOfTheWeek){
            case 1 :
                out.println("It is still weekend!");
                break;
            case 2:
                out.println("Oh NO it is MONDAY!!");
                break;
            case 3:
                out.println("Oh.. it is only Tuesday:(");
                break;
            case 4:
                out.println("It is Wednesday almost Thursday, which is almost Friday!");
                break;
            case 5:
                out.println("It is Thurday almost Friday");
                break;
            case 6:
                out.println("Whoohoo it is FRIDAY!!");
                break;
            case 7:
                out.println("Saturday, but no time to relax because you need to do your Java homework");
                break;

        }



    }
}
