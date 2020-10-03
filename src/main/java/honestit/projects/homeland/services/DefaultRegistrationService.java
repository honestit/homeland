package honestit.projects.homeland.services;

import honestit.projects.homeland.domain.model.user.User;
import honestit.projects.homeland.domain.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DefaultRegistrationService implements RegistrationService {

    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        validate(request);
        User user = createUser(request);
        return validResponse(user);
    }

    private void validate(RegisterUserRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalStateException("Username with " + request.getUsername() + " already exists");
        }
    }

    private RegisterUserResponse validResponse(User user) {
        return new RegisterUserResponse(user.getId());
    }

    private User createUser(RegisterUserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        userRepository.save(user);
        return user;
    }
}
