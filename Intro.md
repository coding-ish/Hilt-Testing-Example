# Writing Tests
### Great Information to be found *[here](https://developer.android.com/training/testing/fundamentals?authuser=3#medium-tests)*
![Testing Example](https://developer.android.com/static/training/testing/fundamentals/test-scopes.png?authuser=3)

## 3 Different Types of Tests
1. Unit Testing:
   <br>Fundamental tests in app testing strategy, usu. test ind. units of app. Most common testing framework is JUNIT. Mockito creates fake/mock objects to verify code functionality. Ex: **Any Method or Class**

2. Integration Testing:
   <br>Medium tests, or the test for integration validity between multiple units. Ex: **Fragments and View Models**
3. UI, or End to End Tests:
   <br>Use the Espresso Library (For XML Layout) for easy access to UI elements - interacts w/elements in a "thread-safe" way. This is to verify the app as a whole. Ex: **Whole Screen UI Components, or User Flow of App**

## Decoupling is Extremely Important!
- Makes testing more easy and effective
- Split up app into layers, such as View Model or a Composable layer
- Stick to the [Interface Segregation Principle!](https://en.wikipedia.org/wiki/Interface_segregation_principle) TL;DR: Split up your code into various "layers" that deal with a specific functionality of your program. Ex: A printer program that has a **Separate class for Stapling and Printing**

