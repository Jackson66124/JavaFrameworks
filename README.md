<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    
    Mainscreen.html, line 14: Updated Title to: "Gaming Controller Shop"
    Mainscreen.hmtl, line 24: Updated H1 to "Gaming Controller shop"
    Mainscreen.hmtl, line 15-19: Added a style attribute containing body, updating background color to lemonchiffon.

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    
    created about.html: Added a header for the about page, along with a descriptive body for the website and a link to the mainscreen.
    created aboutPageController.java: Created controller class for the /about page with method mapping to /about, returning about.html
    mainscreen.html, line 25: Added an "About" button with reference to /about page below mainscreen header.

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

    BootStapData.java, line 44-63: Created 5 in house parts and added to partRepository
    BootStrapData.java, line 76-88: Created 5 product objects and added to productRepository

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

    created buyNowError.html: error page for unsuccessful purchase
    created buyNowSuccess.html: confirmation page for successful purchase
    mainscreen.html line 89: added "Buy Now" button with endpoint /buyproduct withproduct id
    AddProductController.java line 129-140: Added method buyProduct mapped to "/buyproduct" that calls buyProduct method in Product.java, returns error or success html.
    Product.java line 93-101: Created method buyProduct, decrements the product inv if the inv >=1.
    


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.