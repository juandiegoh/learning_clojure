(ns fp-oo-exercises.just-enough-clojure)

(def second (fn [list] (nth list 1)))
(def third (fn [list] (nth list 2)))
(def third-2 (fn [list] (first (rest (rest list)))))


(def square (fn [a] (* a a)))
(def add-squares
  (fn [& numbers]
    (apply + (map square numbers))))

(def factorial
  (fn [number]
    (apply * (range 1 (inc number)))))

(def prefix-of?
  (fn [pre sequ]
    (if (empty? (filter false? (map = pre sequ))) true false)))

(def prefix-of2?
  (fn [pre sequ]
    (nil? (first (filter false? (map = pre sequ))))))

(def prefix-of3?
  (fn [candidate seq]
    (= candidate (take (count candidate) seq))))