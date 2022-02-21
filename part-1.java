## Programming language: abstract is the hability for concentrate all aspects essential with the any context ignoring characteristic less important or accidents. 
## algorithms and pseudocodes: the logical sequence what you do day by day. The order affect the results. 
## Flowchart and variables, constants: learning and understan about type of data, variables, and constants. Flowchart is a tool to represents graphs from algorithms, logical sequence, flow of data, and coeherence between flow. You dont need a software to represent the flowchart.
variables and constants: one variable is a objet, one position, are locate in memory and represent the 
variable: space of memory on destiny to one data and change when are executed the algorithm.// Declaration of variables: declare nota1: number 
DECLARE grade2: number
DECLARE grade2: number
DECLARE grade4: number
DECLARE average: number
READ (grade1)
average= grade1+grade2+grade3+grade4)/4
PRINT (average)
end

##types of variables: could be 4 types numerics, characteres, alfanumerics, logical (true or false)
whats is a constants:
BEGINNER
DELCARE pi=3,14
DELCARE radius: number
end
using the flowgorithms (this programming is just for windows, unfortannely)

arithmetis operators:
* multiply
/ divide

expressions for literal: are expressions constants for variables to results the literal. We will using the expresisons literal as atributions of value for a variable or constante.
name= "Joana""
name<- "Joana"
average=(grade1+grade2+grade3+grade4)/4

relational operator:
<= smaller or equal
== equal
!= different from
>= larger or equal

decision making: 

first define variables, 

##Concatenation: is a term using by computational programming to designated the content for two strings. 
string is a sequence of characteres. 
name 

group two or more cells include formulas, texts, and other informations which contains in your interior, given the only result. 

principal
characteres name
output "your name"
input name
output "what's you surname"
input surname 
output "Your name is "& name 
output "your name is"
output "your name is: "& name & " and your surname is: "& surname 
input age
output "your  is: "& name & your surname is: "& surname " your age is: "& age
end

input name 
output "What's your surname?"
input surname
output "What's your age?""
input age
output "Your name is:" & name& "and your surname is"& surname & "your age is: "& age 
end

##repeating structure: how to use this, and the practice for this. Inside the programming language is a structure to accept more than one command or group of command, according from this conditions or the counter. 
principal
variable number, limits
value/attribution: 
number = 1
limit = 20
while number <= limit

variable number = number +1

output counter number
definition
end

example2:
table 9

principal
integer number, limit
number = 0
limit = 10
number <= limit 
if TRUE "9 x "& number & " = " &  9*number
number = number + 1

FALSE
the end

## programming language, programming logical:
using the pseudocode in pratical way, definitio: rogramming language is a written formal with specific group for instruction with rules using to create softwares. One software could be developer to run in one computer or mobile, or any equipament to execute. Talk with the computer, the functions for programming language is to translate and being communicative among computer and humans. High level: the sintaxe is similar for our languagem. (c++, python, ...) Low level: that's a language from machine. you need to know the architetura feom computer to do something. (ex. assembly)
compiled: is a language using by a operational system, or by processor and will be translate by the process named compilation. Interpreted: is a programming language with a code source is execute from a programming computer named interpretade after this the operation system will compilated. 
"portugol" is a pseduolanguage to allow with the problem and no think about the equipament to execute this code. //

programming
{
    function input()
    {
        write("Helo, World!")
    }
}

## Function of this Algorith: Calculate the grade average 

programming
{
    funcao inicio()
    {
        real grade1, grade2, grade3, grade4, average
        cadeia student

        escreva("What's your name?")
        leia(student)
        escreva("your name: " + student)
        leia(grade1)
        escreva("Digite the grade 2:")
        leia(nota2)
        escreva("Digite the grade 3:")
        leia(grade3)
        escreva("Digite the grade4:")
        leia(grade4)

        average = (grade1+ grade2+grade3+grade4)/4

        escreva("The student: " + student + "obtain the average:" + average)
    }
}

Using the Conditional deviation: using the word if the condition will be test among parenthesis and the instructions which will be eexecute among braces. 


if(average>=7) {
    write("Congrats!! You're eligible")
}

if(average<=7) {
    write("\n"+ "Congrats! You're eligible")
}

## if- else
// Check if the average is high or equal 7
imagine the condition are false, the conjuct of command had been execute. so,

if(average>=7) {
    write("\n" + "Congrats!! You're eligible")
}
 // If the average isn't high or equal 7

else {
    write("\n" + "You are not elibigle")
}

##function to algorithm: Calculte the grade average

