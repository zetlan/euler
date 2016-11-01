(ns euler.core
  (:require
    [euler.util :refer :all]
    [euler.01 :refer :all]
    [euler.02 :refer :all])
  (:gen-class))

(defn -main
  "Prints answers to solved Euler problems"
  [& args]

  (println "Euler 1: " (euler-1))
  (println "Euler 2: " (euler-2))


  )
