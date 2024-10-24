fun main(){
    // val balance=1000.0 
    val Phone_Number:String?
    val correctPin = "1234"
    var enteredPin: String?
    var attempts = 0 
    for (attempt in 1..3) {  // Loop allows 3 attempts
        print("Enter your MPesa PIN: ")
        enteredPin = readLine()  // Capture user input

        if (enteredPin == correctPin) {  // Check if entered PIN is correct
            println("login!")
            break  // Exit the loop if the PIN is correct
        } else {
            println("Incorrect PIN. You have ${3 - attempt} attempts left.")
        }

        if (attempt == 3) {  // Check if it was the last attempt
            println("You have been locked out.")
        }
    }
    println("Welcome to M-Pesa! Please choose an operation:")
    println("1. Send Money")
    println("2. Withdraw Cash")
    println("3. Buy Airtime")
    println("4. Loans and Savings")
    println("5. Lipa na MPESA")
    println("6. My Account")
    
    
    // Read user input
    val choice = readLine()?.toIntOrNull()

    if (choice != null) {
        if (choice == 1) {
            println("You have selected: Send Money")
            // Add code for sending money here
        } else if (choice == 2) {
            println("You have selected: Withdraw Cash")
            // Add code for withdrawing cash here
        } else if (choice == 3) {
            println("You have selected: Buy Airtime")
            // Add code for buying airtime here
        } else if (choice == 4) {
            println("You have selected: Loans and Savings")
            // Add code for loans and savings here 
        } else if (choice == 5) {
            println("You have selected: Lipa na MPESA")
            // Add code for lipa na MPESA here  
        } else if (choice == 6) {
            println("You have selected: My Account")
            // Add code for my account here 12341234

        } else {
            println("Invalid option, please choose between 1 and 3.")
        }
    } else {
        println("Invalid input, please enter a number.")
    }

    // // User details
    // // val correctPin = "1234"
    var balance = 1000.0  // Initial balance
    
    // println("Please choose an option:")
    // println("1. Send Money")
    // val choice = readLine()

    if (choice == 1) {
        // Ask for phone number
        print("Enter recipient's phone number: ")
        val phoneNumber = readLine()

        // Ask for the amount to send
        print("Enter the amount to send: ")
        val amountToSend = readLine()?.toDoubleOrNull()

        if (amountToSend == null || amountToSend <= 0) {
            println("Invalid amount!")
            return
        }

        // Confirm by asking for pin
        print("Enter your PIN: ")
        val pinEntered = readLine()

        // Check if pin is correct
        if (pinEntered != correctPin) {
            println("Incorrect PIN. Transaction failed.")
            return
        }

        // Check if balance is sufficient
        if (balance >= amountToSend) {
            balance -= amountToSend
            println("Transaction successful!")
            println("You have sent $$amountToSend to $phoneNumber.")
            println("Remaining balance: $$balance")
        } else {
            println("Insufficient balance. Transaction failed.")
        }
    } else {
        println("Invalid choice.")
    }

    // while (true) {
        println("Do you want to continue making transactions? (yes/no): ")
        val userInput = readLine()

        when (userInput) {
            "yes" -> {
                // Code for continuing the transaction
                println("You have chosen to continue the transaction.")
                // Call your transaction function here
            }
            "no" -> {
                println("Exiting the Mpesa system...")
                // break // Exit the loop and terminate the program
            }
            else -> {
                println("Invalid input. Please enter 'yes' or 'no'.")
            }
        }

         val choice = readLine()?.toIntOrNull()

    if (choice != null) {
        if (choice == 1) {
            println("You have selected: Send Money")
            // Add code for sending money here
        } else if (choice == 2) {
            println("You have selected: Withdraw Cash")
            // Add code for withdrawing cash here
        } else if (choice == 3) {
            println("You have selected: Buy Airtime")
            // Add code for buying airtime here
        } else if (choice == 4) {
            println("You have selected: Loans and Savings")
            // Add code for loans and savings here 
        } else if (choice == 5) {
            println("You have selected: Lipa na MPESA")
            // Add code for lipa na MPESA here  
        } else if (choice == 6) {
            println("You have selected: My Account")
            // Add code for my account here 12341234

        } else {
            println("Invalid option, please choose between 1 and 3.")
        }
    } else {
        println("Invalid input, please enter a number.")
    }

    


     if (choice == 2) {         
    // Ask for phone number
    print("Enter recipient's agent number: ")         
    val agentNumber = readLine() 

    // Ask for the amount to withdraw
    print("Enter the amount to withdraw: ")         
    val amountToWithdraw = readLine()?.toDoubleOrNull() 

    // Check if the amount is valid
    if (amountToWithdraw == null || amountToWithdraw <= 0) { // Fixed variable name and condition
        println("Invalid amount entered!")
        return
    } 

    // Confirm by asking for pin
    print("Enter your PIN: ")         
    val pinEntered = readLine() 

    // Check if pin is correct
    if (pinEntered != correctPin) {             
        println("Incorrect PIN. Transaction failed.")             
        return         
    } 

    // Check if balance is sufficient
    if (amountToWithdraw <= balance) { // Fixed variable name
        balance -= amountToWithdraw // Deduct the amount from the balance
        println("Transaction successful!")             
        println("You have withdrawn $$amountToWithdraw from $agentNumber") // Fixed typo
        println("Remaining balance: $$balance")         
    } else {             
        println("Insufficient balance. Transaction failed.")         
    } 
} else {         
    println("Invalid choice.")     
}


}






