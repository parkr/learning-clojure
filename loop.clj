(loop [a 7]
  (println a)
  (if (< a 1000)
    (recur (+ a 4))))

