# euler

Euler: Clojure-based answers to Project Euler problems.

This was written as part of a code challenge, the challenge being to pick and
solve one or more of the Euler problems. This project is also my first foray
into Clojure, and represents the first time I've touched LISP of any kind since
my Scheme class in 1992 (thanks, University of Delaware!). So, if you're 
stumbling across this and wondering why it isn't more complete ... now you know.

Currently it only addresses problems #1 and #2.

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
02.clj, etc.) with the actual solution in a function called `solve`. `core.clj` 
contains the project -main function. Call a solution to a particular problem thus:

    $ lein repl
    euler.core=> (euler-1/solve)
    # 233168
    
### Bugs/Issues

There's a `util.clj` file in `src/` that we really don't need, but it contains
a `primes-less-than` function that calculates prime numbers below a value N. I
don't actually need this code for anything, but I wrote it when I thought I did
and am leaving it here to show off a bit, I guess.

## License

I don't think we need one of those.
