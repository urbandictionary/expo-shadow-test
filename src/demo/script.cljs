(ns demo.script
  (:require [reagent.core :as r]
            ["react-native" :as react-native]))

(defn Hi []
  (r/as-element [:> (.-Text react-native) 
                 {:on-press #(js/alert "From clojurescript")}
                  "clojurescript & shadow here"]))
