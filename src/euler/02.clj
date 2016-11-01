;https://projecteuler.net/problem=2

(ns euler.02)
(refer 'euler.util)

(defn euler-2
  "Sum of the even numbers in the Fibonacci sequence that are less than 4 million"
  []
  (reduce + (filter #(even? %) (fib 33))))
