(ns demo.script
  (:require [reagent.core :as r]
            ["react-native" :as react-native]))

(def Hi
  (r/reactify-component (fn [] [:> (.-View react-native)
                 {:style {:flex 1
                          :align-items 'center
                          :justify-content 'center}}
                  [:> (.-Text react-native) 
                 {:on-press #(js/alert "From clojurescript")}
                  "cljs, shadow, expo and hot reloading. try changing this text"]])))
