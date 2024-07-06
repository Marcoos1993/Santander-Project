package me.dio.santander_dev_week_2024.domain.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleBusinessException(IllegalArgumentException businessException){
		return new ResponseEntity<> (businessException.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNotFindException(NoSuchElementException notFoundException){
		return new ResponseEntity<> ("Resource Id not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleUnexpecttedException(Throwable unexpectedException){
		var message = "Unexpectted server error, see the logsException";
		logger.error(message, unexpectedException);
		return new ResponseEntity<> (message , HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
