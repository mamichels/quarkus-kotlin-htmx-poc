package org.acme

import io.quarkus.runtime.StartupEvent
import io.vertx.ext.web.Router
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes

@ApplicationScoped
class IndexResource {

    fun serveIndex(@Observes event: StartupEvent, router: Router) {
        router.route("/").handler { context ->
            context.response()
                .sendFile("index.html") }
    }
}