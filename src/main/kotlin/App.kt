import kotlinx.css.*
import react.*
import react.dom.*
import kotlinx.browser.window
import styled.css
import styled.styledDiv


val app = fc<Props> {
    var currentCoin: CryptoCoin? by useState(null)

    p { +"Observed Coins" }
    child(CoinRanking) {
        attrs {
            coins = observedCoins
            selectedCoin = currentCoin
            onSelectCoin = { coin ->
                currentCoin = coin
            }
        }
    }
    currentCoin?.let {
        styledDiv {
            css {
                position = Position.absolute
                right = 0.px
                top = 10.px
            }
            child(CoinDetails) {
                attrs {
                    coin = currentCoin
                }
            }
        }
    }
}