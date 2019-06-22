import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

class Validator {

    private LocalTime TimeIn
    private LocalTime TimeOut
    Scanner scanner = new Scanner(System.in)

    boolean input() {

        try {
            println 'Time In: '
            String stringTimeIn = scanner.nextLine()
            TimeIn = LocalTime.parse(stringTimeIn, DateTimeFormatter.ofPattern('HHmm'))
            println 'Time Out: '
            String stringTimeOut = scanner.nextLine()
            TimeOut = LocalTime.parse(stringTimeOut, DateTimeFormatter.ofPattern('HHmm'))
            if (ChronoUnit.MINUTES.between(TimeIn, TimeOut) > 0) {
                return true
            }
        } catch (Exception e) {
            e.printStackTrace()
        }

    }
}