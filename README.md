# Java Object-Oriented Programming Laboratory Activities and Exercise Sets ☕️

Welcome to the **CS 211: Object-Oriented Programming (OOP)** Activities repository! Thank you for visiting my repository! This project showcases my journey in mastering Object-Oriented Programming concepts through Java. Inside, you’ll find a curated collection of laboratory activities and exercises, carefully designed to explore and implement core programming principles like inheritance, polymorphism, abstraction, and more.

This repository isn’t just about completing tasks—it’s about growth, learning, and applying knowledge to create meaningful and practical Java applications. Whether you're a fellow student, a developer, or an instructor, I hope this repository serves as a valuable resource and an inspiration for your own programming endeavors.

Let’s dive into the world of Java together and explore the possibilities of Object-Oriented Programming! 💻

# Purpose and Learning Goals of This Repository 📚
The purpose of this repository is multifaceted:
1. **Personal Growth**: It documents my journey of learning and mastering the Java programming language, highlighting progress through hands-on laboratory activities and exercises.
2. **Reference Material**: It provides a clear reference for fellow students and aspiring developers, offering examples of both fundamental and advanced Java concepts—ranging from basic tasks like handling user input to more complex topics such as inheritance, polymorphism, encapsulation, and abstraction.
3. **Practical Application**: This collection demonstrates the application of Java and OOP concepts in real-world scenarios. You’ll see how these concepts are applied in various laboratory activities and exercise sets.
4. **Collaborative Learning**: By sharing this repository, I hope to inspire others to learn, grow, and build their own Java applications. I believe in the power of collaborative learning, and I hope this repository serves as a helpful resource for anyone interested in expanding their Java skills.
   
---

## ✨ **Java OOP Concepts**
Learn, implement, and build powerful Java applications with Object-Oriented Programming concepts such as:
- **Inheritance:** Creating classes that inherit properties and behaviors from other classes.
- **Polymorphism:** Using objects of different classes interchangeably through inheritance.
- **Encapsulation:** Encapsulating data to hide implementation details and only expose necessary functionalities.
- **Abstraction:** Hiding the complex implementation details and only showing the essential features.

---

## 🔍 Lab Activities

### 📝 **Laboratory Activity 1 – 06-09-2024**
**Focus:** Basic inputs  
**Files:**
- `GettingInputs.java` – Demonstrates how to get user inputs in Java.
- `GettingGreater.java` – Uses conditional statements to determine the greater of two numbers.
- Output files (images) showcasing the output of the programs.

---

### 📝 **Laboratory Activity 2 – 04-10-2024**
**Focus:** Arrays and loops  
**Files:**
- `GetArrayMean.java` – Computes the mean of an array.
- `MultiplicationTable.java` – Generates a multiplication table based on user input.
- Output files (images) showing the results of these programs.

---

### 📝 **Laboratory Activity 3 – 22-11-2024**
**Focus:** Inheritance and polymorphism  
**Files:**
- **Artists Subfolder:**
  - `Artist.java` – A base class for artists.
  - `Singer.java`, `Dancer.java`, `Painter.java`, `Writer.java` – Derived classes that represent different types of artists.
  - `ArtistDemo.java` – A driver code demonstrating the use of the artist hierarchy.
- **Output Screenshots:** Images showing the output of each derived class when instantiated and their behavior.

---

### 📝 **Laboratory Activity 4 – 29-11-2024**
**Focus:** Abstraction  
**Files:**
- **Shapes Subfolder:**
  - `Shape.java` – An interface that all shapes implement.
  - `Rectangle.java`, `Square.java`, `Triangle.java` – Shape classes that implement the `Shape` interface.
  - `ShapeCollection.java` – Manages a collection of shapes and calculates their properties.
  - `Main.java` – Main class to run the program.
- **Lab4-output:** Image files of the output of the shape properties.

---

## 💻 **Exercise Sets**

