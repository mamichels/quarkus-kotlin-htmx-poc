package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import org.eclipse.microprofile.rest.client.inject.RestClient

@Path("/complex")
@Produces("text/html")
class ComplexResource(
    @RestClient private val rndIsClient: RndIsClient
) {

    @GET
    @Path("/uuid")
    suspend fun complex(): String = template(rndIsClient.uuid())

    private fun template(uuid: String): String = """
        <span id='uuid-value'>${uuid}</span>
    """.trimIndent()
}