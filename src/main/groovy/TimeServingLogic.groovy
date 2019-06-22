import java.time.LocalTime
import java.time.temporal.ChronoUnit

class TimeServingLogic {

    final LocalTime START_TIME_LUNCH = LocalTime.of(12, 00)
    final LocalTime END_TIME_LUNCH = LocalTime.of(13, 30)
    final LocalTime TIME_START = LocalTime.of(8, 30)
    final LocalTime TIME_END = LocalTime.of(18, 30)
    final Long MAX_TIME = 480
    final Long PERIOD_LUNCH = 90

    Long calculate(LocalTime TimeIn, LocalTime TimeOut) {

        if (TimeIn.isBefore(TIME_START)) {
            TimeIn = TIME_START
        }
        if (TimeOut.isAfter(TIME_END)) {
            TimeOut = TIME_END
        }
        if (TimeIn.isBefore(TIME_START) && TimeOut.isAfter(TIME_END)) {
            return ChronoUnit.MINUTES.between(TimeIn, TimeOut) - PERIOD_LUNCH
        }
        if (TimeIn >= START_TIME_LUNCH && TimeOut <= END_TIME_LUNCH
                || TimeIn.isAfter(TIME_END) || TimeOut.isBefore(TIME_START)) {
            return 0
        }
        if (TimeIn >= START_TIME_LUNCH && TimeIn <= END_TIME_LUNCH) {
            return ChronoUnit.MINUTES.between(END_TIME_LUNCH, TimeOut)
        }
        if (TimeOut <= START_TIME_LUNCH) {
            return ChronoUnit.MINUTES.between(TimeIn, START_TIME_LUNCH)
        }

        if (ChronoUnit.MINUTES.between(TimeIn, TimeOut) - PERIOD_LUNCH >= MAX_TIME) {

            return MAX_TIME
        }
        return ChronoUnit.MINUTES.between(TimeIn, TimeOut) - PERIOD_LUNCH
    }
}
