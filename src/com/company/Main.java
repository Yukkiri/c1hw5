package com.company;

public class Main {

    public static void main(String[] args) {
	Staff[] staffArray = new Staff[5];
	staffArray[0] = new Staff("Zanin Dmitry", "System Administrator", "sdmitry@company.com", "89267389274", 90000, 25);
    staffArray[1] = new Staff("Chubchev Ivan", "Product Manager", "civan@company.com", "89638492709", 60000, 50);
    staffArray[2] = new Staff("Zemskaya Yana", "Office Administrator", "zyana@company.com", "89178407358", 55000, 39);
    staffArray[3] = new Staff("Lantrat Olga", "Web Designer", "lolga@company.com", "89479284976", 110000, 45);
    staffArray[4] = new Staff("Pridanov Valery", "Engineer", "pvalery@company.com", "89178407394", 70000, 55);

        for (int i = 0; i < staffArray.length; i++) {
            if(staffArray[i].getAge() > 40) {
                staffArray[i].printInfo();
            }
        }
    }
    //useless comment for pullrequest1
}
