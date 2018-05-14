package binarysearchtree;

class Person
{
  protected String name;
  protected int age;
  public Person (String name, int age)
  {
    this.name = name;
    this.age = age;
  } // Person constructor

  public int compareTo (Person other)
  {
    return name.compareTo (other.name);
  } // compareTo method

  public String getName ()
  {
    return name;
  } // toString method

  public int getAge ()
  {
    return age;
  }
} /* Person class */