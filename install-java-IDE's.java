IDE's Java
Goals: in the end of this course configurated the environment of development Java on operations system Linux and Windows. So, knowing some principals of IDE's and using in the market Eclipse IDEA and IntelliJ IDEA IDE.
configuration of environment of developer Java
Install and configuration Eclipse IDE 
Install and configuration of IntelliJ IDEA IDE
Others options
java plataform and the language java 
versions of java, what's IDE? 
Java is a programming language oriented for objects development in 90 decades, in enterprises Sun Microsystems and after thats buyed by Oracle in 2008. Since may 1995 the plataform Java was implements faster than any type of programming language at history of computacional. Is mots populat because of internet. 
program java - compiled - program class - JVM - 100000010101010100001111111110111110001110
differents of programming language compiled (the compiled of code had some time for developer) The language is compiled to bytecode and interpretad to a virtual machine (JVM)
plataform x language: the language of programming language is the convention language to plataform java but it's not your only language. The advanteg of this plataform (once write, execute everywhere) is not only system of operations or hardware because the programmin could run in any virtual machine to be emulated. java se (java plataform, standard edition) java ee(java plataform, enterpreise edition) java me (java plataform, micro edition) Steps to execute JAVA: written the code source (file with extension .java) step 2 to use the JDK to compiled the code source and run the file bytecode(file with the extension .class) step3: to execute the program, the jvm read the compiled file (.class) and the library standard stay inside the JRE. JDK x JRE: Java development kit, it's a kit to development java responsable to compile the code-source (.java) in bytecode (.class) JVM (java virtual machine) it's a virtua machine java responsable to execute the bytecode (.class) JRE java runtime environment to execute java to supply standard java to JDK compiled the code to JVM and execute the programming.     
versions of java: openjdk is a open source with the GNU General Public License. and the JDK Oracle is a license with the contract License of Binary Code Orache. (Payment) // The launch of versions ins Open JDK LTS(suport for long data) happens for only 4 years. // 2021 JAVA SE 11 // Sept-2021 Java ES (LTS)
IDE: text editor, it's a environment for integrate developer of software wich combinated commom tools for developer in only one graph interface for user (GUI) facilitating development applications. Java need this group of tools to developer programming based on this, which knowed as Java Development Kit or JDK, in this environment back to developers. The JDK is a part of IDE's programmings to developes as IntelliJ, Eclipse, NetBeans, others. VSCode. Eclipse: IDE to developer Java but support a lot of differents languages. This done from java follow the model open source to development software. // IntelliJ IDEA is an environment to development integrate written in java to developer software from computer. It's available a edition to community license Apahce 2[6]on edition comercial and proprierty. // knowing the language java
Install JDK and Git on Ubuntu:
Linux:
 ctrl T  terminaljava --version 
intall link on website 
java --version

4.1 check the link from install java (link on terminal)
sudo gedit ~/.bashrc

README: // copy and past to the file 
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64  //it'll be camed from terminal without the part /bin/java stop on 64 
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME

// go to the end of file, so don't change nothing in this file

// go to the end of file, so don't change nothing in this file
// save, close terminal, cntrl alt t 
// if it is saving, 

cat ~/.bashrc

java --version

// now install git 
git --version 
sudo apt-get install git-all
passphrase
git --version 
// using the same email on github account 
git config --global user.name "yourname"
git config --list 
git config --global user.name "jocrv"
git config --list
git config --global user.email joanapoppe@gmail.com
git config --list

## install IDE intellij idead community
// go INTELLIJ, option community, dowload, next 
select option 4.1 64 bit-laucher (if your system is not 64-bit, maybe not use 32-bit) 4.2 add "open folder as project" 4.3 .java-.groovy - .kt - .kts 4.4 Add lauchers dir to the PATH 4.5 Next 
install 
//option reebot later
data sharing>> send anonymous statistics 
done.

terminal
cd downloads
ls -la 
ls -la 
cat Install - Linux-tar .txt 
./idea.sh 
cd bin / 
ls 
idea.sh 
./idea.sh 
//continue execute the jetbrains data sharing 
// new project 
// no intellij tools, created users, 
more dowload, download packages, 

elipse: 
>> eclipse IDEA for enterprise java and web developers 
// extract linux,64 
// eclipse install, downloads 
eclipse-inst execute
install, accept, 

windows:
