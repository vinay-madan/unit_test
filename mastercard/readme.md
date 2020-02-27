Review the code on the next page & then tackle the six items below. Provide as much detail as you can. 

1. Please review the code for testability and make concrete recommendations on how this could be improved.
 
######  This class is not particularly testable. The methods **checkoutBooks** and **returnBooks** are void and call the methods checkoutBook and returnBook which are quite atomic and encapsulated.
######  We might have to create mock objects for Book class to test the Borrower. 
######  The methods **checkoutBook** and **returnBook** can be made public for it to be testable
  

2. Please outline a unit testing approach. Please identify the tools you would use.

###### I will use JUnit or Mockito as the tool for unit testing. 

4. Identify the tests. There is no need to write the unit tests themselves. 

###### The test can be as follows


          @Test
          public void checkoutBooks() {
          List<Book> book = Arrays.asList(new Book(1000000,"Core Java"),new Book(1000001,"Advanced Java"));
          Assert.assertEquals(2, book.size());
 
          }
    
         @Test
         public void returnBooks() {
        
        }


5. Please explain your ideal test layout. 

###### The ideal test layout should be 

`@Before In the before we can create the Borrower instance  
 @Test   The unit test methods
 @After In the After we can delete all the objects`

6. Please identify any testing additional to unit testing you would like to see. 

###### We should be having integration tests or mocks to test e2e scenarios

6.Suggest how the code could be improved

###### The code can be improved as follows

     finally {
            borrowerRespository.close(); // Code Improvement -  The close method should be part of finally
        }
        
     // These methods can be pubic
     private void checkoutBook(Book book) 
     
     private void returnBook(Book book) 
      
        