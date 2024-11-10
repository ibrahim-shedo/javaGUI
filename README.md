# Login Application

This is a simple Java login application built using `Swing` components. It provides a graphical user interface (GUI) for users to input their username and password, and performs a basic validation to check if the credentials match predefined values.

## Features

- **Username and Password Fields**: Allows the user to input their username and password.
- **Login Button**: When clicked, it checks if the entered credentials match the hardcoded username (`ibrahim`) and password (`ibrahim1999`).
- **Success/Failure Message**: Displays a message indicating whether the login was successful or failed.

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK installed on your machine to compile and run the application.
- **IDE**: You can use an IDE like IntelliJ IDEA, Eclipse, or NetBeans for easier project management.

## How to Run

1. Clone or download the repository to your local machine.
2. Open the `LogIN.java` file in your IDE.
3. Compile and run the program. A login window will appear.
4. Enter the following credentials to test:
    - **Username**: `ibrahim`
    - **Password**: `ibrahim1999`
5. You should see a message indicating that the login was successful.

## How It Works

1. The program creates a `JFrame` window that contains:
    - Two `JTextField` components for the username and password input.
    - A `JButton` to trigger the login action.
    - A `JLabel` to display the success or failure message.
    
2. When the user clicks the login button, the `actionPerformed` method is triggered. It compares the entered username and password with the hardcoded values (`ibrahim` and `ibrahim1999`).
   
3. If the credentials match, a success message is displayed; otherwise, an error message appears.

## Code Structure

- `LogIN.java`: Main class that contains the user interface and logic for login validation.
- `userlabel`, `userText`: Username label and input field.
- `passwordlabel`, `passwordText`: Password label and input field.
- `button`: The "Log In" button that triggers the login check.
- `success`: Label that shows the login result message.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
