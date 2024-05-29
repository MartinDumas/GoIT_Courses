package org.example;

public class UnappropriateSideException extends  Exception{
    UnappropriateSideException(){
        super("Incorrect size value");
    }
}
