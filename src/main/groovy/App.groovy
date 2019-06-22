class App {
    static void main(String[] args) {

        Validator validator = new Validator()
        TimeServingLogic timeServingLogic = new TimeServingLogic()
        ParseTime parseTime = new ParseTime()
        while (true) {

            validator.input()
            Long TimeServing = timeServingLogic.calculate(validator.TimeIn, validator.TimeOut)
            println parseTime.parseTimeServing(TimeServing)
        }
    }

}
