import react.dom.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import styled.*

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            p { +"Observed Coins" }
            for (coin in observedCoins) {
                styledDiv {
                    p {
                        +"${coin.name} ${coin.momentum}"
                    }
                }
            }
            styledDiv {
                p { +"Interesting Coins" }
                for (coin in unobservedCoins) {
                    css {
                        color = Color.blue
                    }
                    p {
                        +"${coin.name} ${coin.momentum}"
                    }
                }
            }

        }
    }
}
