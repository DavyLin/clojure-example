(defn ellipsize [words]
  (let [[w1 w2 w3]  (str/split words #"\s+")]
    (str/join " " [w1 w2 w3 "..."])))

