import java.time.LocalTime

class ParseTime {

    LocalTime parseTimeServing(Long TimeServing) {

        int HourParse = TimeServing / 60
        int MinuteParse = TimeServing % 60
        LocalTime TimeParse = LocalTime.of(HourParse, MinuteParse)
        return TimeParse
    }
}
