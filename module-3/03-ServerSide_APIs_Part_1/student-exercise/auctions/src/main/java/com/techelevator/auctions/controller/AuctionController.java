package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
   @RequestMapping (path = "/auctions", method = RequestMethod.GET)
    public List<Auction> listOfAuctions(@RequestParam (defaultValue = "", required = false) String title_like) {
	   List<Auction> filteredAuctions = dao.searchByTitle(title_like);
	   if (title_like != null) {
		   return filteredAuctions;
	   } 
    	return dao.list();
    }
   
   
   @RequestMapping (path = "/auctions/{auctionId}", method = RequestMethod.GET)
   public Auction getAuctionById(@PathVariable int auctionId) {
	   return dao.get(auctionId);
   }

   @RequestMapping (path = "/auctions", method = RequestMethod.POST)
   public Auction addAuction(@RequestBody Auction auction) {
	   return dao.create(auction);
   }
   

}
