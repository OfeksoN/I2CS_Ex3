
# 🟡 Pac-Man Game

## 📖 Overview
Pac-Man is a classic arcade game where the player controls Pac-Man through a maze, eating pellets while avoiding ghosts. The goal is to clear all pellets in the maze without getting caught by the ghosts.

This project implements the Pac-Man game with modern programming practices, including modular design and reusable functions.

---

## 🎮 Features
- **Player Control**: Move Pac-Man up, down, left, and right using keyboard input.
- **Ghost AI**: Ghosts move autonomously with different strategies (random, chase, scatter).
- **Score System**: Earn points by eating pellets and bonus fruits.
- **Lives & Game Over**: Pac-Man starts with a set number of lives; game ends when all lives are lost.
- **Level Progression**: Clear the maze to advance to the next level.
- **Sound Effects & Animations**: Classic arcade feel with sound and smooth animations.

---

## 🗂️ Project Structure (with sizes)
*(Sizes are approximate and will change as you add code and assets.)*

---

## 🛠 Functions & Modules

### **Core Functions**
- `initialize_game()`: Sets up the game board, player, ghosts, and score.
- `draw_maze()`: Renders the maze and pellets on the screen.
- `move_pacman(direction)`: Updates Pac-Man’s position based on user input.
- `move_ghosts()`: Updates ghost positions according to their AI logic.
- `check_collision()`: Detects collisions between Pac-Man and ghosts.
- `update_score(points)`: Adds points when Pac-Man eats pellets or fruits.
- `reset_level()`: Resets positions after Pac-Man loses a life.

### **Utility Functions**
- `load_assets()`: Loads images, sounds, and fonts.
- `play_sound(event)`: Plays sound effects for events like eating pellets or losing a life.
- `display_score()`: Shows the current score and lives on the screen.

---

## 🎯 How to Play
- Use **W-A-S-D Keys** to move Pac-Man.
- Eat all pellets to clear the level.
- Avoid ghosts or eat them after consuming a power pellet.
- Collect fruits for bonus points.

---

## ✅ Future Improvements
- Add multiplayer mode.
- Implement advanced ghost AI.
- Add customizable skins and themes.
