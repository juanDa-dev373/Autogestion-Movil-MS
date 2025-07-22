package co.api.couch.model.common.exception;

import co.api.couch.model.common.exception.ErrorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ErrorExceptionTest {
    @Test
    public void errorExceptionTest() {
        ErrorException errorException = new ErrorException("Not found", 404);
        Assertions.assertEquals("Not found", errorException.getMessage());
        Assertions.assertEquals(404, errorException.getCode());
    }
}