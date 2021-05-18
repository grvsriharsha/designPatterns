package creational.design.builder;


//Can use abstarction with builder(builde whilemaking class and abdtaact factory while redefining  subclases)
/**
 * Created by admins on 7/30/17.
 */
public class Person {
    String firstname;  //must
    String lastname;//must
    int age;
    int id;

    public Person(PersonBuilder personBuilder)
    {
        this.age=personBuilder.age;
        this.firstname=personBuilder.firstname;
        this.id=personBuilder.id;
    }
    public static class PersonBuilder{
       private String firstname;
        String lastname;
       private int age;
       private int id;
      public PersonBuilder(String firstname,String lastname)
      {
         this.firstname=firstname;
          this.lastname=lastname;
      }

      public PersonBuilder setAge(int age)
      {
          this.age=age;
          return this;
      }
      public PersonBuilder setId(int id)
      {
          this.id=id;
          return this;
      }

        public Person build()
        {
           return new Person(this);
        }
    }



}
