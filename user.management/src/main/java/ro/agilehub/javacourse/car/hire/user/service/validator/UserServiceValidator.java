package ro.agilehub.javacourse.car.hire.user.service.validator;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Component;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.UserDomain;

@Component
public class UserServiceValidator {

    @Builder
    @Getter
    public static class Input {
        private UserDomain userWithSameEmail;
        private UserDomain userWithSameUsername;
    }

//    public List<ErrorCode> validateChangeUser(UserDomain userDomain, Input input) {
//        List<ErrorCode> validationErrors = new ArrayList<>();
//        Optional.ofNullable(input.getUserWithSameEmail())
//                .filter(sameUser -> !sameUser.getId().equals(userDomain.getId()))
//                .flatMap(sameUser -> Optional.of(ErrorCode.DUPLICATE_EMAIL))
//                .ifPresent(validationErrors::add);
//        Optional.ofNullable(input.getUserWithSameUsername())
//                .filter(sameUser -> !sameUser.getId().equals(userDomain.getId()))
//                .flatMap(sameUser -> Optional.of(ErrorCode.DUPLICATE_USERNAME))
//                .ifPresent(validationErrors::add);
//        return validationErrors;
//    }
}
