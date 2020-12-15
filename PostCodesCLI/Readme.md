# PostCodes CLI

## Instructions

### To run from Terminal
_Note: To view output in ANSI console colors, run from terminal._
```
cd PostCodesCLI
mvn clean install
java -cp "picocli-4.5.2.jar:target/PostCodesCLI-1.0-shaded.jar" io.postcodes.cli.PostCodesCLI <postcode>
```
_Note: Replace `<postcode>` in above command with your postcode input!_

Examples:
1. PostCode with 9 nearest postcodes
```
java -cp "picocli-4.5.2.jar:target/PostCodesCLI-1.0-shaded.jar" io.postcodes.cli.PostCodesCLI NW25PA
```

2. PostCode with no nearest postcodes
```
java -cp "picocli-4.5.2.jar:target/PostCodesCLI-1.0-shaded.jar" io.postcodes.cli.PostCodesCLI CB30FA
```

### To run from Intelli J IDEA
_Note: Intelli J IDEA will no show ANSI console colors._
1. Run `PostCodesCLI` main-class with your provided postcode as main method argument.