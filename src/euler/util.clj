(ns euler.util)
;; Base utility functions for use throughout problem-solving


(defn primes-less-than
  "Get prime numbers less than N"
  [n]
  (filter #(< % n)
    (reduce
      (fn [prime-list number]
        (if (some zero? (map (partial mod number) prime-list))
          prime-list
          (conj prime-list number)))
      [2]
      (take n (iterate inc 3)))))

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
