import java.time.LocalDate;
import java.time.Period;

public class AgeComputes{

    public static void main(String[] args){
        LocalDate todayDate = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1990, 7, 17);
        int years = Period.between(birthDay, todayDate).getYears();

        System.out.println(todayDate);
        System.out.println(birthDay);
        System.out.println(years);

  }
}
