// intellij, community version
version github, clone, 
// new project, or open the project from eclipse, first program, import...
learn, instructions
//new project. java 1 xxulu
command line app, create project template, project name: first program intellij 
project location: preview file, default, or change in three dot.
// finish,  create
alt insert, java class, create one package:
br.com.jo
created this package, class main
java class, class, named first program

package br.com.jo;

public class FirstProgram {
    
}


///appearance, change the theme dark, 

package br.com.jo;


public class FirstProgram {
    public static void maind(String[] args) {
        System.out.println(" Hello World")
    }
    
}

// add configuration, or ctrl shift f10 . main method
// now insert

package br.com.jo;


public class FirstProgram {
    public static void maind(String[] args) {
        Cat cat = new Cat();                          // ctrl space to uncomment


        System.out.println(cat);


        int a = 5;                                     // to comment the press ctrl shift space; or ctr shift space that come back. 
        int b = 3;
        System.out.println(" Hello World")
    }
    
}
// shifht f10. create the cat class
// new package 
br.com.br.jo
create new java class

package br.com.jo;
public class Class {
    private String name;
    private String color;
    private Integer age;

    public Cat () {

        public Cat(String name, String color, Integer age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;

        }

        public void setName(String name) {
            this.name = name;

        }
        public String getCol() {
            return color 
        }

        public Integer getAge() {
            reurn age;
        }

        public void setAge(Integer age) {
            this.age = age;

        }

        @Override 
        public boolean equals(Object o) {
            if(this == o) return true;
            if( o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name) && Objects.equals(cat, cat.color) && Objects.equals(age, age.age)
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, color, age);
        }

        @Override
        public String toString() {
            return "Cat{" + 
            "name='" + name +'\''+ 
            ", age=" + age + 
            ''}'; 
        }

    }

}

// generate, constructor first
// select none

// construct, shift down set
// inseert getters and setter, shift for down
// alt insert, equals() and hashCode() ; select all atribbutes
non-null fields no mark, finish

// alt insert toString()
// ctrl y delete line
