;https://projecteuler.net/problem=1

(ns euler.01
  (:require [clojure.set :as set]))

(defn multiples-of
  "Generates a sequence of multiples of N starting at N"
  [n]
  (map #(* n %) (iterate inc 1)))

(defn solve
  "Sum of the multiples of 3 or 5 below 1,000.

  Some math with simplify the problem. The highest multiple of 3 that's less than
  1,000 is 999, and 999 / 3 = 333. For 5, it's 995, and 995 / 5 = 199. So we
  know there are 333 multiples of 3 and 199 multiples of 5 that are less than
  1,000.

  That gives us 2 sets, but each set has numbers like 15 or 30 that are multiples
  of both 3 AND 5, and we don't want to count them twice, so we take the distinct
  union of both sets before summing them.

  Finally, we could simplify even further - both sets are arithmetic progressions,
  and there's a generalized equation for their sums. But this solution is a bit
  more Lisp-ish than straight-up math. (For the record, you'd calculate the sums
  of multiples of 3 and multiples of 5, then subtract the sum of multiples of 15)."
  []
  (reduce +
    (set
      (set/union
        (take 333 (multiples-of 3))
        (take 199 (multiples-of 5))))))
