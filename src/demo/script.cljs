(ns demo.script
  (:require [reagent.core :as r]
            ["react-native" :as react-native]))

(defn Hi []
  (r/as-element [:> (.-View react-native)
                 {:style {:flex 1
                          :align-items 'center
                          :justify-content 'center}}
                  [:> (.-Text react-native) 
                 {:on-press #(js/alert "From clojurescript")}
                  "clojurescript & shadow here!!~~~~~!!"]]))
