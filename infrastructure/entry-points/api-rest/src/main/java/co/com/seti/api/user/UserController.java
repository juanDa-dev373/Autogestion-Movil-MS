package co.com.seti.api.user;

import co.com.seti.api.user.response.LoginResponse;
import co.com.seti.api.user.response.UserDetail;
import co.com.seti.api.user.requests.LoginRequest;
import co.com.seti.model.plan.Plan;
import co.com.seti.model.usage.response.UsageResponse;
import co.com.seti.model.user.User;
import co.com.seti.usecase.autheticate.AuthenticateUseCase;
import co.com.seti.usecase.user.UserUseCase;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    private final AuthenticateUseCase authenticateUseCase;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@Valid @RequestBody LoginRequest request) throws Exception {

        String token = authenticateUseCase.login(request.email(), request.password());

        return ResponseEntity.ok(LoginResponse.builder().token(token).build());
    }

    /*
    @GetMapping("/all")
    @PreAuthorize("hasAuthority('Admin')")
    public ResponseEntity<ListResponse<User>> getUserAll(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "sort", required = false) String sort
    ) throws Exception {

        PageRequests pageRequests = PageRequests.builder()
                .page(page)
                .size(size)
                .sort(sort)
                .build();

        return ResponseEntity.ok( userUseCase.findAll(pageRequests));
    }


     */
    @GetMapping("/{id}")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<UserDetail> getUser(@PathVariable("id") Long id) throws Exception {

        User user = userUseCase.findUserById(id);
        return ResponseEntity.ok(
                UserDetail.builder()
                        .id(user.getId())
                        .accountNumber(user.getAccountNumber())
                        .numberId(user.getNumberId())
                        .phoneNumber(user.getPhoneNumber())
                        .name(user.getName())
                        .email(user.getEmail())
                        .build()
        );
    }

    @GetMapping("/{id}/plan")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<Plan> getPlan(@PathVariable("id") Long id) throws Exception {

        Plan plan = userUseCase.findPlanByIdUser(id);
        return ResponseEntity.ok(
                plan
        );
    }

    @GetMapping("/{id}/usage")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<UsageResponse> getUsage(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(
                userUseCase.findUsageByIdUser(id)
        );
    }
}
