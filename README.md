# ✈️ Airline Reservation System

A console-based Airline Reservation System built in **Java** that simulates the airline seat booking process. The application allows passengers to reserve seats in either **First Class** or **Economy**, automatically assigns the next available seat, and provides alternative seating options when a selected class is full.

This project demonstrates core Java programming concepts including arrays, loops, methods, user input handling, and basic reservation logic.

---

## 📖 Project Overview

The system models a small aircraft with **10 seats**:

- **Seats 1–5:** First Class
- **Seats 6–10:** Economy

Passengers choose their preferred seating class, and the application assigns the next available seat within that section. If the selected section is full, passengers are offered a seat in the alternate class. If both sections are fully booked, the system informs the passenger that the next flight is available in three hours.

---

## 🚀 Features

- Book seats in **First Class** or **Economy**
- Automatic seat assignment
- Real-time seat availability tracking
- Alternate class booking when preferred class is full
- Boarding pass generation
- Input validation for invalid menu selections
- Continuous booking until the program is terminated

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Arrays
- Java Methods
- Java Scanner
- Console-Based User Interface

---

## 📂 Project Structure

```text
src/
├── AirlineReservation.java
├── FlightPass.java
└── BoardingPass.java
```

### Components

- **AirlineReservation.java** – Main reservation system with booking and seat allocation logic.
- **FlightPass.java** – Alternative implementation of the reservation workflow and boarding pass generation.
- **BoardingPass.java** – Initial object-oriented implementation for managing passenger information and future reservation enhancements.

---

## ⚙️ How It Works

1. The passenger selects:
   - **1** for First Class
   - **2** for Economy

2. The system checks for available seats.

3. If a seat is available:
   - The seat is reserved.
   - A boarding pass displaying the assigned seat number and class is generated.

4. If the selected class is full:
   - The passenger is offered a seat in the alternate class.

5. If both classes are full:
   - The system displays:

```
Next flight leaves in 3 hours.
```

---

## 💺 Seat Allocation

| Cabin Class | Seat Numbers |
|-------------|--------------|
| First Class | 1–5 |
| Economy | 6–10 |

The application assigns seats sequentially, ensuring the next available seat is allocated.

---

## ▶️ Running the Application

Compile the project:

```bash
javac AirlineReservation.java
```

Run the application:

```bash
java AirlineReservation
```

---

## 📚 Concepts Demonstrated

- Object-Oriented Programming
- Arrays for seat management
- Conditional logic
- Loops
- Method decomposition
- User input with `Scanner`
- Boolean state management
- Basic reservation algorithms

---

## 🚀 Future Improvements

- Passenger profile management
- Flight numbers and multiple flights
- Seat cancellation
- Seat map visualization
- Window, aisle, and middle seat selection
- Persistent data storage using a database
- Graphical User Interface (JavaFX or Swing)
- REST API using Spring Boot
- Online booking integration

---

## 🎯 Learning Outcomes

This project demonstrates practical experience with:

- Java fundamentals
- Console application development
- Reservation system logic
- Data structures using arrays
- Modular programming
- User interaction and validation
- Problem-solving with algorithms

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Nubari**

Java Developer

- Java
- Object-Oriented Programming
- Data Structures
- Algorithms
- Software Development

GitHub: https://github.com/pre2jasi

---

⭐ If you found this project helpful, consider giving it a star on GitHub!
