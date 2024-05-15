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
	void DeleteUser(){
		userServices.deleteUser("test.test");
	}


}
