# 🎸 Guitar Inventory System — Object-Oriented Specification Pattern Catalog

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:042F2E,50:0F766E,100:2DD4BF&customColorList=042F2E,0F766E,2DD4BF&height=220&section=header&text=Guitar%20Inventory%20System&fontSize=38&fontColor=ffffff&fontAlignY=38&desc=Object-Oriented%20Design%20Patterns%20and%20Polymorphic%20Catalog%20Search%20Engine&descSize=15&descAlignY=60&descAlign=50" width="100%" alt="Guitar Inventory System Banner" />
</p>

<p align="center">
  <b>Extensible Object-Oriented Software Design: Applying the GoF Specification Pattern to Decouple Inventory State from Parametric Search Queries.</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Pattern-Specification%20Pattern-0F766E?style=for-the-badge" alt="Specification Pattern" />
  <img src="https://img.shields.io/badge/Design-SOLID%20Principles-2DD4BF?style=for-the-badge" alt="SOLID" />
  <img src="https://img.shields.io/github/stars/Amaraiah11/GuiterInventory-System?style=for-the-badge&color=gold" alt="Stars" />
</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,git,github,vscode" alt="Tools" />
</p>

---

<a id="table-of-contents"></a>
## 📌 Table of Contents

- [📖 Executive Summary & Overview](#executive-summary--overview)
- [🎯 Key Features & Capabilities](#features)
- [🏗️ System Architecture & Pipeline](#system-architecture--pipeline)
- [🛠️ Tech Stack Breakdown](#tech-stack-breakdown)
- [⚙️ Reproducible Quickstart & Setup](#setup)
- [📁 Project Directory Layout](#project-layout)
- [🧪 Testing & Verification](#testing--verification)
- [🔮 Future Improvements & Roadmap](#future-improvements--roadmap)
- [🤝 Contributing Guidelines](#contributing-guidelines)
- [👨‍💻 Author & Contributions](#author--contributions)

---

<a id="executive-summary--overview"></a>
## 📖 Executive Summary & Overview

Developing enterprise retail inventory applications requires designing flexible software architectures resilient to catalog changes. Hardcoding instrument search criteria directly into inventory loops violates the Single Responsibility and Open/Closed principles, rendering systems brittle when introducing new attributes (such as back woods, string counts, or electronic pickups).

The **Guitar Inventory System** (`GuiterInventory-System`) implements an object-oriented inventory catalog inspired by classic software engineering design patterns. By decoupling instrument specifications from the physical inventory storage entity, the system provides high search flexibility, type safety, and clean algorithmic filtering.

---

<a id="key-features--capabilities"></a>
## 🎯 Key Features & Capabilities

### 🔍 1. GoF Specification Pattern
- Separating physical inventory items (`Guitar`) from their searchable properties (`GuitarSpec`).

### 🏷️ 2. Parametric Matching Algorithm
- Flexible multi-attribute search comparing client query criteria against current inventory records.

---

<a id="system-architecture--pipeline"></a>
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

---

<a id="tech-stack-breakdown"></a>
## 🛠️ Tech Stack Breakdown

| Layer | Technology | Role |
| :--- | :--- | :--- |
| **Language** | Java (JDK 11 / 17 LTS) | Core object-oriented programming language |
| **Data Structures** | Java Collections Framework | Dynamic list storage, iteration, and filtering |
| **Software Design** | Gang of Four (GoF) Principles | Encapsulation, Specification Pattern, Separation of Concerns |

---

<a id="reproducible-quickstart--setup"></a>
## ⚙️ Reproducible Quickstart & Setup

### Prerequisites
- JDK 11 or higher installed

```bash
# 1. Clone repository
git clone https://github.com/Amaraiah11/GuiterInventory-System.git
cd GuiterInventory-System

# 2. Compile Java sources
javac Inventory.java

# 3. Execute inventory simulation
java Inventory
```

---

<a id="project-directory-layout"></a>
## 📁 Project Directory Layout

```text
GuiterInventory-System/
├── Inventory.java             # Core inventory management logic and catalog search
└── README.md                  # Comprehensive OOP architectural documentation
```

---

<a id="testing--verification"></a>
## 🧪 Testing & Verification

- Verified partial query matching (e.g. matching on builder and wood type while leaving model empty) correctly returns matching instruments.

---

<a id="future-improvements--roadmap"></a>
## 🔮 Future Improvements & Roadmap

- [ ] Transition from string constants to type-safe Java `Enum` types for Builders and Wood types.
- [ ] Add SQLite JDBC persistence layer for long-term inventory storage.

---

<a id="author--contributions"></a>
## 👨‍💻 Author & Contributions

This project is developed and maintained with rigorous engineering standards by **Amaraiah C**, Software Developer and Applied Data Analytics Practitioner studying Bachelor of Computer Applications (BCA) at Alliance University, Bangalore.

- 🌐 **GitHub Profile:** [@Amaraiah11](https://github.com/Amaraiah11)
- 💼 **LinkedIn Profile:** [Connect on LinkedIn](https://www.linkedin.com/in/amaraiah-c/)
- 📧 **Institutional Email:** `camaraiahBCA24@ced.alliance.edu.in`

### 🤝 Contributing Guidelines
Contributions, bug reports, and architectural discussions are welcome!
1. **Fork** the repository: `https://github.com/Amaraiah11/GuiterInventory-System`
2. **Create a Feature Branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Commit Your Enhancements:**
   ```bash
   git commit -m "feat: enhance feature logic"
   ```
4. **Push to Your Branch:**
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Open a Pull Request** against the `Amaraiah-C` branch.

---

<p align="center">
  <b>⭐ If this codebase or documentation assisted your engineering workflows, please star the repository! ⭐</b>
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:042F2E,50:0F766E,100:2DD4BF&customColorList=042F2E,0F766E,2DD4BF&height=100&section=footer" width="100%" alt="Footer Banner" />
</p>
