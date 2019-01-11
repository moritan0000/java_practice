package com.company;

class AccountTester {
    public static void main(String[] args) {
        Account adachi = new Account("Adachi", "123456", 1000);
        Account nakata = new Account("Nakata", "654321", 200);

        adachi.deposit(1000000000);
        adachi.withdraw(50000);
        adachi.withdraw(750000);
        adachi.deposit(150000);

        System.out.println("Adachi's account");
        System.out.println("Name: " + adachi.getName());
        System.out.println("Account No. : " + adachi.getNo());
        System.out.println("Balance: " + adachi.getBalance());
        System.out.println("ID: " + adachi.getId());

        System.out.println("Nakata's account");
        System.out.println("Name: " + nakata.getName());
        System.out.println("Account No. : " + nakata.getNo());
        System.out.println("Balance: " + nakata.getBalance());
        System.out.println("ID: " + nakata.getId());
    }
}
