package day27exceptionscollections;

        //To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword
        //If you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)

        public class IllegalGradeException extends Exception{

        public IllegalGradeException(String message){
        super(message);
    }
}