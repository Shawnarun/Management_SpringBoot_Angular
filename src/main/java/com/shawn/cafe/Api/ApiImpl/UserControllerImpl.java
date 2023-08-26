package com.shawn.cafe.Api.ApiImpl;

import com.shawn.cafe.Api.UserController;
import com.shawn.cafe.Constents.CafeConstants;
import com.shawn.cafe.Service.UserService;
import com.shawn.cafe.Utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> singUp(Map<String, String> requestMap) {

        try{
            return userService.signUp(requestMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
