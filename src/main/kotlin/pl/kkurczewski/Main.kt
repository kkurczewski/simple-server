package pl.kkurczewski

import io.javalin.Javalin

private val PORT = System.getenv("port")?.toInt() ?: 7000
private val RESPONSE = System.getenv("response") ?: "Hello World!"

fun main() {
    Javalin.create().start(PORT).apply {
        get("/") { ctx -> ctx.result(RESPONSE) }
    }
}