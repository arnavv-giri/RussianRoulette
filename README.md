# 🔫 Russian Roulette – Console Game in Java

## 🎯 Project Description

This is a **console-based Java implementation** of the classic game *Russian Roulette*, designed to simulate suspense and chance using simple I/O and audio effects. The game involves a revolver with one bullet and six chambers. A random bullet position is generated at the start, and the game proceeds with alternate trigger pulls between the **player** and the **computer**.

---

## 🎮 How It Works

- The game starts with an audio effect (`nan.wav`) to build suspense.
- The **player** takes the first turn by pressing Enter to "pull the trigger."
- The **computer** automatically takes the next turn.
- Each trigger pull simulates spinning the chamber and checks if the bullet fires.
- If the current chamber matches the bullet's position, the respective participant "dies" and the game ends.
- If not, the chamber advances, and the next turn begins.

---

## 🔑 Key Features

- 🔁 Alternating turns between player and computer  
- 🌀 Realistic chamber spinning using `Thread.sleep` for dramatic delay  
- 🔊 Sound effect playback to enhance the suspense  
- 💡 Uses core Java libraries:
  - `Scanner`
  - `Random`
  - `Thread`
  - `javax.sound.sampled` (for audio)

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Console-based Input/Output
- Java Sound API (`javax.sound.sampled`)

---

## 🚀 Possible Extensions

- 🎨 GUI interface using JavaFX or Swing
- 👥 Multiplayer support or "Best of 3" mode
- 🔫 Configurable bullet count and chamber size

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/russian-roulette-java.git
   cd russian-roulette-java
2. javac RussianRoulette.java

3.java RussianRoulette

