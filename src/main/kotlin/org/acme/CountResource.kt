package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces

@Path("/count")
@Produces("text/html")
class CountResource {

    private var count = 0

    @GET
    fun count(): String = template()

    @Path("/increase")
    @GET
    fun increase(): String {
        count++
        return template()
    }

    @Path("/decrease")
    @GET
    fun decrease(): String {
        count--
        return template()
    }

    private fun template(): String = """
        <span id='count-value'>${count}</span>
    """.trimIndent()
}