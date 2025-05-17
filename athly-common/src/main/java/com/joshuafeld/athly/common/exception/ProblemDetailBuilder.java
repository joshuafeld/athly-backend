package com.joshuafeld.athly.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

import java.net.URI;

public class ProblemDetailBuilder {

    private final ProblemDetail problemDetail;

    public ProblemDetailBuilder(final HttpStatus status) {
        problemDetail = ProblemDetail.forStatus(status);
    }

    public ProblemDetailBuilder detail(final String detail) {
        problemDetail.setDetail(detail);
        return this;
    }

    public ProblemDetailBuilder title(final String title) {
        problemDetail.setTitle(title);
        return this;
    }

    public ProblemDetailBuilder type(final URI type) {
        problemDetail.setType(type);
        return this;
    }

    public ProblemDetailBuilder instance(final URI instance) {
        problemDetail.setInstance(instance);
        return this;
    }

    public ProblemDetailBuilder property(final String name,
                                         final Object value) {
        problemDetail.setProperty(name, value);
        return this;
    }

    public ProblemDetail build() {
        return problemDetail;
    }
}
