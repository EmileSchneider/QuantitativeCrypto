import kotlinx.html.js.onClickFunction
import kotlinx.browser.window
import react.*
import react.dom.*

external interface CoinDetailProps : Props {
    var coin : CryptoCoin?
}

val CoinDetails = fc<CoinDetailProps> { props ->
    p {
        +"Name: ${props.coin?.name} Symbol: ${props.coin?.symbol}"
    }
    p {
        +"Price USD: ${props.coin?.usd} Price BTC: ${props.coin?.BTC}"
    }
    p {
        +"Momentum: ${props.coin?.momentum}"
    }
}