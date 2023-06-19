package Gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    LocalDateTime changed;
    public Gigasecond(LocalDate moment) {
        LocalDateTime datetime = moment.atStartOfDay();
        changed = datetime.plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        changed = moment.plusSeconds(1000000000);
//        changed = moment;
    }


    public LocalDateTime getDateTime() {
        return changed;
    }
}
