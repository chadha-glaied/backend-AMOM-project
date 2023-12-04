package com.amal.portabilite;

import com.amal.portabilite.exception.UserFoundException;
import com.amal.portabilite.model.*;
import com.amal.portabilite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PortabiliteApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(PortabiliteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Code is running");
			/*
			try{
				User user = new User();

				user.setUsername("admin");

				user.setPassword(bCryptPasswordEncoder.encode("admin123"));
				user.setEmail("admin@gmail.com");
				user.setTelephone("51015145");
				user.setProfil("foto.png");

				Role role = new Role();
				role.setRoleId(1L);
				role.setRoleName("ADMIN");

				Set<UserRole> usersRoles = new HashSet<>();
				UserRole userRole = new UserRole();
				userRole.setRole(role);
				userRole.setUser(user);
				usersRoles.add(userRole);

				User userAdd = userService.createUser(user,usersRoles);
				System.out.println(userAdd.getUsername());
			}catch(UserFoundException exception){
				exception.printStackTrace();
			}
			try{
				SubBatchHistory subBatchHistory = new SubBatchHistory();
				subBatchHistory.setSubBatchHistoryId(1L);

				DetailHistory detailHistory = new DetailHistory();
				detailHistory.setDetailHistoryId(1L);

				SubBatch subBatch = new SubBatch();
				subBatch.setSubBatchId(1L);
				subBatch.setQuantity(10);
				subBatch.setUser("chadha");
				subBatch.setAction("activation de service");
				subBatch.setStatus("completed");

				LocalDateTime startDate = LocalDateTime.of(2023, 7, 22, 9, 30);
				subBatch.setStartDate(startDate);

				LocalDateTime endDate = LocalDateTime.of(2023, 8, 22, 00, 00);
				subBatch.setEndDate(endDate);

				subBatch.setInsertionDate(startDate);

				subBatch.setModificationDate(endDate);
				subBatch.setComment("SubBatch s'activation de service");

				Detail detail = new Detail();
				detail.setDetailId(1L);
				detail.setMSISDN("123#456");
				detail.setClientCode("#123789");
				detail.setModificationDate(endDate);
				detail.setMessage("deatil de subatch d'activation de service");
				detail.setDetailHistory(detailHistory);
				subBatch.setDetail(detail);
				//to-do :create service for these entities and use it ...

			}catch (Exception exception){
				exception.getMessage();
			}

			*/
	}
}
