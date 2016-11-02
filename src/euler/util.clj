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

