package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File


fun Application.contactus(){
    routing {
        get(path = "/contactus"){
            call.respond("CONTACT US")
        }
        get(path = "/aboutus"){
            //call.respond("ABOUT US")
            call.respondFile(File("/Users/Fourcade7/Downloads/ktor-demo/src/main/kotlin/com/example/plugins/index.html"))
        }
        get(path = "/ae"){

            println("URI   ${call.request.uri}")
            println("URI   ${call.request.headers}")
            call.respond("AFTER EFFECTS")
        }

        staticFiles("/myhtml", File("/Users/Fourcade7/Downloads/ktor-demo/src/main/kotlin/com/example/plugins/index.html"),index = null)





    }
}