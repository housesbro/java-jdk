(ns jdk.awt.Button
  "This class creates a labeled button. The application can cause
  some action to happen when the button is pushed. This image
  depicts three views of a `Quit` button as it appears
  under the Solaris operating system:



  The first view shows the button as it appears normally.
  The second view shows the button
  when it has input focus. Its outline is darkened to let the
  user know that it is an active object. The third view shows the
  button when the user clicks the mouse over the button, and thus
  requests that an action be performed.

  The gesture of clicking on a button with the mouse
  is associated with one instance of ActionEvent,
  which is sent out when the mouse is both pressed and released
  over the button. If an application is interested in knowing
  when the button has been pressed but not released, as a separate
  gesture, it can specialize processMouseEvent,
  or it can register itself as a listener for mouse events by
  calling addMouseListener. Both of these methods are
  defined by Component, the abstract superclass of
  all components.

  When a button is pressed and released, AWT sends an instance
  of ActionEvent to the button, by calling
  processEvent on the button. The button's
  processEvent method receives all events
  for the button; it passes an action event along by
  calling its own processActionEvent method.
  The latter method passes the action event on to any action
  listeners that have registered an interest in action
  events generated by this button.

  If an application wants to perform some action based on
  a button being pressed and released, it should implement
  ActionListener and register the new listener
  to receive events from this button, by calling the button's
  addActionListener method. The application can
  make use of the button's action command as a messaging protocol."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.awt Button]))

(defn ->button
  "Constructor.

  Constructs a button with the specified label.

  label - a string label for the button, or null for no label - `java.lang.String`

  throws: java.awt.HeadlessException - if GraphicsEnvironment.isHeadless() returns true"
  ([^java.lang.String label]
    (new Button label))
  ([]
    (new Button )))

(defn add-action-listener
  "Adds the specified action listener to receive action events from
   this button. Action events occur when a user presses or releases
   the mouse over this button.
   If l is null, no exception is thrown and no action is performed.
   Refer to AWT Threading Issues for details on AWT's threading model.

  l - the action listener - `java.awt.event.ActionListener`"
  ([^java.awt.Button this ^java.awt.event.ActionListener l]
    (-> this (.addActionListener l))))

(defn add-notify
  "Creates the peer of the button.  The button's peer allows the
   application to change the look of the button without changing
   its functionality."
  ([^java.awt.Button this]
    (-> this (.addNotify))))

(defn get-action-listeners
  "Returns an array of all the action listeners
   registered on this button.

  returns: all of this button's ActionListeners
           or an empty array if no action
           listeners are currently registered - `java.awt.event.ActionListener[]`"
  ([^java.awt.Button this]
    (-> this (.getActionListeners))))

(defn get-label
  "Gets the label of this button.

  returns: the button's label, or null
                  if the button has no label. - `java.lang.String`"
  ([^java.awt.Button this]
    (-> this (.getLabel))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with
   this Button. For buttons, the
   AccessibleContext takes the form of an
   AccessibleAWTButton.
   A new AccessibleAWTButton instance is
   created if necessary.

  returns: an AccessibleAWTButton that serves as the
           AccessibleContext of this Button - `javax.accessibility.AccessibleContext`"
  ([^java.awt.Button this]
    (-> this (.getAccessibleContext))))

(defn remove-action-listener
  "Removes the specified action listener so that it no longer
   receives action events from this button. Action events occur
   when a user presses or releases the mouse over this button.
   If l is null, no exception is thrown and no action is performed.
   Refer to AWT Threading Issues for details on AWT's threading model.

  l - the action listener - `java.awt.event.ActionListener`"
  ([^java.awt.Button this ^java.awt.event.ActionListener l]
    (-> this (.removeActionListener l))))

(defn get-listeners
  "Returns an array of all the objects currently registered
   as FooListeners
   upon this Button.
   FooListeners are registered using the
   addFooListener method.


   You can specify the listenerType argument
   with a class literal, such as
   FooListener.class.
   For example, you can query a
   Button b
   for its action listeners with the following code:



  ActionListener[] als = (ActionListener[])(b.getListeners(ActionListener.class));

   If no such listeners exist, this method returns an empty array.

  listener-type - the type of listeners requested; this parameter should specify an interface that descends from java.util.EventListener - `java.lang.Class<T>`

  returns: an array of all objects registered as
            FooListeners on this button,
            or an empty array if no such
            listeners have been added - `<T extends java.util.EventListener> T[]`

  throws: java.lang.ClassCastException - if listenerType doesn't specify a class or interface that implements java.util.EventListener"
  ([^java.awt.Button this ^java.lang.Class listener-type]
    (-> this (.getListeners listener-type))))

(defn get-action-command
  "Returns the command name of the action event fired by this button.
   If the command name is null (default) then this method
   returns the label of the button.

  returns: `java.lang.String`"
  ([^java.awt.Button this]
    (-> this (.getActionCommand))))

(defn set-action-command
  "Sets the command name for the action event fired
   by this button. By default this action command is
   set to match the label of the button.

  command - a string used to set the button's action command. If the string is null then the action command is set to match the label of the button. - `java.lang.String`"
  ([^java.awt.Button this ^java.lang.String command]
    (-> this (.setActionCommand command))))

(defn set-label
  "Sets the button's label to be the specified string.

  label - the new label, or null if the button has no label. - `java.lang.String`"
  ([^java.awt.Button this ^java.lang.String label]
    (-> this (.setLabel label))))

