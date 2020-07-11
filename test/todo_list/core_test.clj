(ns todo-list.core-test
  (:require [clojure.test :refer :all]
            [todo-list.core :refer :all]
            [midje.sweet :refer :all]))
(fact
  (conj [1 2] 3) => [1 2 3]
  (maisum 2) => 2)


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
