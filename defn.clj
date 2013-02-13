(defn mouse [a]
    (println a)
    (if (< a 1000)
      (recur (+ a 4))))
(mouse 7)