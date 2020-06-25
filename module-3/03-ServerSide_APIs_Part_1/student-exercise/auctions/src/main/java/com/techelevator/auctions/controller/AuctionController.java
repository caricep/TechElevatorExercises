package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
   @RequestMapping (path = "", method = RequestMethod.GET)
    public List<Auction> listOfAuctions(@RequestParam (defaultValue = "") String title_like, 
    									@RequestParam (defaultValue = "0") double currentBid_lte) {
	   if (title_like != null && currentBid_lte > 0) {
		   return dao.searchByTitleAndPrice(title_like, currentBid_lte);
	   }
	   else if (title_like != null) {
		   return dao.searchByTitle(title_like);
	   } 
	   else if (currentBid_lte <= currentBid_lte) {
		   return dao.searchByPrice(currentBid_lte);
	   }   
    	return dao.list();
    }
   
   
   @RequestMapping (path = "/{auctionId}", method = RequestMethod.GET)
   public Auction getAuctionById(@PathVariable int auctionId) {
	   return dao.get(auctionId);
   }

   @RequestMapping (path = "", method = RequestMethod.POST)
   public Auction addAuction(@RequestBody Auction auction) {
	   return dao.create(auction);
   }
   

}
