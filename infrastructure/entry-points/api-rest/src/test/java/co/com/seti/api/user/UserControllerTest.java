package co.com.seti.api.user;

import co.com.seti.api.user.response.LoginResponse;
import co.com.seti.api.user.requests.LoginRequest;
import co.com.seti.model.common.exception.ErrorException;
import co.com.seti.model.common.exception.CodeError;
import co.com.seti.usecase.autheticate.AuthenticateUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.http.HttpStatus.OK;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private AuthenticateUseCase authenticateUseCase;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getUser_Success() throws Exception {
        when(authenticateUseCase.login(anyString(),anyString())).thenReturn("token");

        ResponseEntity<LoginResponse> response = userController.loginUser(
                LoginRequest.builder()
                .email("email@com").password("password").build());

        assertNotNull(response);
        assertEquals(OK, response.getStatusCode());
        assertEquals("token", Objects.requireNonNull(response.getBody()).getToken());
    }

    @Test
    void getUser_NotFound() throws Exception {
        when(authenticateUseCase.login(anyString(),anyString()))
                .thenThrow(new ErrorException("The user does not exist", CodeError.NOT_FOUND.getCode()));

        assertThrows(ErrorException.class, () -> userController.loginUser(
                LoginRequest.builder()
                .email("email@com").password("password").build()));
    }
}
