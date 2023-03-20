//      CWE-306	Missing Authentication for Critical Function

class User {

    setAccountNumber(accNo) {
            this.accountNumber = accNo;
        }

    setAccountType(accType) {
            this.accountType = accType;
        }

    setAccountOwnerName(accName) {
            this.accountName = accName;
        }

    setBalance(bal) {
            this.balance = bal;
        }

    getAccountDetail(){
    console.log("AccountNumber:", this.accountNumber)
    console.log("Owner Name:", this.accountName)


    }

}

 // There is no authentication for this critical function

function createBankAccount(accNo,accType,accOwner,balance) {
   const user = new User();

   user.setAccountNumber(accNo);
   user.setAccountType(accType);
   user.setAccountOwnerName(accOwner);
   user.setBalance(balance);

    return user;
}


const user1 = createBankAccount("123","saving","Owner",300)

user1.getAccountDetail()