package com.vaishnavi.movieschedule.Exception;

public class MovieScheduleNotFoundException extends RuntimeException {

    public MovieScheduleNotFoundException(String message) {
        super(message);
    }

    public MovieScheduleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

