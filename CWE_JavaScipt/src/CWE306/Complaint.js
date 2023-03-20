//      CWE-306	Missing Authentication for Critical Function Prevention

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

function createBankAccount(authKey,accNo,accType,accOwner,balance) {
   const user = new User();
if(authKey=="key"){
   user.setAccountNumber(accNo);
   user.setAccountType(accType);
   user.setAccountOwnerName(accOwner);
   user.setBalance(balance);


}
 return user;
}

const user1 = createBankAccount("authkey","123","saving","Owner",300)

user1.getAccountDetail()