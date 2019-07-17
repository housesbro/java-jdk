(ns javax.swing.plaf.BorderUIResource$LineBorderUIResource
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf BorderUIResource$LineBorderUIResource]))

(defn ->line-border-ui-resource
  "Constructor.

  color - `java.awt.Color`
  thickness - `int`"
  ([^java.awt.Color color ^Integer thickness]
    (new BorderUIResource$LineBorderUIResource color thickness))
  ([^java.awt.Color color]
    (new BorderUIResource$LineBorderUIResource color)))

