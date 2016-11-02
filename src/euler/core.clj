(ns euler.core
  (:require
    [euler.01 :as euler-1]
    [euler.02 :as euler-2]
    [euler.22 :as euler-22])
  (:gen-class))

(defn -main
  "Prints answers to solved Euler problems"
  [& args]

  (time (println "Euler 1: " (euler-1/solve)))
  (time (println "Euler 2: " (euler-2/solve)))
  (time (println "Euler 22: " (euler-22/solve))))
