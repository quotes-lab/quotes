# quotes

This application will print a random quote. As well as save a quote from the Ron Swanson api `"http://ron-swanson-quotes.herokuapp.com/v2/quotes"`

## Commands for commandline only

* `author <athors name>`
* `contains <keyword(s)>`
## How to run
`cd to project root and run ./gradlew run`

You can also search for a specific artist or quotes that contain a keyword with the below commands.

`./gradlew run --args 'author "T.J. Klune"'`

`cd to project root and run ./gradlew run`


# Quote
      String author;
      String likes;
      String text;

# App 

## getQuotes
args:

returns:
* List<Quote> | the quotes loaded form the json file.

throws:
* FileNotFoundException


##  getSpecificQuote
args:
* String[] args | args from the command line. expect [<author or contins>, any].
* List<Quote> quotes | the quotes to select a single quote from.
returns:
* String | a string representing the found quote