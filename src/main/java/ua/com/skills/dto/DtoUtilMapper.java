package ua.com.skills.dto;

import ua.com.skills.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ваня on 03.01.2017.
 */
public class DtoUtilMapper {
    public static UserDto UserToUserDTO(User user){
            UserDto userDto = new UserDto();
            userDto.setFirstName(user.getFirstName());
            userDto.setSecondName(user.getSecondName());
            userDto.setId(user.getId());
            userDto.setPathImage(user.getPathImage());
        return userDto;
    }

}
