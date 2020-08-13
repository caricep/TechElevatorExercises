// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
const groceries = [
  {id: 1, item: 'Almond Milk'},
  {id: 2, item: 'Bread'},
  {id: 3, item: 'Eggs'},
  {id: 4, item: 'Pineapple'},
  {id: 5, item: 'Oranges'},
  {id: 6, item: 'Bananas'},
  {id: 7, item: 'Potatoes'},
  {id: 8, item: 'Tea'},
  {id: 9, item: 'Orange Juice'},
  {id: 10, item: 'Fruit Punch'}
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryUl = document.getElementById('groceries');
  
  groceries.forEach((groceryItem) => {
    const groceryLi = document.createElement('li');
    groceryLi.innerText = groceryItem.item;
    groceryUl.appendChild(groceryLi);
  }); 
}

/**
 * This function will be callsed when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {

  const listItem = document.querySelectorAll('li');
  listItem.forEach((groceryItem) => {
    groceryItem.classList.add('completed');
  });
  
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
