(ns hello-clojure.demo
  (:require [clojure.set :as set]
            [clojure.string :as str]))

(def data [{:id 100 :a "ABC" :b "Book" :c 10.00}
           {:id 200 :a "XYZ" :b "Notepad" :c 11.00}
           {:id 300 :a "MNO" :b "Pen" :c 5.00}
           {:id 400 :a "LMN" :b "Eraser" :c 2.99}])

;; Basic filter of vector
(def output (filter #(= 400 (:id %)) data))
(println "EXECUTION OUTPUT: " output)

(def output-2 (filter #((= 400 (:id %)) select-keys ) data))
