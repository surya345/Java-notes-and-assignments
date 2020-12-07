#### Conditional and Looping Constructs
### 1 Write an algorithm for accepting radius and calculate the area of the circle
```
Step1 Start the Algorithm
Step2 Accept radius of the circle
step3 Intialize the variable area
step4 Calculate area= 3.14*r*r
step5 Display the area
step6 End the algorithm
```
### 2 Write an algorithm for accepting a number and display the multiplication table of the given number
```
Step1 Start the Algorithm
Step2 Accept the num variable from which table to be generated
step3 input end value which table has to be ended
step4 run the loop from i to end as such num*i
step5 display the table
step6 End the Algorithm
```
### 3 Write an algorithm for checking whether given number is perfect number or not
```
Step1 Start the Algorithm
Step2 Accept a number from the user
step3 find all the divisors of that number itself except that number
step4 add all the divisors
step5 if the sum of the divisors is equal to that of number then true
step6 Display it is a perfect number otherwise not
step7 End the algorithm
```
### 4 Write an algorithm for accepting three numbers and display the lowest number out of three numbers
```
Step1 Start the Algorithm
step2 Accept both three numbers as first,sec,third
step3 if first<sec && sec < third then 
      Display first is smallest
    else if first>sec && sec< third then
      Display sec is smallest
      otherwise third is smallest
step4 End the algorithm 
```
### 5 Write an algorithm to swap two numbers without using third variable
```
Step1 Start the Algorithm
Step2 Accept Two numbers a and b
Step3 Display both the numbers a and b before swapping
Step4 Do the computation as 
  a=a+b
  b=a-b
  a=a-b
Step5 Then display the numbers a and b after swapping
step6 End the Algorithm
```
### 6 Write an algorithm for accepting a number and check whether number is perfect square or not
```
Step1 Start the Algorithm
step2 Accept a number from the user
step3 Store its square root in a float variable fVar
step4 Assign fVar into iVar  iVar=fVar
step5 Now compare iVar and fVar value will be equal. If the number does not a perfect square, iVar and fVar will not same
step6  if it is equal to zero then Display perfect square otherwise not
step7 End the Algorithm
```
### 7 Write an algorithm for accepting a number from 1 to 7 and display the name of the week
```
Step1 Start the Algorithm
Step2 Accept the number n
Step3 if n>7 then stop and display invalid day
step4 if n=1 then display monday
step5 if n=2 then display tuesday
step6 if n=3 then display wednesday
step7 if n=4 then display Thursday and so on
step8 End the Algorithm
```
### 8 Write an algorithm for implementing the concept of menu driven calculator which will accept two numbers and perform the calculation based upon users choice like (+,-,*,/)
```
Step1 Start the Algorithm
Step2 accept the two numbers a and b
step3 use switch case and perform calculation based on users choice
step4 if user press + then perform addition as sum = a +b
step5 if user press - then perform subtraction as subtract=a-b
step6 if user press * then perform multiplication as multiply=a*b
step7 if user press / then perform Division  as Division=a/b
step8 if user press other than that then use default and print invalid choice
step9 End the Algorithm
```
### 9 Write an algorithm for accepting firstname, middlename and lastname from the user in three different variables and concatenate the first character of firstname with second character of middlename and third character of lastname
```
Step1 Start the Algorithm
Step2 Accept the f_name,M_name,L_name from the user
step3 then display f_name + M_name +L_name
Step4 End the Algorithm
```
### 10 Write an algorithm for accepting a five digit number and check whether the number is palindrome or not
```
Step1 Start the Algorithm
Step2 Accept a number n from the user
Step3 store the n number in variable name pally
Step4 do the calculation as d=n/10
                            n=n/10
                            rev_integer =rev_integer*10+d
Step5 if rev_integer is equal to pally then dispaly palindrome number else not
Step6 End the Algorithm
```
### 11 Write an algorithm for displaying the list of prime numbers in given range
```
Step1 Start the Algorithm
Step2 generate the numbers from 1 to n
Step3 if n%i==0 
step 4 if n==2 then display prime else not
Step5 End the Algorithm

```
### 12 Write an algorithm to accept student Details like (StudentID StudentName, StudentAge, Marks1,Marks2, Marks3) Calculate Total and Percentage. If percentage is greater than 50 then display “PASS” else display “FAIL”
```
Step1 Start the Algorithm
Step2 accept StudentID StudentName, StudentAge, Marks1,Marks2, Marks3 from the user
Step3 Calculate Total= Marks1 + Marks2 + Marks3
and percentage= (total/100)*100
Step4 if percentage>50 then display pass else display fail
Step5 End the Algorithm
```