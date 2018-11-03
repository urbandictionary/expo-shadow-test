(ns demo.script
  (:require [reagent.core :as r]
            ["react-native" :as react-native]))

(.. js/module -hot (accept (fn []
                             (prn "hey I'm being reloaded now"))))

(def Hi
  (r/reactify-component (fn [] [:> (.-View react-native)
                 {:style {:flex 1
                          :align-items 'center
                          :justify-content 'center}}
                  [:> (.-Text react-native) 
                 {:on-press #(js/alert "From clojurescript")}
                  "cljs, shadow, expo"]])))
