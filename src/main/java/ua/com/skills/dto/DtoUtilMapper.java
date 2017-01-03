package ua.com.skills.dto;

import ua.com.skills.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ваня on 03.01.2017.
 */
public class DtoUtilMapper {
    public static List<UserDto> UserToUserDTO(List<User> users){
        List<UserDto> userDTOs = new ArrayList<UserDto>();

        for(User user:users){
            UserDto userDto = new UserDto();
            userDto.setFirstName(user.getFirstName());
            userDto.setSecondName(user.getSecondName());
            userDto.setId(user.getId());
            userDto.setPathImage(user.getPathImage());
            userDTOs.add(userDto);
        }

        return userDTOs;
    }

}
