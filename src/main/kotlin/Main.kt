import react.dom.*
import kotlinx.browser.document
import kotlinx.browser.window
fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(app)
        }
    }
}
