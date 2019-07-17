(ns javax.swing.plaf.basic.BasicRadioButtonMenuItemUI
  "BasicRadioButtonMenuItem implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.basic BasicRadioButtonMenuItemUI]))

(defn ->basic-radio-button-menu-item-ui
  "Constructor."
  ([]
    (new BasicRadioButtonMenuItemUI )))

(defn *create-ui
  "b - `javax.swing.JComponent`

  returns: `javax.swing.plaf.ComponentUI`"
  ([^javax.swing.JComponent b]
    (BasicRadioButtonMenuItemUI/createUI b)))

(defn process-mouse-event
  "item - `javax.swing.JMenuItem`
  e - `java.awt.event.MouseEvent`
  path - `javax.swing.MenuElement[]`
  manager - `javax.swing.MenuSelectionManager`"
  ([^javax.swing.plaf.basic.BasicRadioButtonMenuItemUI this ^javax.swing.JMenuItem item ^java.awt.event.MouseEvent e ^javax.swing.MenuElement[] path ^javax.swing.MenuSelectionManager manager]
    (-> this (.processMouseEvent item e path manager))))

