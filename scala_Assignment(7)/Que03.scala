case class Account(acc: String, bal: Double){
    var accountNo = acc
    var balance = bal

    def withdraw(amount: Double) = balance = balance - amount

    def deposit(amount: Double) = balance = balance + amount

    def transfer(amount: Double, toAccount: Account) = {
    balance = balance - amount
    toAccount.balance = toAccount.balance + amount
    }
                
    override def toString = "\nAccount : " + accountNo + "\nBalance : " + balance

}

object Bank extends App{
    val account1 = Account("001", 1000.0)
    val account2 = Account("002", 2000.0)

    println("\n")
    println("Accounts : ")
    println(account1)
    println(account2)

    println("\n")
    println("Transfer 500.0 to account 002")
    account1.transfer(500.0, account2)

    println("\n")
    println("After tranfer : ")
    println(account1)
    println(account2)
}