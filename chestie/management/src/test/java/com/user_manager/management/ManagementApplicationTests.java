package com.user_manager.management;

import com.user_manager.management.models.User;
import com.user_manager.management.rest_controllers.UserControler;
import com.user_manager.management.services.UserServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagementApplicationTests {
 @Autowired
	UserServices userServices;
	@Test
	void registerUser(){
		User user = new User();
		userServices.registerNewUserServiceMethod("y111" , "y1" , "y2" , "y3" , "y4" , "y5");
	}


}
