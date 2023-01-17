## Minesweeper

Recreate a simplified version of the game Minesweeper to be played in the java console

## Image

## Link

## Setup

## MVP

- The game should be able to randomly generate 10 mines in a 10x10 grid -[]
- The user will be able to enter a command that represents a coordinate to check a location for a mine - []
- The application will display a number from 0-8 depending on how many mines surround that location - []
- If the user selects a mine, the game will respond "boom!" and the game will be lost - []
- If every non-mine square has been revealed, the game is won - []
- Render the grid to the console after every user command - []

## Bonuses (optional)

- Allow for the user to configure number of mines and grid size via a configuration.json file - []
- (Difficult) Discovering an empty square should reveal all squares around it, and cascade into other nearby empty squares - []

## Approach

- Create a class that generates a 10 x 10 grid
  - Created a nested for loop that prints a 10x10 grid with coordinates (A1).
  - Will need to generate 10 random coordinates to which will be the bomb locations
- Create another class that generates the position of the mines.
- When user inputs a position, grid will re-render but the position will show a number from 0-8.
- Create a main class that only calls a method/function that initiates the game.

## Reflection

## Future Goals

## Further reading

- https://stackoverflow.com/questions/27152867/print-10-x-10-co-ordinates-grid

## Stay in touch

## Licence

## Contribution