(require '[clojure.java.io :as io])

;;׷��д���ļ�
(defn appendFile [fileName content]
  (binding [*out* (java.io.FileWriter. fileName true)]
    (println content)
    (flush )))

(apendFile "my.log" "hello,linjx")
(appendFile "my.log" "hello,linq")

;;���ж�ȡ�ļ��е����ݣ����ŵ�List��
(defn read-file-into-list [fileName]
  (with-open [rdr (io/reader fileName)]
    (doall (line-seq rdr)) ))

(println (read-file-into-list "my.log"))

;; ��ӡ�ļ��е�ÿһ������
(defn printFile [fileName]
  (with-open [rdr (io/reader fileName)]
    (doseq [line (line-seq rdr)]
      (println line))))

(println "-------------")
(printFile "my.log")
