# MCC Xtext Project

This folder contains an Eclipse/Xtext language project for the MCC DSL. The main grammar is defined in `org.xtext.MCCc/src/org/xtext/MCC.xtext`, and the generated runtime/IDE/UI plugins are split across the sibling projects under this folder.

## Project layout

- `org.xtext.MCCc/` — runtime language project (grammar, parser, validator, generated model)
- `org.xtext.MCCc.ide/` — IDE support
- `org.xtext.MCCc.ui/` — Eclipse editor and UI integration
- `org.xtext.MCCc.tests/` and `org.xtext.MCCc.ui.tests/` — tests
- `org.xtext.MCCc.feature/` — Eclipse feature metadata

## Requirements

Before running the project, install:

- Java 17 JDK
- Eclipse IDE for Java and DSL Developers (or a recent Eclipse Modeling Tools package)
- Xtext and PDE support installed in Eclipse (typically included in the DSL package)

## How to run it in Eclipse

1. Start Eclipse.
2. Import the project:
   - File -> Open Projects from File System...
   - Select the folder `mobica-extension`
   - Import the Eclipse projects inside it
3. Wait for the workspace to build.
4. Open the preconfigured launch configuration:
   - `org.xtext.MCCc/.launch/Launch Runtime Eclipse.launch`
   - Or open Run -> Run Configurations... -> Eclipse Application and create one if needed.
5. Run it as an Eclipse Application.

This launches a second Eclipse instance that contains the MCC language plugged in. In that runtime Eclipse instance, you can create a new project and add a file ending with `.mcc` to use the DSL editor.

## Typical workflow

### 1. Edit the grammar

If you change the grammar in `org.xtext.MCCc/src/org/xtext/MCC.xtext`, regenerate the Java/Xtext artifacts:

- Right-click `org.xtext.MCCc/src/org/xtext/GenerateMCC.mwe2`
- Choose Run As -> MWE2 Workflow

This regenerates the parser, scoping, serializer, and other generated code.

### 2. Run the runtime workbench

Use the launch config above to test the editor and language in a live Eclipse environment.

### 3. Build the project

Use the standard Eclipse workspace build. If needed, you can also do a Clean on the projects and rebuild.

## Troubleshooting

- If Eclipse reports Java version problems, switch the workspace to Java 17.
- If generated code is stale, clean the projects and regenerate with the MWE2 workflow.
- If the DSL does not appear in the runtime Eclipse instance, ensure the project is imported as Eclipse projects and the workspace has been refreshed.

## Notes

This project is not a standalone Java application with a `main` method. It is an Eclipse plugin/Xtext language project designed to run as a runtime Eclipse application.

If you want to test the language, the normal path is: import project -> run `Launch Runtime Eclipse` -> create `.mcc` file in the runtime workbench.
