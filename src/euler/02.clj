;https://projecteuler.net/problem=2

(ns euler.02)

(defn fib-from
  "Fibonacci sequence starting with the first two digits"
  [a b]
  (lazy-seq
    (cons a
      (fib-from b
        (+ b a)))))

(defn fib
  "First N digits of the standard fib sequence"
  [n]
  (take n (fib-from 1 1)))

(defn solve
  "Sum of the even numbers in the Fibonacci sequence that are less than 4 million"
  []
  (reduce + (filter #(even? %) (fib 33))))
