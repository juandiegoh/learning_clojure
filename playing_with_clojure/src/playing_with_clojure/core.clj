(ns playing-with-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (if true
    (do (println "IF!")
        "abra cadabra")
    (do (println "Failure :(")
        "hocus pocus"))

  ;; Like if without the else
  (when true
    (println "When!")
    "abra cadabra")

  (println (nil? 1))
  (println (nil? nil)))