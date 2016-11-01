# euler

Euler: Clojure-based answers to Project Euler problems.

## Requirements

Euler is designed to "run" in the context of lein. As such, you'll need:

1. Java (v1.8 or later, I think)
2. Leiningen (http://leiningen.org/)   

## Installation

1. Clone or download https://github.com/zetlan/euler.
2. `cd euler`
3. There is no step 3.

## Usage

COMMAND-LINE: Run the core & print the answers:

    $ lein run
    # Euler 1:  233168
    # Euler 2:  4613732
    # ...

REPL: Run individual problems from within the REPL:

    $ lein repl
    euler.core=> (euler-1)
    # 233168
    euler.core=> (euler-2)
    # 4613732


### Structure

Source is in euler/src/euler. Each problem has its own solution file (01.clj, 
02.clj, etc.) There is also a `util.clj` file with re-usable utility functions,
and `core.clj` that contains the project -main function. 

## License

I don't think we need one of those.
