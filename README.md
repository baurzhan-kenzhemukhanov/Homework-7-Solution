# Homework-7-Solution
# Streaming Service Iterator

This project simulates a basic episode player similar to Netflix. It demonstrates how the Iterator Design Pattern can be used in Java to navigate through episodes and seasons of a TV show in various orders: normal, reverse, and shuffle.

## 📌 What This Project Does

- Each Season holds a collection of Episode objects.
- The UI (or player) can play through episodes without knowing how they’re stored internally.
- Different iterator implementations allow you to traverse a season:
- In regular sequence
- In reverse
- In a random but consistent order
- A BingeIterator is also included, which links all seasons together for a seamless, full-series marathon.

## 🤔 Why Not Just Use a List?

- Great question! Instead of exposing the underlying list of episodes, we use iterators to:
- Hide the internal storage (it could be an ArrayList, LinkedList, or even streamed data).
- Allow flexible traversal logic without touching the core player functionality.
- Follow the Single Responsibility Principle — the UI shouldn't worry about data structures.

## 📚 What I Learned
This project helped me get a deeper understanding of:

- The difference between internal and external iterators.
- How to implement multiple traversal strategies.
- Why the Iterator Pattern is valuable when working with collections that shouldn’t expose their internal structure.

## ▶️ How to Run

Simply compile and run the Main class to see episode titles printed using all the available traversal methods.

bash
javac *.java
java Main
