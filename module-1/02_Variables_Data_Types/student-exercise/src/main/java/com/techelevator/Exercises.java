package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlayingInWoods = 3;
		int numberOfRaccoonsGoingHomeToEatDinner = 2;
		int numberOfRaccoonsLeftInWoods = numberOfRaccoonsPlayingInWoods - numberOfRaccoonsGoingHomeToEatDinner;
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int differenceOfFlowersAndBees = numberOfFlowers - numberOfBees;
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfLonelyPigeonsEatingBreadcrumbs = 1;
		int numberOfNewPigeonsEatingBreadcrumbs = 1;
		int currentNumberOfPigeonsEatingBreadcrumbs = numberOfLonelyPigeonsEatingBreadcrumbs + numberOfNewPigeonsEatingBreadcrumbs;
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int originalNumberOfOwlsSittingOnFence = 3;
		int additionalNumberOfOwlsSittingOnFence = 2;
		int totalNumberOfOwlsSittingOnFence = originalNumberOfOwlsSittingOnFence + additionalNumberOfOwlsSittingOnFence;
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeaversBeingHandyWorkingOnTheirHome = 2;
		int numberOfBeaversThatLeftWorkingOnHomeToSwim = 1;
		int remainingNumberOfBeaversWorkingOnTheirHome = numberOfBeaversBeingHandyWorkingOnTheirHome - numberOfBeaversThatLeftWorkingOnHomeToSwim;
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucansSittingOnDeciduousTreeLimb = 2;
		int numberOfToucansJoiningDeciduousTreeLimbParty = 1;
		int totalNumberOfToucansSittingOnDeciduousTreeLimb = numberOfToucansSittingOnDeciduousTreeLimb + numberOfToucansJoiningDeciduousTreeLimbParty;
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrelsInTree = 4;
		int numberOfNuts = 2;
		int numberOfExtraSquirrels = numberOfSquirrelsInTree - numberOfNuts;
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int valueOfQuartersInCents = 25;
		int valueOfDimesInCents = 10;
		int valueOfNickelsInCents = 5;
		int totalMoneyMrsHiltFoundInCents = valueOfQuartersInCents + valueOfDimesInCents + valueOfNickelsInCents * 2;
		System.out.println(totalMoneyMrsHiltFoundInCents);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsBakedByMrsBrierClass = 18;
		int numberOfMuffinsBakedByMrsMacAdamsClass = 20;
		int numberOfMuffinsBakedByMrsFlanneryClass = 17;
		int totalNumberOfMuffinsBakedByFirstGrade = numberOfMuffinsBakedByMrsBrierClass + numberOfMuffinsBakedByMrsMacAdamsClass + numberOfMuffinsBakedByMrsFlanneryClass;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int valueOfYoyoInCents = 24;
		int valueOfWhistleInCents = 14;
		int totalMrsHiltSpentInCents = valueOfYoyoInCents + valueOfWhistleInCents;
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numberOfLargeMarshmallows = 8;
		int numberOfMiniMarshmallows = 10;
		int totalNumberOfMarshmallowsUsed = numberOfLargeMarshmallows + numberOfMiniMarshmallows;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnowMrsHiltHouse = 29;
		int inchesOfSnowBrecknockElementarySchool = 17;
		int differenceInInchesOfSnow = inchesOfSnowMrsHiltHouse - inchesOfSnowBrecknockElementarySchool;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int currentAmountOfMoneyMrsHiltHasInDollars = 10;
		int costOfToyTruckInDollars = 3;
		int costOfPencilCaseInDollars = 2;
		int remainingAmountOfMoneyMrsHiltHasInDollars = currentAmountOfMoneyMrsHiltHasInDollars - (costOfToyTruckInDollars + costOfPencilCaseInDollars);
		System.out.println(remainingAmountOfMoneyMrsHiltHasInDollars);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int numberOfMarblesInJoshCollection = 16;
		int numberOfMarblesLostFromJoshCollection = 7;
		int remainingNumberOfMarblesInJoshCollection = numberOfMarblesInJoshCollection - numberOfMarblesLostFromJoshCollection;
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentNumberOfSeashellsInMeganCollection = 19;
		int desiredNumberOfSeashellsForMeganCollection = 25;
		int numberOfSeashellsMeganNeedsToFindForCollection = desiredNumberOfSeashellsForMeganCollection - currentNumberOfSeashellsInMeganCollection; 
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalNumberOfBalloons = 17;
		int numberOfRedBalloons = 8;
		int numberOfGreenBalloons = totalNumberOfBalloons - numberOfRedBalloons;
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int numberOfBooksOnShelf = 38;
		int numberOfBooksAddedToShelf = 10;
		int newNumberOfBooksOnShelf = numberOfBooksOnShelf + numberOfBooksAddedToShelf;
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int amountOfLegsOnOneBee = 6;
		int amountOfBees = 8;
		int totalNumberOfLegsOnBees = amountOfLegsOnOneBee * amountOfBees;
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int costOfOneIceCreamConeInCents = 99;
		int numberOfIceCreamCones = 2;
		int totalCostOfIceCreamConesInCents = costOfOneIceCreamConeInCents * numberOfIceCreamCones;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalNumberOfRocksNeededToMakeGardenBorder = 125;
		int currentNumberOfRocks = 64;
		int numberOfRocksNeededToCompleteGardenBorder = totalNumberOfRocksNeededToMakeGardenBorder - currentNumberOfRocks;
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int originalNumberOfMarbles = 38;
		int numberOfLostMarbles = 15;
		int remainingNumberOfMarbles = originalNumberOfMarbles - numberOfLostMarbles;
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalDistanceToConcertInMiles = 78;
		int distanceAlreadyDrivenToConcertInMiles = 32;
		int remainingDistanceToDriveToConcertInMiles = totalDistanceToConcertInMiles - distanceAlreadyDrivenToConcertInMiles;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int timeSpentShovelingSnowSaturdayMorningInMinutes = 90;
		int timeSpentShovelingSnowSaturdayAfternoonInMinutes = 45;
		int totalTimeSpentShovelingSnow = timeSpentShovelingSnowSaturdayMorningInMinutes + timeSpentShovelingSnowSaturdayAfternoonInMinutes;
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numberOfHotdogsBought = 6;
		int costOfOneHotdogInCents = 50;
		int amountPaidForHotdogsInCents = numberOfHotdogsBought * costOfOneHotdogInCents;
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int amountOfMoneyMrsHiltHasInCents = 50;
		int costOfOnePencilInCents = 7;
		int numberOfPencilsMrsHiltCanBuyInCents = amountOfMoneyMrsHiltHasInCents / costOfOnePencilInCents;
		System.out.println(numberOfPencilsMrsHiltCanBuyInCents);
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalNumberOfButterfliesSeen = 33;
		int numberOfOrangeButterfliesSeen = 20;
		int numberOfRedButterfliesSeen = totalNumberOfButterfliesSeen - numberOfOrangeButterfliesSeen;
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int amountKatePaidInCents = 100;
		int costOfCandyInCents = 54;
		int amountOfChangeKateWillReceive = amountKatePaidInCents - costOfCandyInCents;
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int numberOfTreesCurrentlyInBackyard = 13;
		int numberOfTreesToPlantInBackyard = 12;
		int totalNumberOfTreesInBackyardAfterPlanting = numberOfTreesCurrentlyInBackyard + numberOfTreesToPlantInBackyard;
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numberOfDaysUntilJoySeesHerGrandma = 2;
		int numberOfHoursInOneDay = 24;
		int numberOfHoursUntilJoySeesHerGrandma = numberOfDaysUntilJoySeesHerGrandma * numberOfHoursInOneDay;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGumNeeded = numberOfCousins * piecesOfGumPerCousin;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int amountOfMoneyDanHasInCents = 300;
		int costOfCandyBarInCents = 100;
		int remainingAmountOfMoneyDanHasInCents = amountOfMoneyDanHasInCents - costOfCandyBarInCents;
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoatsInLake = 5;
		int numberOfPeopleOnEachBoat = 3;
		int totalNumberOfPeopleOnBoatsInLake = numberOfBoatsInLake * numberOfPeopleOnEachBoat;
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int originalAmountOfLegos = 380;
		int amountOfLegosLost = 57;
		int remainingAmountOfLegos = originalAmountOfLegos - amountOfLegosLost;
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int currentAmountOfMuffinsBaked = 35;
		int desiredAmountOfMuffinsBaked = 83;
		int additionalAmountOfMuffinsToBake = desiredAmountOfMuffinsBaked - currentAmountOfMuffinsBaked;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int amountOfCrayonsWillyHas = 1400;
		int amountOfCrayonsLucyHas = 290;
		int differenceInAmountOfCrayons = amountOfCrayonsWillyHas - amountOfCrayonsLucyHas;
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickersPerPage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = numberOfStickersPerPage * numberOfPages;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalNumberOfGingerbreadCookies = 47;
		int numberOfGingerbreadCookiesPerJar = 6;
		int remainderOfGingerbreadCookiesNotInJar = totalNumberOfGingerbreadCookies % numberOfGingerbreadCookiesPerJar;
		System.out.println(remainderOfGingerbreadCookiesNotInJar);
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalNumberOfCroissants = 59;
		int numberOfNeighborsToGiveCroissants = 8;
		int remainderOfCroissantsThatWereNotGivenToNeighbors = totalNumberOfCroissants % numberOfNeighborsToGiveCroissants;
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int amountOfOatmealCookiesPerTray = 12;
		int totalAmountOfOatmealCookies = 276;
		int numberOfTraysNeededToPrepareOatmealCookies = totalAmountOfOatmealCookies / amountOfOatmealCookiesPerTray;
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalNumberOfPretzelsPrepared = 480;
		int singleServingSizeOfPretzels = 12;
		int numberOfServingsPrepared = totalNumberOfPretzelsPrepared / singleServingSizeOfPretzels;
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int amountOfLemonCupcakesBakedForChildrenInOrphanage = 53;
		int amountOfLemonCupcakesBakedButLeftHome = 2;
		int numberOfBoxesOfLemonCupcakesGivenAway = (amountOfLemonCupcakesBakedForChildrenInOrphanage - amountOfLemonCupcakesBakedButLeftHome) / 3;
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numberOfCarrotSticksPreparedForBreakfast = 74;
		int numberOfPeopleServedCarrotSticks = 12;
		int remainingNumberOfCarrotSticksAfterPeopleServed = numberOfCarrotSticksPreparedForBreakfast % numberOfPeopleServedCarrotSticks;
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalNumberOfTeddyBears = 98;
		int numberOfTeddyBearsPerShelf = 7;
		int numberOfShelvesFilledWithTeddyBears = totalNumberOfTeddyBears / numberOfTeddyBearsPerShelf;
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
