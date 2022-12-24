
class Market(){
    var seller: String =""
    var buyer: String = ""
    var talk1 = ""
    var responce1 = ""
    fun action(buy: String,sell: String, talk1: String,responce1: String){
        println("Hello $sell....\nHello too..!$buy\n$talk1..\n$responce1")
        
    }
}

fun main(){
    var customerName = "Michael"
    var sellerName = "Dennis"
    var act0 = "do you have products"
    var act1 = "yes, i have them"

    var shop = Market();
    shop.seller = sellerName
    shop.buyer = customerName
    shop.talk1 = act0
    shop.responce1 = act1

    shop.action(shop.buyer,shop.seller,shop.talk1,shop.responce1)
    

}