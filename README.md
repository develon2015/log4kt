# log4kt
Logger for Kotlin

## Install
```groovy
repositories {
    // jitpack
    maven { url "https://jitpack.io" }
}

dependencies {
   implementation 'com.github.open-kotlin:log4kt:2843ad7'
}
```

## Example
```kotlin
import log4kt.log

fun main() {
    log.d("Hello", "World!")
}
```

## Test
```sh
$ ./gradlew test

> Task :lib:test

log4kt.LibraryTest > someLibraryMethodReturnsTrue STANDARD_OUT
    2023-09-07 17:12:59.140 - Logger@Global - [V] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:11) -> Hi
    2023-09-07 17:12:59.146 - Logger@Global - [D] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:12) -> Hi
    2023-09-07 17:13:00.147 - Logger@Global - [I] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:14) -> Hi
    Logger@Logger - [W] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:18) -> Hi
    Logger@Logger - [E] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:19) -> Hi
```
