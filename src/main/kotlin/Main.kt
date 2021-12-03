import react.dom.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import styled.*

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(app)
        }
    }
}
