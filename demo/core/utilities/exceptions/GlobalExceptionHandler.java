package com.example.a.spring.into.core.utilities.exceptions;

import ch.qos.logback.core.model.processor.ModelHandlerException;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice//Class içerisinde global exception methodlar bulunduğunu söyler
public class GlobalExceptionHandler {

    //TODO: Exception içeriğini inceleyerek tüm validasyon hatalarını alan ve hata mesajı olarak yazdırmak.
    //üç hatanın her birinin birleştiği array yapıp arrayi gösterin
    //DTO'nuzsa mesaj alanlarını doldurun

    @ExceptionHandler({ModelHandlerException.class})//Methodun içerisinde verilen türün exception hndler methodu olduğunu belirler
    @ResponseStatus(HttpStatus.BAD_REQUEST)//return işlevinin cevabı hangi http statüsünde döndüreceğini belirler
    public String handleValidationError(MethodArgumentNotValidException exception){
        return exception.getMessage();
    }

    @ExceptionHandler({RuntimeException.class})
    public String handleRuntimeException(RuntimeException exception){
        return exception.getMessage();
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleExceptionHandler(Exception exception){

        return exception.getMessage();
    }
}
