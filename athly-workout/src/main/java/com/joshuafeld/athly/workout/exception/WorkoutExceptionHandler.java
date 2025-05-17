package com.joshuafeld.athly.workout.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class WorkoutExceptionHandler extends ResponseEntityExceptionHandler { }
