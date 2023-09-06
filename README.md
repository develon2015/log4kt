# log4kt
Logger for Kotlin

## test
```
./gradlew test

> Task :lib:test

log4kt.LibraryTest > someLibraryMethodReturnsTrue STANDARD_OUT
    Logger@Global - [V] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:12) -> Hi
    Logger@Global - [D] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:13) -> Hi
    Logger@Global - [I] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:14) -> Hi
    Logger@Logger - [W] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:18) -> Hi
    Logger@Logger - [E] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:19) -> Hi
```