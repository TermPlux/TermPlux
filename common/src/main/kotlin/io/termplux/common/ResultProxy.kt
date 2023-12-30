package io.termplux.common

interface ResultProxy {
    fun success(resultProxy: Any?)
    fun error(errorCodeProxy: String, errorMessageProxy: String?, errorDetailsProxy: Any?)
    fun notImplemented()
}