case class cart {total:BigDecimal,
                  shipping:BigDecimal,
                  discount:BigDecimal,
                  country:Country}
                  
                  
object cart (c:cart){
      val shipping = (c:cart) => c.shipping
      val discount = (c:cart) => c.discount
      }
      

sealed trait Country{
object countries{
case object Swiss extends Country
case object Germany extends Country
case object France extends Country
case object UK extends Country
}

type Cartpredicate = cart => Boolean
type Tax          = cart => BigDecimal
type countryBytax = cart => 





      
      
