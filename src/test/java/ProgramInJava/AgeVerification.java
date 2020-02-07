package ProgramInJava;

public class AgeVerification {

    int Age;


    public void validation(int Age) {

        if(Age>60)
        {
            throw new TooOld("============>Too OLD for marriage<==============");
        }else if (Age<18)
        {
            System.out.println("Hi Exception World");
            throw new TooYoung("=============>Too young for marriage<==============");
        }else{
            System.out.println("============>You are eligible for marriage<=============");
        }

    }

    public static void main(String[] args)  {

        AgeVerification av = new AgeVerification();

        av.validation(15);

    }


}
