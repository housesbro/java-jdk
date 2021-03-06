(ns javax.swing.DefaultFocusManager
  "This class has been obsoleted by the 1.4 focus APIs. While client code may
  still use this class, developers are strongly encouraged to use
  java.awt.KeyboardFocusManager and
  java.awt.DefaultKeyboardFocusManager instead.

  Please see

  How to Use the Focus Subsystem,
  a section in The Java Tutorial, and the
  Focus Specification
  for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing DefaultFocusManager]))

(defn ->default-focus-manager
  "Constructor."
  (^DefaultFocusManager []
    (new DefaultFocusManager )))

(defn get-component-after
  "a-container - `java.awt.Container`
  a-component - `java.awt.Component`

  returns: `java.awt.Component`"
  (^java.awt.Component [^DefaultFocusManager this ^java.awt.Container a-container ^java.awt.Component a-component]
    (-> this (.getComponentAfter a-container a-component))))

(defn get-component-before
  "a-container - `java.awt.Container`
  a-component - `java.awt.Component`

  returns: `java.awt.Component`"
  (^java.awt.Component [^DefaultFocusManager this ^java.awt.Container a-container ^java.awt.Component a-component]
    (-> this (.getComponentBefore a-container a-component))))

(defn get-first-component
  "a-container - `java.awt.Container`

  returns: `java.awt.Component`"
  (^java.awt.Component [^DefaultFocusManager this ^java.awt.Container a-container]
    (-> this (.getFirstComponent a-container))))

(defn get-last-component
  "a-container - `java.awt.Container`

  returns: `java.awt.Component`"
  (^java.awt.Component [^DefaultFocusManager this ^java.awt.Container a-container]
    (-> this (.getLastComponent a-container))))

(defn compare-tab-order
  "a - `java.awt.Component`
  b - `java.awt.Component`

  returns: `boolean`"
  (^Boolean [^DefaultFocusManager this ^java.awt.Component a ^java.awt.Component b]
    (-> this (.compareTabOrder a b))))

