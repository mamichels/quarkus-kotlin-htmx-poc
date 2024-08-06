package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient

/**
 * Client used to fetch random numbers from the rnd.is service.
 * E.g. https://rnd.is/uuid
 */
@RegisterRestClient
interface RndIsClient {

    @GET
    @Path("/uuid")
    suspend fun uuid(): String
}