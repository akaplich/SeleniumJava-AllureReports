package actions.general

class Wait{
    public run(String seconds){
        def params = [:]
        params.Seconds = seconds
        run(params)
    }
    public run(def params){
        if(params.Seconds){
            sleep(params.Seconds.toInteger() * 1000)
        }
    }
}