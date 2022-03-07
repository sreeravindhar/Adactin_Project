package com.adactin.stepdefenition;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.adactin.org.BaseClassTwo;
import com.adactin.pom.PageObjectManager;
import com.adactin.pom.Pom_Class;
import com.adactin.runner.Runner;

import io.cucumber.java.en.*;

public class StepDefenition extends BaseClassTwo {

	public static WebDriver driver = Runner.driver;
	
	PageObjectManager s = new PageObjectManager(driver);
	
	@Given("User want to launch the apllication")
	public void user_want_to_launch_the_apllication() {
		driver.get("https://adactinhotelapp.com/index.php");
		
	   
	}


	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> row = dataTable.row(0);
		sendKeyssss(s.getPomClass().getUsername(), "sreeravindhar");
		sendKeyssss(s.getPomClass().getPassword(), row.get(1));
	   
	
	}

	@When("User want to click the login button")
	public void user_want_to_click_the_login_button() {
	   s.getPomClass().
	}
	@Then("user want to validate the credintials")
	public void user_want_to_validate_the_credintials() {
		
		assertTrue(driver.getCurrentUrl().endsWith("com/SearchHotel.php"));
		System.out.println("Success");
	 
	}
	
	/////////////////////////////NextPage///////////////////////////////////
	
	
	@Given("User need to move to search hotel page")
	public void user_need_to_move_to_search_hotel_page() {
		System.out.println("Login Page Succeed");
	}




	@When("User need to select the loaction")
	public void user_need_to_select_the_loaction() {
		dropDown(s.getPomClass(), "index", "2");
	
		
	}
	@When("User need to select the Hotel")
	public void user_need_to_select_the_hotel() {
		
		dropDown(a.getHotels(), "index", "2");
	}
	@When("User need to select the RoomType")
	public void user_need_to_select_the_room_type() {
		
		dropDown(a.getRoomType(), "index", "4");
	}
	@When("User need to select the No of rooms")
	public void user_need_to_select_the_no_of_rooms() {
		
		dropDown(a.getRoomNos(), "index", "2");
	}
	@When("User need to Fill the Check in date")
	public void user_need_to_fill_the_check_in_date() {
		a.getDateIn().clear();
		sendKeyssss(a.getDateIn(), "11-02-2022");
		
		
	}
	@When("User need to Fill the Check out date")
	public void user_need_to_fill_the_check_out_date() {
		a.getDateOut().clear();
		sendKeyssss(a.getDateOut(), "17-02-2022");
	}
	@When("User need to select the No of Adults")
	public void user_need_to_select_the_no_of_adults() {
		
		
		dropDown(a.getQtyAdult(), "index", "4");
		
	    
	}
	@When("User need to select the Children per room")
	public void user_need_to_select_the_children_per_room() {
		
		dropDown(a.getQtyChild(), "index", "2");
	}
	@When("User want to click the search button")
	public void user_want_to_click_the_search_button() {
		
		a.getSubmitButton().click();
	   
	}
	@Then("User need to validate the the functions are worked properly")
	public void user_need_to_validate_the_the_functions_are_worked_properly() {

		assertTrue(driver.getCurrentUrl().endsWith("com/SelectHotel.php"));
		System.out.println("Search Hotel Success");
	  
		
	}
	

	/////////////////////////////NextPage///////////////////////////////////
	
	
	@Given("User need to move to select hotel page")
	public void user_need_to_move_to_select_hotel_page() {
		System.out.println("Succeed");
	    
	}


	
	@Given("User need to select the required Hotels")
	public void user_need_to_select_the_required_hotels() {
		a.getSelectHotel().click();
		
	  
	}
	@Given("User nee to click the continue button")
	public void user_nee_to_click_the_continue_button() {
		a.getContinueButton().click();
	    
		
	}
	@Then("User need to validate the the Hotels are selecte properly")
	public void user_need_to_validate_the_the_hotels_are_selecte_properly() {
		
		assertTrue(driver.getCurrentUrl().endsWith("com/BookHotel.php"));
		System.out.println("Select Hotel Succeed");
	  
	}


	/////////////////////////////NextPage///////////////////////////////////
	

	@Given("User want to enter the First and Last name")
	public void user_want_to_enter_the_first_and_last_name() {
		sendKeyssss(a.getFirstName(), "Sree");
		sendKeyssss(a.getLastName(), "Ravindhar");

	}


	@Given("User want to enter the Billing address")
	public void user_want_to_enter_the_billing_address() {
		sendKeyssss(a.getBillingAdd(), "No:402, Dubai mainroad, Vivekananthar street, Dubai -108");
	 
	}
	@Given("User want to fill the credit card details")
	public void user_want_to_fill_the_credit_card_details() {
		sendKeyssss(a.getCreditNum(), "1234567891234567");
	    
	}
	@Given("User want to select the card type")
	public void user_want_to_select_the_card_type() {
	   dropDown(a.getCreditType(), "index", "2");
	}
	@Given("User want to select the Month & Year")
	public void user_want_to_select_the_month_year() {
		dropDown(a.getExpMonth(), "value", "9");
		dropDown(a.getExpYear(), "visibletext", "2022");
	 
	}
	@Given("User want the enter the cvv Number")
	public void user_want_the_enter_the_cvv_number() {
	    
		sendKeyssss(a.getCvvNum(), "1234");
	}
	@Given("User want to click the Book now button")
	public void user_want_to_click_the_book_now_button() {
	   a.getBookNowButton().click();
	}











}
