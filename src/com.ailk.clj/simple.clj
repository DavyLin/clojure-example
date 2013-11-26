(defn adder
  [n] 
  (fn  [x]  (+ n x )) )

(defn doubler
  [f] 
  (fn [& args]
    (* 2 (apply f args))))

                                        ; if
(defn is-small? [number]
  (if (< number 100)  "yes"))
                                        ;if - do
(defn is-small2? [number]
  (if  (< number 100)
    "yes"
    (do
      (println "Saw a big number" number)
      "no")))

                                        ;loop , recur
(loop [result [] x 5]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))


                                        ; expend for loop
(defn countdown [result x]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))

;;(countdown [] 5)
                                        ;-> [5 4 3 2 1]

;; the other solution;
(into [] (take 5 (iterate dec 5)))   ;->[ 5 4 3 2 1]
(into [] (drop-last (reverse (range 6))))
(vec (reverse (rest (range 6))))


(defn indexed [coll] (map-indexed vector coll))

(defn index-filter [pred coll]
  (when pred
    (for [[idx  elt]  (indexed coll) :when  (pred elt)]  idx)))

;;metadata
;;^metadata form
(defn ^{:tag String}  shout  [^{:tag  String}  s]   (.toUpperCase  s))


(meta #'shout)


;; simple form
(defn ^String shout  [^String s]  (.toUpperCase s))

(defn shout
  ([s]   (.toUpperCase  s))
  {:tag  String})



















