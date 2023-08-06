# Java Projects

This repository contains three small Java projects: BankAccount, CashRegister, and FaceComponent.

## BankAccount

The `BankAccount` class represents a basic bank account with deposit, withdrawal, and monthly charge deduction functionalities.

### Usage

```java
BankAccount account = new BankAccount(initialBalance, freeTransactionCount);
account.setTransactionFee(fee);
account.deposit(amount);
account.withdraw(amount);
account.deductMonthlyCharge();
double balance = account.getBalance();

### CashRegister

CashRegister register = new CashRegister(taxRate);
register.recordPurchase(amount);
register.recordTaxablePurchase(amount);
double totalTax = register.getTotalTax();
register.receivePayment(payment);
double change = register.giveChange();

### FaceComponent

FaceComponent face = new FaceComponent();
frame.add(face);  // Assuming 'frame' is a JFrame
