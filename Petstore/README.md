# Petstore generated Xtext project

This folder contains the generated MCC models for the Petstore case study. It is not a standalone Java application; it is a model project built around the Xtext language defined in the sibling project `mobica-extension`.

The important files are:

- `src/petstore-mono.mcc` — the microservices-style use case
- `src/petstore-bis.mcc` — the monolith-style use case
- `src-gen/` — generated XML files produced by the Xtext generator

The repository already includes generated outputs in `src-gen/`, including `Network_system.xml`, as a reference. You can regenerate them when you change the `.mcc` models.

## What this project contains

The Petstore project models two alternative deployment architectures:

1. Microservices architecture
   - File: `src/petstore-mono.mcc`
   - System name: `PetstoreMicro`
   - This model contains separate cloud nodes for `OrderServer`, `FrontendServer`, `AuthServer`, `CatalogServer`, `AccountServer`, and `CartServer`.

2. Monolith architecture
   - File: `src/petstore-bis.mcc`
   - System name: `Network`
   - This model contains a single application/service setup with `Application_service` and `Database_server`.

## Requirements

Before generating the XML files, install:

- Java 17 JDK
- Eclipse IDE for Java and DSL Developers (or a recent Eclipse Modeling Tools distribution)
- The Xtext project from `mobica-extension` imported into the same Eclipse workspace

## How to run it

### 1. Open Eclipse with the Xtext plugin

Open Eclipse and import the project tree containing the Xtext language definition.

Recommended setup:

- Import the workspace folder containing the sibling project `mobica-extension`
- Make sure the Xtext language project is built successfully
- Keep the Petstore folder inside the same workspace

### 2. Launch the Xtext runtime workbench

Use the launch configuration already provided in the Xtext project:

- `mobica-extension/org.xtext.MCCc/.launch/Launch Runtime Eclipse.launch`

Run it as an Eclipse Application.

This opens a second Eclipse instance that contains the MCC language editor and generator.

### 3. Import or open the Petstore files

In the runtime Eclipse instance:

- create or open a project containing the `Petstore/src` folder
- open `src/petstore-mono.mcc` or `src/petstore-bis.mcc`
- verify the file is recognized as an `.mcc` file and edited with the MCC editor

### 4. Generate the XML output

Once the file is open in the Xtext editor, run the generated model generator:

- Right-click the `.mcc` file or the project
- Use the project generator / Xtext generation action if available in the runtime Eclipse instance
- Alternatively, trigger the Xtext generation from the Eclipse project build flow

The generated files are written to the `src-gen/` folder. For these Petstore models, the expected output includes `Network_system.xml` and the per-service XML files such as `Frontend.xml`, `CatalogService.xml`, etc.

## Regenerate both use cases

### Use case 1: Microservices model

Open:

- `src/petstore-mono.mcc`

Then generate. The result corresponds to the microservices architecture and is the generated network model for `PetstoreMicro`.

### Use case 2: Monolith model

Open:

- `src/petstore-bis.mcc`

Then generate. The result corresponds to the monolith architecture and is the generated network model for `Network`.

## Expected output location

After generation, check:

- `Petstore/src-gen/Network_system.xml`
- additional service XML files in `Petstore/src-gen/`

The project already contains examples of these generated artifacts, so you can compare your regenerated output with the included files.

## Notes

- The folder is generated from the Xtext DSL and is intended to be used through the Eclipse runtime workbench, not as a plain Java project.
- If generation does not start, ensure the Xtext project in `mobica-extension` has been imported correctly and the workspace has been refreshed.
- If outputs are stale, clean the project and regenerate the files.

## Quick summary

1. Import the Xtext project from `mobica-extension`.
2. Launch the runtime Eclipse application.
3. Open either `src/petstore-mono.mcc` or `src/petstore-bis.mcc`.
4. Run the generator.
5. Verify the generated XML in `src-gen/`.

This is the normal workflow to produce the network XML for both Petstore use cases.
