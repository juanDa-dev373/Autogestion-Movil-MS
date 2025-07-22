package co.api.couch.model.common.exception;

import co.api.couch.model.common.exception.CodeError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class codeErrorTest {
    @Test
    public void coderErrorFOUND(){
        Assertions.assertEquals(302, CodeError.FOUND.getCode());
    }
    @Test
    public void coderErrorNOT_FOUND(){
        Assertions.assertEquals(404, CodeError.NOT_FOUND.getCode());
    }
}