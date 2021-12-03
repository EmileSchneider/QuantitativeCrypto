import kotlinx.html.js.onClickFunction
import kotlinx.browser.window
import react.*
import react.dom.*

external interface CoinRankingList : Props {
    var coins: List<CryptoCoin>
    var selectedCoin : CryptoCoin?
    var onSelectCoin : (CryptoCoin) -> Unit
}

val CoinRanking = fc<CoinRankingList> { props ->
    for (coin in props.coins) {
        p {
            if(props.selectedCoin == coin) {
                +"▶ "
            }
            +"${coin.name}: ${coin.momentum}"
            attrs {
                onClickFunction = {
                    props.onSelectCoin(coin)
                }
            }
        }
    }
}