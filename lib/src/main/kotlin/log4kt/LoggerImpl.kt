package log4kt

class LoggerImpl : ILoggerImpl {
    override fun print(level: Level, tag: String, msg: String) {
        println("$tag - [$level] - $msg")
    }
}