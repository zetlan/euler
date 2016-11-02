(ns euler.core
  (:require
    [euler.01 :as euler-1]
    [euler.02 :as euler-2])
  (:gen-class))

(defn -main
  "Prints answers to solved Euler problems"
  [& args]

  (println "Euler 1: " (euler-1/solve))
  (println "Euler 2: " (euler-2/solve)))
