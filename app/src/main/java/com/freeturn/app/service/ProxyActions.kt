package com.freeturn.app.service

/**
 * Действия [ProxyService]. Они же отправляются внешней средой (тайл, виджет, шорткат,
 * интент в автозапуске) через [ProxyReceiver].
 */
object ProxyActions {
    const val START = "com.vkkvn.app.START_PROXY"
    const val STOP = "com.vkkvn.app.STOP_PROXY"
}
