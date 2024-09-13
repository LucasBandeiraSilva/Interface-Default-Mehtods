## Loan Payment Calculator

This Java program calculates the total payment due for a loan after a given number of months, considering a fixed interest rate. It showcases the use of Java interfaces and default methods for a clean and extensible design.

**Features:**

* **Interest Calculation:**  Calculates the total amount due, including the principal and accumulated interest.
* **Interface-Driven Design:**  Utilizes the `InterestService` interface to represent different interest calculation strategies (e.g., USA, Brazil).
* **Default Method:**  The `payment()` method is implemented as a default method within the interface, providing a common logic for payment calculation that can be reused by different interest service implementations.

**Structure:**

*   **`InterestService` (interface):**
    *   Declares the `getInterestRate()` method to be implemented by concrete interest services.
    *   Provides the default `payment()` method for calculating the total payment.
*   **`BrazilInterestService`, `UsaInterestService` (concrete classes):**
    *   Implement the `InterestService` interface, providing specific interest rates for their respective regions.

**How it Works:**

1.  **User Input:**  The program takes the loan amount and loan duration (in months) as input.
2.  **Interest Calculation:** It creates an instance of a specific interest service (e.g., `UsaInterestService`) and uses the `payment()` method to calculate the total payment.
3.  **Output:** The program displays the total amount due after the specified duration.


**Benefits of Using Interfaces and Default Methods:**

* **Code Reusability:**  The `payment()` method's logic is shared across different interest calculation strategies.
* **Extensibility:**  New interest service implementations (e.g., for different countries) can be easily added without modifying existing code.
* **Polymorphism:**  The program can seamlessly switch between different interest calculation strategies by simply changing the concrete interest service instance used. 
