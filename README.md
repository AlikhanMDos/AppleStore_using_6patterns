# AppleStore_using_6patterns

iPhone Shop Application
This project is a Java-based application that simulates an iPhone shop, showcasing the implementation of various design patterns to enhance flexibility, modularity, and extensibility in the codebase.

Design Patterns Used

1. Decorator Pattern:
Usage: The decorator pattern is employed to add additional features to iPhone models dynamically.
Classes:
IphoneDecorator: Base decorator class for adding features to iPhones.
FaceIDDecorator: Concrete decorator class for adding Face ID feature.
WirelessChargingDecorator: Concrete decorator class for adding wireless charging feature.
How it works: Decorator pattern allows the addition of features to iPhone models at runtime without modifying their structure. The IphoneDecorator acts as the base class for all decorators, and concrete decorator classes like FaceIDDecorator and WirelessChargingDecorator add specific features to iPhone objects.
2. Observer Pattern:
Usage: The observer pattern is implemented for updating iPhone models when changes occur.
Classes:
IphoneObserver: Observer interface defining the update method.
IphoneModelObserver: Concrete observer class for updating iPhone models.
IphoneShop: Singleton class managing iPhone models and notifying observers about changes.
How it works: The observer pattern is used to maintain a list of observers (e.g., IphoneModelObserver) that are notified whenever an iPhone model is added or removed from the shop. This ensures that any interested party is informed about changes in the iPhone inventory.
3. Factory Pattern:
Usage: The factory pattern is employed for creating new iPhone objects.
Classes:
IphoneFactory: Factory pattern interface for creating iPhone objects.
SimpleIphoneFactory: Simple factory implementation creating iPhone models based on user input.
How it works: The factory pattern abstracts the process of creating iPhone objects, allowing for flexibility in creating different iPhone models. The SimpleIphoneFactory creates iPhone models based on user input, providing a centralized point for object creation.
4. Adapter Pattern:
Usage: The adapter pattern is used to charge iPhones with different charging strategies.
Classes:
ChargingStrategy: Interface for charging strategies.
LightningChargingStrategy: Concrete implementation for charging with a Lightning cable.
USBTypeCChargingStrategy: Concrete implementation for charging with a USB Type-C cable.
USBTypeCAdapter: Adapter pattern implementation for charging iPhones with a USB Type-C cable.
How it works: The adapter pattern allows the use of different charging strategies (e.g., LightningChargingStrategy and USBTypeCChargingStrategy) interchangeably. The USBTypeCAdapter acts as an adapter, enabling iPhones to be charged with a USB Type-C cable while utilizing the provided charging strategies.
5. Singleton Pattern:
Usage: The singleton pattern is applied in the IphoneShop class to ensure that only one instance of the shop exists throughout the application.
Classes:
IphoneShop: Singleton class managing iPhone models in the shop.
How it works: The singleton pattern restricts the instantiation of the IphoneShop class to a single instance, providing a global point of access to the shop. This ensures consistency in managing iPhone models and prevents multiple instances of the shop.
6. Strategy Pattern:
Usage: The strategy pattern is utilized for defining different charging strategies for iPhones.
Classes:
ChargingStrategy: Interface for charging strategies.
LightningChargingStrategy: Concrete implementation for charging with a Lightning cable.
USBTypeCChargingStrategy: Concrete implementation for charging with a USB Type-C cable.
How it works: The strategy pattern defines a family of interchangeable charging strategies. Concrete implementations like LightningChargingStrategy and USBTypeCChargingStrategy allow flexibility in choosing and switching between charging methods.

UML Diagram:
![srcF](https://github.com/AlikhanMDos/AppleStore_using_6patterns/assets/122694328/e8e080b6-54ce-4ee9-853c-b1401cacb803)


Main Application Logic
The main application logic is implemented in the Main class. Here's a brief overview of its functionality:

Displaying Available Models: Users can view the available iPhone models along with their prices.

Choosing iPhone Model: Users can choose an iPhone model from the available options.

Adding Features: Users can add features such as wireless charging and Face ID to the chosen iPhone model.

Applying iPhone: Users can apply the chosen iPhone model, displaying its final details and price.

Charging via Adapter: Users can charge the chosen iPhone using an adapter, demonstrating the adapter pattern.

Displaying Available Models (Again): Users can view the available iPhone models after making changes.

Creating a New iPhone Model: Users can create a new iPhone model and add it to the shop using the factory pattern.

Exiting the Program: Users can exit the program.

How to Run the Application
To run the application:

Clone the repository to your local machine.
Navigate to the project directory.
Compile and run the Main class.
bash
Copy code
javac Main.java
java Main
Follow the on-screen instructions to interact with the application.

Conclusion
This project demonstrates the application of various design patterns to create a modular and extensible iPhone shop application. The use of design patterns enhances code organization, promotes flexibility, and simplifies the addition of new features. Feel free to explore the codebase and experiment with different scenarios to deepen your understanding of these design patterns. Contributions and suggestions are encouraged for further improvements and learning opportunities.

Feel free to explore and modify the code to understand the implementation details of each design pattern. Contributions and feedback are welcome!



References:
https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
Astana IT University Lecture materials
