package actions.general

class Wait{

    public static run(def params) {
        if (params.Seconds) {
            sleep(params.Seconds.toInteger() * 1000)
        }
    }
    public static run(String seconds){
        def params = [:]
        params.Seconds = seconds
        run(params)
    }
}