(ns javax.swing.plaf.synth.SynthTabbedPaneUI
  "Provides the Synth L&F UI delegate for
  JTabbedPane.

  Looks up the selectedTabPadInsets property from the Style,
  which represents additional insets for the selected tab."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.synth SynthTabbedPaneUI]))

(defn ->synth-tabbed-pane-ui
  "Constructor."
  (^SynthTabbedPaneUI []
    (new SynthTabbedPaneUI )))

(defn *create-ui
  "Creates a new UI object for the given component.

  c - component to create UI object for - `javax.swing.JComponent`

  returns: the UI object - `javax.swing.plaf.ComponentUI`"
  (^javax.swing.plaf.ComponentUI [^javax.swing.JComponent c]
    (SynthTabbedPaneUI/createUI c)))

(defn get-context
  "Returns the Context for the specified component.

  c - Component requesting SynthContext. - `javax.swing.JComponent`

  returns: SynthContext describing component. - `javax.swing.plaf.synth.SynthContext`"
  (^javax.swing.plaf.synth.SynthContext [^SynthTabbedPaneUI this ^javax.swing.JComponent c]
    (-> this (.getContext c))))

(defn property-change
  "This method gets called when a bound property is changed.

  e - A PropertyChangeEvent object describing the event source and the property that has changed. - `java.beans.PropertyChangeEvent`"
  ([^SynthTabbedPaneUI this ^java.beans.PropertyChangeEvent e]
    (-> this (.propertyChange e))))

(defn update
  "Notifies this UI delegate to repaint the specified component.
   This method paints the component background, then calls
   the paint(SynthContext,Graphics) method.

   In general, this method does not need to be overridden by subclasses.
   All Look and Feel rendering code should reside in the paint method.

  g - the Graphics object used for painting - `java.awt.Graphics`
  c - the component being painted - `javax.swing.JComponent`"
  ([^SynthTabbedPaneUI this ^java.awt.Graphics g ^javax.swing.JComponent c]
    (-> this (.update g c))))

(defn paint-border
  "Paints the border.

  context - a component context - `javax.swing.plaf.synth.SynthContext`
  g - Graphics to paint on - `java.awt.Graphics`
  x - the X coordinate - `int`
  y - the Y coordinate - `int`
  w - width of the border - `int`
  h - height of the border - `int`"
  ([^SynthTabbedPaneUI this ^javax.swing.plaf.synth.SynthContext context ^java.awt.Graphics g ^Integer x ^Integer y ^Integer w ^Integer h]
    (-> this (.paintBorder context g x y w h))))

(defn paint
  "Paints the specified component according to the Look and Feel.
   This method is not used by Synth Look and Feel.
   Painting is handled by the paint(SynthContext,Graphics) method.

  g - the Graphics object used for painting - `java.awt.Graphics`
  c - the component being painted - `javax.swing.JComponent`"
  ([^SynthTabbedPaneUI this ^java.awt.Graphics g ^javax.swing.JComponent c]
    (-> this (.paint g c))))

