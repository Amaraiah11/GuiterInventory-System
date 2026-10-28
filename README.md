<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=042F2E,0F766E,2DD4BF&height=220&section=header&text=Guitar%20Inventory%20System&fontSize=40&fontColor=ffffff&fontAlignY=38&desc=Object-Oriented%20Design%20Patterns%20%26%20Polymorphic%20Catalog%20Search%20Engine&descSize=16&descAlignY=60&descAlign=50" width="100%" alt="Guitar Inventory System Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Paradigm-Object--Oriented%20Design-0F766E?style=for-the-badge" alt="OOP" />
  <img src="https://img.shields.io/badge/Design%20Pattern-Specification%20%7C%20Encapsulation-2DD4BF?style=for-the-badge" alt="Design Pattern" />
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" alt="Status" />
</p>

<a id="overview"></a>
## 📖 Executive Summary & Overview

Developing enterprise retail inventory applications requires designing flexible software architectures resilient to feature expansion and domain changes. Hardcoding instrument search criteria directly into inventory loops violates the Single Responsibility and Open/Closed principles, rendering systems brittle when introducing new attributes (such as back woods, string counts, or electronic pickups).

The **Guitar Inventory System** (`GuiterInventory-System`) implements an object-oriented inventory catalog inspired by classic software engineering design patterns. By decoupling instrument specifications from the physical inventory storage entity, the system provides high search flexibility, type safety, and clean algorithmic filtering.

<a id="toc"></a>
## 📑 Table of Contents

- [📖 Executive Summary & Overview](#overview)
- [🎯 Key Features & Capabilities](#features)
- [🏗️ System Architecture & Pipeline](#architecture)
- [🛠️ Tech Stack Breakdown](#tech-stack)
- [⚙️ Reproducible Quickstart & Setup](#setup)
- [📁 Project Directory Layout](#project-layout)
- [👨‍💻 Author & Contributions](#author)

<a id="features"></a>
## 🎯 Key Features & Capabilities

- **Encapsulated Inventory Management:** Centralized catalog holding item records with dynamic addition, lookup, and retrieval.
- **Specification Matching Algorithm:** Flexible multi-criteria attribute comparison matching user preferences against stock.
- **Type-Safe Domain Modeling:** Robust attribute handling for builders (Fender, Gibson, Martin), models, and wood configurations.
- **Decoupled Architecture:** Clean separation between business domain entities, search algorithms, and client execution.

<a id="architecture"></a>
## 🏗️ System Architecture & Pipeline

```mermaid
classDiagram
    class Inventory {
        -List~Guitar~ guitars
        +addGuitar(String serialNumber, double price, GuitarSpec spec)
        +getGuitar(String serialNumber) Guitar
        +search(GuitarSpec searchSpec) List~Guitar~
    }

    class Guitar {
        -String serialNumber
        -double price
        -GuitarSpec spec
        +getSerialNumber() String
        +getPrice() double
        +getSpec() GuitarSpec
    }

    class GuitarSpec {
        -String builder
        -String model
        -String type
        -String backWood
        -String topWood
        +matches(GuitarSpec otherSpec) boolean
    }

    Inventory o-- Guitar : Stores collection of
    Guitar *-- GuitarSpec : Has specification
```

<a id="tech-stack"></a>
## 🛠️ Tech Stack Breakdown

| Layer | Technology | Role |
| :--- | :--- | :--- |
| **Language** | Java (JDK 11 / 17+) | Core object-oriented programming language |
| **Data Structures** | Java Collections Framework | Dynamic list storage, iteration, and filtering |
| **Software Design** | Gang of Four (GoF) Principles | Encapsulation, Specification Pattern, Separation of Concerns |
| **Build Tooling** | Standard `javac` Compiler | Clean compilation without external dependencies |

<a id="setup"></a>
## ⚙️ Reproducible Quickstart & Setup

### Prerequisites
- Java Development Kit (JDK 11 or higher)

```bash
# 1. Clone repository
git clone https://github.com/Amaraiah11/GuiterInventory-System.git
cd GuiterInventory-System

# 2. Compile Java sources
javac Inventory.java

# 3. Execute inventory simulation
java Inventory
```

<a id="project-layout"></a>
## 📁 Project Directory Layout

```text
GuiterInventory-System/
├── Inventory.java             # Core inventory management logic and catalog search
└── README.md                  # Comprehensive OOP architectural documentation
```

<a id="author"></a>
## 👨‍💻 Author & Contributions

This project is developed and maintained with high technical rigour by **Amaraiah C**, Software Engineer and Data Analytics Practitioner studying Bachelor of Computer Applications (BCA) at Alliance University.

- 🌐 **GitHub:** [@Amaraiah11](https://github.com/Amaraiah11)
- 💼 **LinkedIn:** [Connect on LinkedIn](https://www.linkedin.com/in/amaraiah-c/)
- 📧 **Institutional Contact:** `camaraiahBCA24@ced.alliance.edu.in`

### 🤝 Contribution Guidelines
Contributions, bug reports, and architectural discussions are welcome!
1. **Fork** the repository: `https://github.com/Amaraiah11/GuiterInventory-System`
2. **Branch**: `git checkout -b feature/your-feature-name`
3. **Commit**: `git commit -m "feat: enhance feature logic"`
4. **Push**: `git push origin feature/your-feature-name`
5. **Open Pull Request** against the `Amaraiah-C` branch.

---

<p align="center">
  <b>⭐ If this codebase or documentation assisted your engineering workflows, please star the repository! ⭐</b>
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=042F2E,0F766E,2DD4BF&height=100&section=footer" width="100%" alt="Footer Banner" />
</p>