### 📝 **Exercise Set 1**
**Focus:** Basic programming tasks  
**Files:**
- `Welcome.java` – Prints a welcome message.
- `Escseq.java` – Demonstrates escape sequences in Java.
- `Tempconvert.java` – Converts temperatures between Fahrenheit and Celsius.

---

## 🖥️ Instructions for Running the Program

### 🛠️ Setup Instructions

#### 📥 Clone the Repository
Clone the repository to your local machine using Git:

```bash
git clone https://github.com/your-username/YourRepositoryName.git
cd YourRepositoryName
```
Alternatively, you can download the repository as a ZIP file and extract it.

#### ⚙️ **Install JDK (Java Development Kit)**
Download and install the Java Development Kit (JDK). Ensure you have JDK 8 or a later version installed.

Confirm the installation by running the following command in your terminal or command prompt:
```bash
java -version
```
You should see a version number indicating that Java is installed correctly.

#### 🖥️ **Install a Java IDE or Text Editor**
Choose and install a Java-friendly IDE or text editor for writing and running code. Some recommended options:
 - IntelliJ IDEA
 - Eclipse
 - Visual Studio Code with the Java Extension Pack
 - NetBeans
Alternatively, you can use the command line to compile and run the programs.

#### 🚀 **Running the Programs**
**Option 1: Using an IDE**
1. Open the project folder in your preferred IDE.
2. Locate the .java file you want to run.
3. Compile and run the program:
     - In most IDEs, right-click the file and select Run.
     - Or use the IDE’s run button (usually a green triangle ▶️).

**Option 2: Using the Command Line**
1. Navigate to the folder containing the .java file:
```bash
cd /path/to/your/java/file
```
2. Compile the program using javac:
```bash
javac <filename>.java
```
3. Run the compiled program with java:
```bash
java <filename>
```

## 📁 Repository Structure

Here's a look at the structure of this repository, where you'll find various activities and exercises organized in neat subfolders:

```
 AlvarezFrancineAnneCS2102_OOPactivities (repository name)
 │
 ├── Laboratory Activities
 │   ├── Laboratory Activity 1 – 06-09-2024
 │   │   ├── GettingInputs.java
 │   │   ├── GettingInputs_output (image file)
 │   │   ├── GettingGreater.java
 │   │   └── GettingGreater_output (image file)
 │   │
 │   ├── Laboratory Activity 2 – 04-10-2024
 │   │   ├── GetArrayMean.java
 │   │   ├── GetArrayMean_output (image file)
 │   │   ├── MultiplicationTable.java
 │   │   └── MultiplicationTable_output (image file)
 │   │
 │   ├── Laboratory Activity 3 – 22-11-2024
 │   │   ├── Artists (Subfolder)
 │   │   │   ├── Artist.java
 │   │   │   ├── ArtistDemo.java (driver code)
 │   │   │   ├── Singer.java
 │   │   │   ├── Dancer.java
 │   │   │   ├── Painter.java
 │   │   │   └── Writer.java
 │   │   └── Output Screenshots (Subfolder)
 │   │       └── Provide output screenshots for each derived class.
 │   │
 │   ├── Laboratory Activity 4 – 29-11-2024
 │   │   ├── Shapes (Subfolder)
 │   │   │   ├── Main.java
 │   │   │   ├── Shape.java
 │   │   │   ├── Rectangle.java
 │   │   │   ├── Square.java
 │   │   │   ├── Triangle.java
 │   │   │   ├── ShapeCollection.java
 │   │   └── Lab4-output (image file)
 │
 ├── Exercise Sets
 │   ├── Exercise Set 1
 │   │   ├── Welcome.java
 │   │   ├── Escseq.java
 │   │   └── Tempconvert.java   
 ```

---

## 📌 **Additional Information**
- All Java files are designed to demonstrate various OOP concepts and enhance your coding skills.
- Output screenshots and examples are included for visual references of each program's execution.

---

**Happy Coding!** ☕️

