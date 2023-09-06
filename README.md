# log4kt
Logger for Kotlin

## Install
```groovy
dependencies {
   implementation 'com.github.open-kotlin:log4kt:main-SNAPSHOT'
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
    Logger@Global - [V] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:12) -> Hi
    Logger@Global - [D] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:13) -> Hi
    Logger@Global - [I] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:14) -> Hi
    Logger@Logger - [W] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:18) -> Hi
    Logger@Logger - [E] - log4kt.LibraryTest#someLibraryMethodReturnsTrue(LoggerTest.kt:19) -> Hi
```