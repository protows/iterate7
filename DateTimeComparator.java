package lesson_7.iterate5;
import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        return Comparator.comparing((DateTime dt) -> dt.year)
                .thenComparing(dt->dt.month)
                .thenComparing(dt->dt.day)
                .thenComparing(dt->dt.hours)
                .thenComparing(dt->dt.minutes)
                .thenComparing(dt->dt.seconds)
                .thenComparing(dt->dt.year)
                .compare(dt1, dt2);
    }
}

