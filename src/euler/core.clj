(ns euler.core
  (:gen-class))


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

(defn euler-2
  "Sum of the even numbers in the Fibonacci sequence that are less than 4 million"
  []
  (reduce + (filter #(even? %) (fib 33))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (println (primes-less-than 100))
  (println "Euler 2: " (euler-2))


  )
