package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    private Map<String, String> errors = new HashMap<>();

    public ValidationException(String e) {
        super(e);
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String error) {
        errors.put(fieldName, error);
    }
}
