(ns javax.swing.plaf.basic.BasicComboPopup
  "This is a basic implementation of the ComboPopup interface.

  This class represents the ui for the popup portion of the combo box.

  All event handling is handled by listener classes created with the
  createxxxListener() methods and internal classes.
  You can change the behavior of this class by overriding the
  createxxxListener() methods and supplying your own
  event listeners or subclassing from the ones supplied in this class.

  Warning:
  Serialized objects of this class will not be compatible with
  future Swing releases. The current serialization support is
  appropriate for short term storage or RMI between applications running
  the same version of Swing.  As of 1.4, support for long term storage
  of all JavaBeans™
  has been added to the java.beans package.
  Please see XMLEncoder."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.basic BasicComboPopup]))

(defn ->basic-combo-popup
  "Constructor.

  combo - `javax.swing.JComboBox`"
  (^BasicComboPopup [^javax.swing.JComboBox combo]
    (new BasicComboPopup combo)))

(defn hide
  "Implementation of ComboPopup.hide()."
  ([^BasicComboPopup this]
    (-> this (.hide))))

(defn get-mouse-listener
  "Implementation of ComboPopup.getMouseListener().

  returns: a MouseListener or null - `java.awt.event.MouseListener`"
  (^java.awt.event.MouseListener [^BasicComboPopup this]
    (-> this (.getMouseListener))))

(defn focus-traversable?
  "Overridden to unconditionally return false.

  returns: true if this Component is
   focusable; false otherwise - `boolean`"
  (^Boolean [^BasicComboPopup this]
    (-> this (.isFocusTraversable))))

(defn get-key-listener
  "Implementation of ComboPopup.getKeyListener().

  returns: a KeyListener or null - `java.awt.event.KeyListener`"
  (^java.awt.event.KeyListener [^BasicComboPopup this]
    (-> this (.getKeyListener))))

(defn show
  "Implementation of ComboPopup.show()."
  ([^BasicComboPopup this]
    (-> this (.show))))

(defn uninstalling-ui
  "Called when the UI is uninstalling.  Since this popup isn't in the component
   tree, it won't get it's uninstallUI() called.  It removes the listeners that
   were added in addComboBoxListeners()."
  ([^BasicComboPopup this]
    (-> this (.uninstallingUI))))

(defn get-list
  "Implementation of ComboPopup.getList().

  returns: `javax.swing.JList`"
  (^javax.swing.JList [^BasicComboPopup this]
    (-> this (.getList))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this BasicComboPopup.
   The AccessibleContext will have its parent set to the ComboBox.

  returns: an AccessibleContext for the BasicComboPopup - `javax.accessibility.AccessibleContext`"
  (^javax.accessibility.AccessibleContext [^BasicComboPopup this]
    (-> this (.getAccessibleContext))))

(defn get-mouse-motion-listener
  "Implementation of ComboPopup.getMouseMotionListener().

  returns: a MouseMotionListener or null - `java.awt.event.MouseMotionListener`"
  (^java.awt.event.MouseMotionListener [^BasicComboPopup this]
    (-> this (.getMouseMotionListener))))

