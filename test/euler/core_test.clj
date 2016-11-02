(ns euler.core-test
  (:require [clojure.test :refer :all]
            [euler.core :refer :all]
            [euler.01 :as euler-1]
            [euler.02 :as euler-2]
            [euler.22 :as euler-22])
  (:gen-class))

(deftest euler-01-test
  (testing "Euler problem 1: failure."
    (is (= 233168 (euler-1/solve)))))

(deftest euler-02-test
  (testing "Euler problem 2: failure."
    (is (= 4613732 (euler-2/solve)))))

(deftest euler-22-test
  (testing "Euler problem 22: failure."
    (is (= 871198282 (euler-22/solve)))))
