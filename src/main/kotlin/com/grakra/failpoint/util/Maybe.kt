package com.grakra.failpoint.util

sealed class Maybe<out T>
object Nothing : Maybe<Any>()
data class Just<out T>(val v: T) : Maybe<T>()