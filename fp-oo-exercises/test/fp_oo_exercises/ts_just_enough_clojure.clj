(ns fp-oo-exercises.ts-just-enough-clojure
  (:require [clojure.test :refer :all]
            [fp-oo-exercises.just-enough-clojure :refer :all]))

(deftest a-test
  (testing "I dont fail."
    (is (= (cons '(1) '(())) '((1) ())))))

(deftest tails-spec
  (is (= (tails '(1 2 3 4)) '((1 2 3 4) (2 3 4) (3 4) (4) ())))
  )

(deftest tails2-spec
  (is (= (tails2 '(1 2 3 4)) '((1 2 3 4) (2 3 4) (3 4) (4) ())))
  )

