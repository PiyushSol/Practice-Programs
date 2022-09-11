num,digit,remainder=0,0,0
num=int(input("Enter a Number to be Reveresed: "))

while num > 0:
    digit= num % 10;
    remainder= remainder*10 +digit
    num= num//10

print("The Reversed Number is : ", remainder)
