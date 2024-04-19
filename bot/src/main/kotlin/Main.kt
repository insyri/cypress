package space.insyri

import dev.kord.core.Kord
import dev.kord.core.event.message.MessageCreateEvent
import dev.kord.core.on
import dev.kord.gateway.Intent
import dev.kord.gateway.PrivilegedIntent

suspend fun main() {

    val token = System.getenv("DISCORD_TOKEN") ?: throw IllegalArgumentException("Missing DISCORD_TOKEN")
    val client = Kord(token)

    client.on<MessageCreateEvent> { // runs every time a message is created that our bot can read

        // ignore other bots, even ourselves. We only serve humans here!
        if (message.author?.isBot != false) return@on

        // check if our command is being invoked

        if (message.content == "your stupid") {
            message.channel.createMessage("actually it's *you're* :nerd: :point_up:")
        }

        if (message.content == "ping") {
            message.channel.createMessage("pong")
        }
    }

    client.login {
        // we need to specify this to receive the content of messages
        @OptIn(PrivilegedIntent::class)
        intents += Intent.MessageContent
    }
}
