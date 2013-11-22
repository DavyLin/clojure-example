(defn adder
  [n] 
  (fn  [x]  (+ n x )) )

(defn doubler
  [f] 
  (fn [& args]
    (* 2 (apply f args))))

