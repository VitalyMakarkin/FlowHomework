package otus.homework.flowcats

sealed class Result<T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error<T>(val throwable: Throwable) : Result<T>()
}