(ns hello-clojure.map-index-sample
  (:require [clojure.set :as set]
            [clojure.string :as str]))
(def data 
  [{:name "James", :age 26} {:name "John", :age 43}])

(defn assoc-index
  [idx m]
  (assoc m :index idx))

;; To associate index to the list items
(clojure.pprint/pprint (map-indexed assoc-index data))

;; output
({:name "James", :age 26, :index {:name "James", :age 26}}
 {:name "John", :age 43, :index {:name "John", :age 43}})