<div align="center">

# CAP Annotation to OCL Converter

### A Thesis Project for Automated OCL Constraint Generation and Validation

Convert CAP annotations into **OCL (Object Constraint Language)** constraints with support for:

✅ Standalone conversion  
✅ Domain model validation  
✅ UML-based analysis  
✅ USE plugin integration

</div>

---

# Overview

**CAP Annotation to OCL Converter** is a plugin-based system developed on top of the **USE (UML-based Specification Environment)** ecosystem.

The project aims to simplify the process of:

- Defining CAP annotations
- Generating OCL constraints automatically
- Validating generated constraints against UML domain models
- Supporting model-driven engineering workflows

This project was developed as part of an academic thesis focusing on automated constraint generation and validation.

---

# Key Features

## CAP Management

Create and manage CAP annotations with:

- Class diagrams
- Descriptions
- Quick preview information

This helps users quickly understand the purpose and structure of each CAP.

---

## CAP Classification

Assign semantic types to CAPs based on business logic.

This improves organization and enables better annotation management.

---

## Standalone Annotation → OCL Conversion

Convert CAP annotations directly into OCL constraints without requiring a domain model.

### Suitable for

- Rapid testing
- Independent OCL generation
- Annotation experimentation
- Learning and research

---

## Domain Model Validation

Generate OCL constraints using a `.use` domain model context.

The system validates generated OCL against the domain model to ensure:

- Correct syntax
- Valid references
- Structural consistency
- Compatibility with UML elements

---

# Architecture

```text
root
├── use-cap
├── use-assembly
├── use-gui
└── ...
```

| Module | Purpose |
|---|---|
| `use-cap` | Main CAP annotation plugin |
| `use-gui` | GUI resources and runtime assets |
| `use-assembly` | USE application packaging |

---

# Prerequisites

Before running the project, ensure the following are installed:

- Java
- Maven

Verify installation:

```bash
java -version
mvn -version
```

---

# Clone Repository

```bash
git clone https://github.com/shibeinu3110/CAP_Thesis_2026.git
```

---

# Setup Instructions

## Step 1 — Download Required Resources

Download `bin.zip` from the repository resources.

---

## Step 2 — Extract Files

Unzip the downloaded archive.

---

## Step 3 — Copy `bin` Directory

Copy the extracted `bin` folder into:

```text
use-gui/src/main/resources/
```

Your structure should look like:

```text
resources
├── bin
├── images
└── ...
```

---

# Running the Project

The project can be executed using either:

- Manual build process
- Automated batch script

---

# Option 1 — Manual Build

## 1. Build Plugin

Run from the root directory:

```bash
mvn clean package -pl use-cap -am
```

---

## 2. Copy Generated JAR

Copy the generated JAR file from:

```text
use-cap/target/
```

Paste it into:

```text
use-assembly/src/main/resources/plugins/
```

---

## 3. Build USE Assembly

```bash
mvn package -pl use-assembly
```

## 4. Extract and Run the Application

Extract the following archive:

```text
use-assembly/target/use-7.1.1.zip
```

After extraction, run:

```text
bin/start_use.bat
```

to start the application.

---

# Option 2 — Automated Script

A helper script is included to automate the entire setup and execution process.

## Usage

### 1. Open Script

```text
run-use.bat
```

---

### 2. Configure Root Directory

Update:

```text
ROOT_DIR
```

to match your local cloned repository path.

---

### 3. Execute Script

Run using CMD:

```bash
run-use.bat
```

The script automatically:

- Builds the plugin
- Copies generated artifacts
- Packages the USE assembly
- Launches the application

---

# Successful Installation

If everything runs correctly, the plugin should appear inside the USE GUI.

Add your screenshot below:

```markdown
![Plugin Screenshot](images/plugin-preview.png)
```

---

# Example Workflow

```text
Create CAP Annotation
        ↓
Select Conversion Mode
        ↓
Generate OCL Constraints
        ↓
Validate Against .use Domain Model
        ↓
Review Generated OCL Output
```

---

# Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core development |
| Maven | Dependency management & build |
| ANTLR | Annotation parsing |
| OCL | Constraint specification |
| USE | UML/OCL environment |

---

# Future Improvements

Planned enhancements include:

- Advanced OCL semantic validation
- Better annotation parsing support
- Enhanced GUI interaction
- Additional CAP templates
- Import/export functionality
- Improved error visualization

---

# Contributing

Contributions are welcome.

You can contribute by:

1. Forking the repository
2. Creating a feature branch
3. Implementing improvements
4. Opening a Pull Request

Bug reports, feature requests, and discussions are highly appreciated.

---

# Support

If you encounter any issues or have questions:

- Open an issue on GitHub
- Or contact:

```text
22028033@vnu.edu.vn
```

---

# License

This project was developed for academic and research purposes as part of a thesis project.
