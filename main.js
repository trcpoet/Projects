var prodRows = document.getElementById("tbodyRows") ;
var prodRequest = new XMLHttpRequest() ;
//Variable to store the data from the JSON file
var prodJSON ;
var prodObj ;
var prodData ;
//Variable to store the HTML that will create the table
var prodRowData = "";
//Variable to store the product info for the selected products (those with a Qty > 0)
var selectedProducts = "" ;
// variable to store sort order ("A" or "D")
var sortOrder = "D" ;
// Store the new XMLHTTPRequest object in the variable
prodRequest = new XMLHttpRequest( ) ;
// Open the request object to "GET" data from the server
prodRequest.open("GET", "product.json") ;
//send the request
prodRequest.send( ) ;

//create function to read through the data from the JSON file and build the table
prodRequest.onload = function( )

{
	//Assign the data to a variable by parsing it.
	prodData = JSON.parse(prodRequest.responseText) ;

	//Display the first element in the array of data from the JSON file
	renderTable(prodData) ;
}
	

//function to read the data from the JSON file that was stored in the prodData variable
function renderTable(data)
    {
        var prodRowData = "";

        for (i = 0; i<data.length; i++)
            {
                prodRowData += "<tr><td>" + data[i].prodID + "</td><td><img src=" +data[i].prodImg+ "></td><td id='prodName" + i + "'>" + data[i].prodName + "</td><td>" + data[i].prodDesc + "</td><td>" + data[i].prodPrice + "</td><td><input type='number' min ='0' max = '9' id='ProdQty" + i + "' value='0'</td></tr>";
 	    }

			
        //insert the data rows into the table body
	    prodRows.innerHTML = prodRowData ;
    }


// confirm Qty
function confirmQty( )
{
	
    var q0 = document.getElementById("ProdQty0").value;
    var q1 = document.getElementById("ProdQty1").value;
    var q2 = document.getElementById("ProdQty2").value;
    var q3 = document.getElementById("ProdQty3").value;
    var q4 = document.getElementById("ProdQty4").value;
    var q5 = document.getElementById("ProdQty5").value;
    var q6 = document.getElementById("ProdQty6").value;
    var q7 = document.getElementById("ProdQty7").value;
 	var q8 = document.getElementById("ProdQty8").value;
    var q9 = document.getElementById("ProdQty9").value;
    var q10 = document.getElementById("ProdQty10").value;
    var q11 = document.getElementById("ProdQty11").value;


    var products = [];

/* Get the Product details (name and quantity) for each product with a quantity > 0, separating each applicable product with a new line character. 
   Note: I coded this with each product listed separately to simplify this example, but a loop would be more appropriate. */

    if(q0 > 0)
    {
        products += document.getElementById("prodName0").innerText + ": Qty " + q0 + "\n";
    }

    if(q1 > 0)
    {
      products += document.getElementById("prodName1").innerText + ": Qty " + q1 + "\n";
    }

    if(q2 > 0)
    {
        products += document.getElementById("prodName2").innerText  + ": Qty " + q2 + "\n";
    }

    if(q3 > 0)
    {
        products += document.getElementById("prodName3").innerText + ": Qty " + q3 + "\n";
    }

    if(q4 > 0)
    {
      products += document.getElementById("prodName4").innerText + ": Qty " + q4 + "\n";
    }
    if(q5 > 0)
    {
      products += document.getElementById("prodName5").innerText + ": Qty " + q5 + "\n";
    }
    if(q6 > 0)
    {
      products += document.getElementById("prodName6").innerText + ": Qty " + q6 + "\n";
    }
    if(q7 > 0)
    {
      products += document.getElementById("prodName7").innerText + ": Qty " + q7 + "\n";
    }
    if(q8 > 0)
    {
      products += document.getElementById("prodName8").innerText + ": Qty " + q8 + "\n";
    }
    if(q9 > 0)
    {
      products += document.getElementById("prodName9").innerText + ": Qty " + q9 + "\n";
    }
    if(q10 > 0)
    {
      products += document.getElementById("prodName10").innerText + ": Qty " + q10 + "\n";
    }

    //display qty>0 in alert
    if (products > "" && products != null)
    {
        alert("You have selected the following products: \n" + products) ;
	/* Note: I used alert( ) here, but you need to use confirm( ) to confirm the selections.  If the user confirms,
	   send the ProdID and ProdQty key value pairs to local storage (see Example 9), then reset the rows.  If the user cancels, return
	   out of the function and do nothing */
    }
 }   

/* Sort options shown below.  These are called when the user clicks a column heading to sort. */

function sortByID()
{
    if (sortOrder == "A")   //sort in ascending order
    {
        prodData.sort(function(a,b)
        {
            return a.prodID - b.prodID ;
        } ) ;
        sortOrder = "D" ;
    }
    else    //sort in descending order
    {
        prodData.sort(function(a,b)
        {
            return b.prodID - a.prodID ;
        }) ;
        sortOrder = "A" ;
    }
    renderTable(prodData) ;
}

function sortByName()
{
    if (sortOrder == "A")   //sort in ascending order
    {
        prodData.sort(function(a,b)
        {
            if (a.prodName < b.prodName)
            {
                return -1 ;
            }
        } ) ;
        sortOrder = "D" ;
    }
    else    //sort in descending order
    {
        prodData.sort(function(a,b)
        {
            if (a.prodName > b.prodName) 
            {
                return -1  
            }
        } ) ;
        sortOrder = "A" ;
    }
    renderTable(prodData) ;
}

function sortByPrice()
{
   if (sortOrder == "A")   //sort in ascending order
    {
        prodData.sort(function(a,b)
        {
            return a.prodPrice - b.prodPrice ;
        } ) ;
        sortOrder = "D" ;
    }
    else    //sort in descending order
    {
        prodData.sort(function(a,b)
        {
            return b.prodPrice - a.prodPrice ;
        }) ;
        sortOrder = "A" ;
    }
    renderTable(prodData) ;
}
function fetchJSONData() {
fetch('product.json')
.then(response => response.json())
.then(data => {
displayJSONData(data);
})
.catch(error => {
console.error('Error fetching JSON data:', error);
});
}
const id = document.createElement('td');
id.innerText = product.id;
tr.appendChild(id);

const image = document.createElement('td');
const img = document.createElement('img');
img.src = product.image;
img.alt = product.name;
img.style.width = '100px';
image.appendChild(img);
tr.appendChild(image);

const name = document.createElement('td');
name.innerText = product.name;
tr.appendChild(name);

const description = document.createElement('td');
description.innerText = product.description;
tr.appendChild(description);

const price = document.createElement('td');
price.innerText = product.price;
tr.appendChild(price);

const quantity = document.createElement('td');
const input = document.createElement('input');
input.type = 'number';
input.min = '0';
input.max = '100';
input.value = '0';
quantity.appendChild(input);
tr.appendChild(quantity);

tbody.appendChild(tr);
document.addEventListener('DOMContentLoaded', () => {
fetchJSONData();
});
