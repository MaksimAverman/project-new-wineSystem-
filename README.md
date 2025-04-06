# Wine managment system
## Table of Contents
- [Introduction](#introduction)
- [Key Features](key=features)
- [Project Structure](project-Structure)
- [Setup Instructions](setup-instructions)
- [Usage](usage)
- [Code Overview](#code-overview)
## Introduction
The **Wine Management System** is a Java-based application designed to manage the process of selling and delivering wine.  
It works directly with a relational database, allowing users to view, edit, and update data related to wines, customers, orders, and deliveries.

### Key Features:

- 📦 Manage wine inventory, customers, employees, and delivery orders
- 👤 Role-based access: separate interfaces and permissions for **Admin** and **User**
- 🧾 Generate reports about employees and wine sales using SQL queries
- 📥 Import additional data into the database using XML files
- 🛠 Fully integrated with a **Microsoft Access** database — all data is stored and managed there

This system is a great example of how to build a full-featured CRUD (Create, Read, Update, Delete) application with Java and Access database integration.

## Project Structure
Wine-managment-system/ ├── src/ │ ├── boundry/ │ ├── control/ │ ├── entity/ │ ├── enums/ │ └── README.md
- boundry: Contains the user interface elements and panels.
- control: Contains the control logic for the application, including classes for managing content.
- entity: Contains the entity classes representing the main data models like Wine, Order, Manifacture, Consts and more.
- enums: Contains custom enums classes used throughout the application.

## Setup Instructions
1. Run the Application:  
   - You can run the project using the pre-built `.jar` file located in the `out/` directory:
   - `java -jar out/aatrifacts/HW2_jar/WineDeliverySystem.jar`

### you can also run the code:
1. Clone the repository:  
   - `git clone https://github.com/MaksimAverman/project-new-wineSystem-.git`  
   - `cd project-new-wineSystem`

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Build the Project:  
   - Use your IDE to build the project, ensuring all dependencies are correctly set up.

4. Run the Application:  
   - Execute the main class to start the application.

## Usage
1. You can enter as admin(admin, admin) or as user(user, user).
2. Importing info about wine and their manifactures from XML:  
   - Use the `Control.importXML(String xmlFilePath)` method to import places from an XML file.

3. Managing Wines and Manifactures:  
   - Create, update, and delete wines using the `WineLogic` class.
   - Create, update, and delete manifactures using the `ManifactureLogic` class.

4. Handling orders:  
   - Create and manage orders using the `OrderLogic` class.  

5. Choose wine by preference:  
   -  Allows selecting preferred food pairings or occasions to receive recommendations on which wine to choose.

6. Searching for wine:  
   - Allows selecting preferred food pairings or occasions to receive recommendations on which wine to choose.

## Code Overview
### boundry
Contains the user interface components and panels.

### control
Handles the main logic of the application. Key classes include:

- `FileImporter`: Importing data from XML.
- `WineLogic`: Provides methods for managing wine-related data, including retrieving, filtering, adding, editing, and deleting wines from a database.
- `ManufactureLogic`: Provides methods for managing manifacture-related data, including retrieving, filtering, adding, editing, and deleting wines from a database.

### entity
Defines the main data models:

- `Wine`, `Manifacture`, `WineTypes`, `Order`, `StoregeLocation`.

### enums
Defines enums  used throughout the application.

