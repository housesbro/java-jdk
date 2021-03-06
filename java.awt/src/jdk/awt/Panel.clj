(ns jdk.awt.Panel
  "Panel is the simplest container class. A panel
  provides space in which an application can attach any other
  component, including other panels.

  The default layout manager for a panel is the
  FlowLayout layout manager."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.awt Panel]))

(defn ->panel
  "Constructor.

  Creates a new panel with the specified layout manager.

  layout - the layout manager for this panel. - `java.awt.LayoutManager`"
  (^Panel [^java.awt.LayoutManager layout]
    (new Panel layout))
  (^Panel []
    (new Panel )))

(defn add-notify
  "Creates the Panel's peer.  The peer allows you to modify the
   appearance of the panel without changing its functionality."
  ([^Panel this]
    (-> this (.addNotify))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this Panel.
   For panels, the AccessibleContext takes the form of an
   AccessibleAWTPanel.
   A new AccessibleAWTPanel instance is created if necessary.

  returns: an AccessibleAWTPanel that serves as the
           AccessibleContext of this Panel - `javax.accessibility.AccessibleContext`"
  (^javax.accessibility.AccessibleContext [^Panel this]
    (-> this (.getAccessibleContext))))

