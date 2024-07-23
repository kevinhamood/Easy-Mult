# Easy-Mult (enhance your kid's skills)

##About the app
an interactive appliaction developed for kids to practice and solve several academic-realated excersizes that are related to their subjects taken in schools, in such a creative way we provide the excersizes\
to let the kids understands the basics behind these ideas.

# Notes for usage purposes :
## Keep in mind using the API requires the base information about the warehouse, while all data requested and received will be in JSON only !!



# Design and Specifications :

I had four main resources for the managing system (Item, Order, Manager, WareHouse) :


<!---![img1111](https://github.com/kevinhamood/Inventory-Management-System/assets/54774286/fc9ab23b-7d8e-4b11-a66b-24fd26462756)-->


# Item :
The Item is a part of the order where the order has several items, and the API helps to see if the item by its ID is available in the inventory or not.

<!---![img2222](https://github.com/kevinhamood/Inventory-Management-System-/assets/54774286/73954657-8ef6-49ea-afac-cffd5e98f7e1)-->



# Order :

The API helps determine whether the order is ready to be shipped or not meaning that if the order is packaged or not, it also checks if the order can fit into the inventory because of its size.


<!--- ![img3333](https://github.com/kevinhamood/Inventory-Management-System-/assets/54774286/4d8c2843-607b-42d6-8a45-a5ade3c07366) -->



# Manager :

The manager's role here is to manage the Warehouse where he can decide what comes to the inventory and what comes out of it.

<!--- ![img4444](https://github.com/kevinhamood/Inventory-Management-System/assets/54774286/db56c93d-d5e7-43bc-8996-4b565847cdf6) -->


# WareHouse :

The warehouse is where all the items and orders are held, it's the main part of the API where its status selects whether the incoming order by its size can be fetched in or not.

<!--- ![img5555](https://github.com/kevinhamood/Inventory-Management-System-/assets/54774286/dc77803d-8e2e-402d-a817-97a1ac676c20) -->


# Tools used :
## The Design was built using Swagger editor supported by SMARTBEAR, I used OpenAPI Specification 3.1.0 

# Design link (on SwaggerHub)
https://app.swaggerhub.com/apis/MOHAMMADSWAITE80_1/Inventory-Management-System/1.0.0
