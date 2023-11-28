package pe.exirium

import io.ktor.websocket.*

class Connection(val session: DefaultWebSocketSession, val nameReal: String) {
    val name = nameReal
}