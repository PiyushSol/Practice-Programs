#Program to check given number is armstrong or not.
num= int(input("Enter a Number :\n"))
temp_num1 =num
temp_num2 = num
count=0
while temp_num1 >0:
    temp_num1 //=10
    count+=1
    
temp=0
pall_num=0
while temp_num2 > 0:
    temp = temp_num2%10
    pall_num += temp ** count
    temp_num2 //=10

if num == pall_num:
    print("Number is Pallindrome")
else:
    print("Number is not Pallindrome")

