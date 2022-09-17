package co.develhope.middleware2.interceptors;

import co.develhope.middleware2.entities.Month;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


@Component
public class MonthInterceptor implements HandlerInterceptor {

    public ArrayList<Month> months = new ArrayList<>();

    public void setMonths() {
        months.add(0, new Month(1, "January", "Gennaio", "Januar"));
        months.add(1, new Month(2, "February", "Febbraio", "Februar"));
        months.add(2, new Month(5, "May", "Maggio", "Mai"));
        months.add(3, new Month(8, "August", "Agosto", "August"));
        months.add(4, new Month(9, "September", "Settembre", "September"));
        months.add(5, new Month(12, "December", "Dicembre", "Dezember"));
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if(request.getRequestURL().toString().contains("/months")) {
            String monthNumber = request.getHeader("monthNumber");
            Month month = new Month();
            if (monthNumber == null || monthNumber.isEmpty()) {
                response.setStatus(400);
            } else if (months.contains(monthNumber)) {
                response.setStatus(200);
            } else return true;
            return false;
        }
        return true;
    }

}