## Conditional Deviation: the case is similar with the command if and else and reduce the complexity to choose too many option. Besides that the similar of if, he contain the difference. In this command isn't possible using tha logical operation, is just work with defined values. 

programming
{
    function input()
    {
        write("1- Open netflix 2- openon prime 3- open HBO GO 4- close)
        integer menu = 0
        write("\n"+ "your option:")
        read(menu)

        if(menu==1) {
            write("Ok!! Open netflix")
        }
        if(menu==2){
            write("Ok! Open amaxxon prime")
        }
        if(menu==3){
            write("Ok! Open HBO GO")
        }
        if (menu==4){
            write ("Close menu")
        }


    }
}

programming
{
    write("Choose one of these options: 1- open netflix 2- open amaxxon prime 3- open hbo go 4- close)
    integer menu =0
    write("\n"+ "You choose:")
    read(menu)

    choose(menu)

    case 1:   //test if the value is equal 1
    write ("Ok! Open netflix")
    stop

    case 2:   // test if this values is equal 2
    write ("Ok! Open amaxxon prime!")
    stop

    case 3:   //test if the value is equal 3
    write ("Ok! Open hbo go!")
    stop

    cse 4: 
    write ( "Close menu")
    stop

    else:
    write("You have to choose one of these options 1, 2, 3 or 4")
}

## Using repeating loops: Inside the programming logical is a structure to execute more than one time the same command or group of command, according to one condition or one counter. 

function input()
{
    integer counter, limit, result
    counter = 0
    limit = 10
    do
    {
        result = 9*counter
        write("9 X " + counter + "=" + result + "\n")
        counter ++
    } while (counter <= limit)
}

programming
{
    function input()
    {
        integer counter, limit, result

        counter = 0
        limite = 10

        do{
            result = 9* counter
            write("9X" + counter + " = " + result + "\n" )
            counter ++

        }while(counter<=limit)
    }
}


programming
{
    function input()
    {
        integer counter, limit, result, timetables

        counter = 0
        limite = 10

        write("What table you want to solve?:")
        read(timetable)

        do{
            result = timetable* counter
            write("timetable" + counter + " = " + result + "\n" )
            counter ++

        }while(counter<=limit)
    }
}


## Vector and matrices: how to using vector and matrices in pratical way. One headquartes is a collection of variables at the same type, accesible for one name and stored contiguoulsy at memory. The individualixxation for each variable of vector is done among the use index. The vector are matrices for one dimension.

chain Vetor[5]; //declare the vector for 5 positions
chain headquarters[5][3]; //declare one headquartes for 5 row and 3 column

chain fruits[4];
fruits[0]= "Apple"
fruits[1]="Pear"
fruits[2]= "Grapes"
fruits[3]= "Melon"
write(fruits[2])

programming
{
    function input()
    {
        chain fruis[4]
        fruits[0] = "Apple"
        fruits[1] = "Pear"
        fruits[2] = " Grape"
        fruits[3] = "Jackfruit"

        write (fruits[2]) 


    }
}


programming
{
    function input()
    {
        chain fruis[4]
        fruits[0] = "Apple"
        fruits[1] = "Pear"
        fruits[2] = " Grape"
        fruits[3] = "Jackfruit"

        do {

            write(fruits[counter] + "\n")
            counter++

        
        }while (counter<=3)


    }
}

## chain Vector[5];  //declare one vector of 5 positions
   chain Headquarter[5][3]; //declare the headquartes of 5 row and 3 columns

   chain fruits[4]
   fruits[0]= "Apple"
   fruits[1]= "Pear"
   fruits[2]="Grape"
   fruits[3]="Melon"
   write(fruits[2])

   chain bascket[][] = {{"Apple", "100"}, {"Pear", "200"}, {"Melon", "300"}}
   write ("Fruit: "+ basket[0][0] + "Quantity: "+ basket[0][1]) 

   programming
   {
       function input()
       {
           chain basket[][]={{"Pear", "100"}, {"Jack", "200"}, {"Apple", 900}, {"Grape", "89"}
           write ("Product: ")
           write(basket[0][0])
           write("Quantity: ")
           write(basket[0][1])
           }
       }
   }

   programming
   {
       function input()
       {
           integer counter=0
           chain basket[][]={{"Pear", "100"}, {"Jack", "200"}, {"Apple", 900}, {"Grape", "89"}
           
           do{
               write("Product: "+ basket[counter][0] + "Quantity: " + basket[counter][1] + "\n")
               counter++
           }while(counter >=3)
           }
       }
   }

## create a headquarte to exibe this information.   
