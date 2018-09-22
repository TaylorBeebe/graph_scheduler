/* Taylor Beebe
 * CS 136 Lab 11
 * Student class which holds the name of student and classes
 * taken by student
 */ 

import java.util.Iterator;
import structure5.*; 

class Student implements Comparable<Student>{

  private String name;
  private String[] classes;
  
  
  public Student(String name, String class1, String class2, String class3, String class4){
    this.name = name;
    classes = new String[] {class1, class2, class3, class4};
  }
  
  public Iterator<String> iterator(){
    return new ArrayIterator<String>(classes);
  }
  
  public String[] getClasses() { return classes; }
  
  public String getName() { return name; }
  
  public int compareTo(Student other){
    return this.getName().compareTo(other.getName());
  }
}