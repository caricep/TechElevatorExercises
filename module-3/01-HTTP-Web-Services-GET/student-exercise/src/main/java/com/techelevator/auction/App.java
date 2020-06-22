package com.techelevator.auction;

import java.util.Scanner;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class App {

    private static final String API_URL = "http://localhost:3000/auctions";
    private static RestTemplate restTemplate = new RestTemplate();
    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        new App().run();
    }

    /**
     * Here to support testing
     */
    public static void init() {
        scanner = new Scanner(System.in);
    }

    /**
     * These methods should be in a supporting class, but are here for 
     * easy of use in the exercises.  Java standards indicate that they 
     * should be private, but here are public to allow for academic validation.
     */
    public Auction[] listAllAuctions() {
        Auction[] allAuctions = restTemplate.getForObject(API_URL, Auction[].class);
        return allAuctions;
    }

    public Auction listDetailsForAuction() {
       	int id = 0;
       	
    	System.out.print("Please enter an auction ID: ");
    	
    	try {
    		id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
			System.out.println("Error. Please enter a valid auction ID.");
		}
    	
    	String url = API_URL + "/" + id;        	  
    	Auction auctionDetails = restTemplate.getForObject(url, Auction.class);
    	return auctionDetails;
    }

    public Auction[] findAuctionsSearchTitle() {
        String title = "";
        
        System.out.print("Please enter auction title keyword(s): ");
        
        try {
    		title = scanner.nextLine();
        } catch (Exception e) {
			System.out.println("Error. Please enter valid keywords.");
		}
        
    	String url = API_URL + "?title_like=" + title;
    	Auction[] auction = restTemplate.getForObject(url, Auction[].class);
        return auction;
    }

    public Auction[] findAuctionsSearchPrice() {
    	double price = 0.00;
       	
    	System.out.print("Please enter an auction price: ");
    	
    	try {
    		price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
			System.out.println("Error. Please enter a valid price.");
		}
    	
    	String url = API_URL + "?currentBid_lte=" + price;
    	Auction[] auction = restTemplate.getForObject(url, Auction[].class);	
        return auction;
    }

    public void run() {
        int menuSelection = 999;

        printGreeting();

        while (menuSelection != 5) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
    }

    private void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println("");
        }
    }

	public static RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public static void setRestTemplate(RestTemplate restTemplate) {
		App.restTemplate = restTemplate;
	}

    
}
