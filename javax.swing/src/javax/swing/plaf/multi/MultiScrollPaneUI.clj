(ns javax.swing.plaf.multi.MultiScrollPaneUI
  "A multiplexing UI used to combine ScrollPaneUIs.

  This file was automatically generated by AutoMulti."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.multi MultiScrollPaneUI]))

(defn ->multi-scroll-pane-ui
  "Constructor."
  ([]
    (new MultiScrollPaneUI )))

(defn *create-ui
  "Returns a multiplexing UI instance if any of the auxiliary
   LookAndFeels supports this UI.  Otherwise, just returns the
   UI object obtained from the default LookAndFeel.

  a - `javax.swing.JComponent`

  returns: `javax.swing.plaf.ComponentUI`"
  ([^javax.swing.JComponent a]
    (MultiScrollPaneUI/createUI a)))

(defn install-ui
  "Invokes the installUI method on each UI handled by this object.

  a - the component where this UI delegate is being installed - `javax.swing.JComponent`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.installUI a))))

(defn get-minimum-size
  "Invokes the getMinimumSize method on each UI handled by this object.

  a - the component whose minimum size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.getMinimumSize a))))

(defn get-maximum-size
  "Invokes the getMaximumSize method on each UI handled by this object.

  a - the component whose maximum size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.getMaximumSize a))))

(defn get-accessible-child
  "Invokes the getAccessibleChild method on each UI handled by this object.

  a - `javax.swing.JComponent`
  b - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `javax.accessibility.Accessible`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a ^Integer b]
    (-> this (.getAccessibleChild a b))))

(defn get-u-is
  "Returns the list of UIs associated with this multiplexing UI.  This
   allows processing of the UIs by an application aware of multiplexing
   UIs on components.

  returns: `javax.swing.plaf.ComponentUI[]`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this]
    (-> this (.getUIs))))

(defn uninstall-ui
  "Invokes the uninstallUI method on each UI handled by this object.

  a - the component from which this UI delegate is being removed; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.uninstallUI a))))

(defn contains
  "Invokes the contains method on each UI handled by this object.

  a - the component where the x,y location is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`
  b - the x coordinate of the point - `int`
  c - the y coordinate of the point - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `boolean`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a ^Integer b ^Integer c]
    (-> this (.contains a b c))))

(defn update
  "Invokes the update method on each UI handled by this object.

  a - the Graphics context in which to paint - `java.awt.Graphics`
  b - the component being painted; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^java.awt.Graphics a ^javax.swing.JComponent b]
    (-> this (.update a b))))

(defn get-accessible-children-count
  "Invokes the getAccessibleChildrenCount method on each UI handled by this object.

  a - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `int`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.getAccessibleChildrenCount a))))

(defn paint
  "Invokes the paint method on each UI handled by this object.

  a - the Graphics context in which to paint - `java.awt.Graphics`
  b - the component being painted; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^java.awt.Graphics a ^javax.swing.JComponent b]
    (-> this (.paint a b))))

(defn get-preferred-size
  "Invokes the getPreferredSize method on each UI handled by this object.

  a - the component whose preferred size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([^javax.swing.plaf.multi.MultiScrollPaneUI this ^javax.swing.JComponent a]
    (-> this (.getPreferredSize a))))

