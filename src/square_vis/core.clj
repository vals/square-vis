(ns square-vis.core
  (:gen-class)
  (:require [monger.core :as mg])
  (:require [monger.collection :as mc])
  (:use monger.operators)
  (:use quil.core))

(mg/connect!)
(mg/set-db! (mg/get-db "test"))

(defn draw-square
  [doc]
  (let [size (get doc :size)
        x    (get (get doc :coord) 0)
        y    (get (get doc :coord) 1)
        c    (get doc :c)]
    (no-stroke)
    (fill c)
    (rect x y size size)))

(defn -main
  [& args]
  (println (type (mc/find-maps "squares")))
  (println (count (mc/find-maps "squares"))))

(defn setup []
  (smooth)
  (frame-rate 10)
  (background 200))

(defn draw []
  (background 200)
  (doseq [item (mc/find-maps "squares")] (draw-square item)))


(defsketch example                  
           :title "Squaaaares!"  
           :setup setup                      
           :draw draw                        
           :size [323 200])                  
