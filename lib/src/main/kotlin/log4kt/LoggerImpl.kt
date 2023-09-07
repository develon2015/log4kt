package log4kt

import java.util.Calendar
import java.text.SimpleDateFormat

class LoggerImpl : ILoggerImpl {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S")

    fun getTime(): String {
        return simpleDateFormat.format(Calendar.getInstance().getTime())
    }

    override fun print(level: Level, tag: String, msg: String) {
        println("${getTime()} - $tag - [$level] - $msg")
    }
}