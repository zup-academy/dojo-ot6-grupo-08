package br.com.zupedu.dojo.ot4dojo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErrorResposta> handleError (MethodArgumentNotValidException ex) {
		
		 List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		 
		 List<ErrorResposta> resp = new ArrayList<>();
		
//		fieldErrors.stream().map(erro -> {
//			new ErrorResposta(ex, null)
//		})
//		 
		
		return null;
	}

}
