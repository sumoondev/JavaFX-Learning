# JavaFX-Learning

[![JavaFX Version](https://img.shields.io/badge/JavaFX-13-blue.svg)](https://openjfx.io/)   
[![Version](https://img.shields.io/badge/Version-0.0.1-orange.svg)]()

A hands-on playground repository for learning and experimenting with JavaFX. This project uses Maven for build management and is set up in VS Code.

---

## Features

- **Basic JavaFX Application**  
  - Displays a window titled **“Phantom Testing”**  
  - Custom window icon (replaceable via `resources/`)

- **Build & Run with Maven**  
  - JavaFX **13**  
  - Maven Compiler **11**

---

## Table of Contents

1. [Getting Started](#getting-started)  
2. [Prerequisites](#prerequisites)  
3. [Installation](#installation)  
4. [Running the App](#running-the-app)  
5. [Project Structure](#project-structure)  
6. [Configuration](#configuration)  
7. [Contributing](#contributing)  
8. [License](#license)  
9. [Contact](#contact)

---

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for learning and experimentation purposes.

### Prerequisites

- **Java Development Kit (JDK) 11** or newer  
- **Apache Maven** 3.6+  
- **VS Code** (with Java and Maven extensions)  
- Internet access to download JavaFX dependencies

---

## Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/sumoondev/JavaFX-Learning.git
   cd JavaFX-Learning
   ```

2. **Update `pom.xml` if needed**

   * Ensure JavaFX version is set to `13`
   * Compiler source/target set to `11`

3. **Download JavaFX SDK** (if running without the Maven JavaFX plugin)

   * Follow instructions at [https://openjfx.io/](https://openjfx.io/)

---

## Running the App

In VS Code:

1. Open the project folder.
2. Use the **Run** panel or right-click `App.java` ➜ **Run Java**.

---

## Project Structure

```
JavaFX-Learning/
├── src/
│   └── phantom/
│       ├── App.java             # Entry point, sets up the primary stage
│       ├── abcController.java   # For controlling Scenes
│       ├── *.fxml
│       └── resources/images/
│           └── *.png            # Any kind of image files
├── .gitignore
├── LICENSE
└── README.md
```

* **MainApp.java** – Initializes JavaFX Application, sets title `"Phantom Testing"`, and loads the icon.
* **resources/images/icon.png** – Placeholder for your window icon.

---

## Configuration

* **Group ID:** `com.phantom`
* **Artifact ID:** `javafx-learning`
* **Current Version:** `0.0.1`

All these are defined in your `pom.xml` under the `<project>` coordinates.

---
<!-- 
## Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/YourFeature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/YourFeature`
5. Open a Pull Request

Please follow the existing code style and keep commits atomic.

--- -->

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

---

## Contact

For questions or feedback, open an issue or reach out to `stu@sumoonbyanjankar.com.np`.
