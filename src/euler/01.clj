;https://projecteuler.net/problem=1

(ns euler.01
  (:require [clojure.set :as set]))

(defn multiples-of
  "Generates a sequence of multiples of N starting at N"
  [n]
  (map #(* n %) (iterate inc 1)))

;; Some math makes this simpler.
;; The highest multiple of 3 that is less than 1,000 is 999. 999 / 3 = 333.
;; And for 5, it is 995. 995 / 5 = 199.
;; So we can work with the first 333 multiples of 3 & 995 of 5.
;;
;; That gives us two sets, but numbers like 15 or 30 (multiples of 3 AND 5)
;; appear in both sets. So we need the distinct union of these sets.
;;
;; Even more math could simplify further - both sets are simply arithmetic
;; progressions, and there's a generalized equation for their sums. But this
;; solution is definitely more LISP-ish that straight-up math.
(defn solve
  "Sum of the multiples of 3 or 5 below 1,000"
  []
  (reduce +
    (set
      (set/union
        (take 333 (multiples-of 3))
        (take 199 (multiples-of 5))))))
