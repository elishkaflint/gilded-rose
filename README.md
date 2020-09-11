# Gilded Rose Refactoring Kata

### Overview

Really enjoyed this kata (see GildedRoseRequirements.txt for some context)

It gave me a chance to practice some of the concepts in Martin Fowler's "Refactoring":
- Taking small steps
- Writing tests first 
- Replacing if statements with polymorphism
- Using testing, then refactoring, to understand what the code is doing
- And lots of his smaller techniques (slide statements, good naming especially for conditional statements, pass as few parameters as possible and many others I've forgotten the names of)

### Rough Approach

**1. Get a handle on what's going on**
- Write tests, really try with edge cases, group tests by item using @Nested annotation
- Rename stuff until I started to get a handle on the logic
- Start to see the "logic matrix" and the splits in the if logic (sell by date and item type)
- Start to group if statements by item


**2. Think about how I can encapsulate logic in each item**
- Write test for an individual item
- Create individual item to pass initial tests
- Migrate original tests to new item test class
- Build out item with all the functionality
- Repeat for all objects
- Add a bigger test with multiple objects to main test class
- Remove duplicated logic

**3. Refactor**
- Tidy up individual item classes
- Move common behaviour (eg. upper and lower boundary checks) up into the parent Item class

**4. Add the new "Conjured" item**
- Create tests
- Build ConjuredItem and pass unit tests
- GildedRoseTest (effectively my acceptance test) still failing
- Add ConjuredItem to the ItemProvider
- Pass GildedRoseTest

### Outcome

Pleased with how it turned out after a couple of hours of work. From something almost unreadable to a programme that was extremely easy to extend when
a new item came along. Cemented my understanding of the benefits of polymorphism and the refactoring process.

### What I'd do if I had more time

Tidy up the tests a bit to make them clearer / more readable. 


