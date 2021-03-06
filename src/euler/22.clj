;https://projecteuler.net/problem=22

(ns euler.22
  (:require
    [clojure.string :as str]
    [clojure.java.io :as io]))

(defn names
  "Get the names stored in a CSV file (filename) and return them in a list.

  If the filename is blank or missing, default to the known good file
  in the resources/ directory."
  ([] (names "p022_names.txt"))
  ([filename]
  (-> filename
      io/resource
      .getPath
      slurp
      (.replace "\"" "")
      (str/split #"[\s]*,[\s]*"))))

(def alphabet-str "ABCDEFGHIJKLMNOPQRSTUVWXYZ") ; A string containing the alphabet

(defn alpha-value
  "Returns the numeric value of a character A-Z, where A is 1 and Z is 26."
  [char]
  (inc (str/index-of alphabet-str char)))

(defn word-value
  "Returns the sum of the numeric values of the letters in word."
  [word]
  (reduce + (map alpha-value (str/split word, #""))))

(defn rank-value
  "Given a list of words, returns a list of rank values.

  The rank-value of a word is defined as the product of its word value and
  its position in the list (position starts at 1)."
  [words]
  (for [i (range (count words))] (* (inc i) (word-value (nth words i)))))

(defn solve
  "Sum of the 'rank-values' of >5,000 names per the problem description."
  []
  (reduce + (-> (names)
                sort
                rank-value)))


