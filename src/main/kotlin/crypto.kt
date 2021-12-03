data class CryptoCoin(val name: String, val symbol: String, val usd: Double, val BTC: Double, val momentum: Double)

val observedCoins = listOf(
    CryptoCoin("Dogecoin", "DOGE", 0.0, 0.0, 0.0),
    CryptoCoin("Monero", "XMR", 0.0, 0.0,0.0)
)

val unobservedCoins = listOf(
    CryptoCoin("Bitcoin", "BTC", 0.0, 1.0, 0.0),
    CryptoCoin("Ethereum", "ETH", 0.0, 0.0, 0.0)

)
