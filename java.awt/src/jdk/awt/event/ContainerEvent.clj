(ns jdk.awt.event.ContainerEvent
  "A low-level event which indicates that a container's contents
  changed because a component was added or removed.

  Container events are provided for notification purposes ONLY;
  The AWT will automatically handle changes to the containers
  contents internally so that the program works properly regardless of
  whether the program is receiving these events or not.

  This low-level event is generated by a container object (such as a
  Panel) when a component is added to it or removed from it.
  The event is passed to every ContainerListener
  or ContainerAdapter object which registered to receive such
  events using the component's addContainerListener method.
  (ContainerAdapter objects implement the
  ContainerListener interface.) Each such listener object
  gets this ContainerEvent when the event occurs.

  An unspecified behavior will be caused if the id parameter
  of any particular ContainerEvent instance is not
  in the range from CONTAINER_FIRST to CONTAINER_LAST."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.awt.event ContainerEvent]))

(defn ->container-event
  "Constructor.

  Constructs a ContainerEvent object.
    This method throws an
   IllegalArgumentException if source
   is null.

  source - The Component object (container) that originated the event - `java.awt.Component`
  id - An integer indicating the type of event. For information on allowable values, see the class description for ContainerEvent - `int`
  child - the component that was added or removed - `java.awt.Component`

  throws: java.lang.IllegalArgumentException - if source is null"
  ([^java.awt.Component source ^Integer id ^java.awt.Component child]
    (new ContainerEvent source id child)))

(def *-container-first
  "Static Constant.

  The first number in the range of ids used for container events.

  type: int"
  ContainerEvent/CONTAINER_FIRST)

(def *-container-last
  "Static Constant.

  The last number in the range of ids used for container events.

  type: int"
  ContainerEvent/CONTAINER_LAST)

(def *-component-added
  "Static Constant.

  This event indicates that a component was added to the container.

  type: int"
  ContainerEvent/COMPONENT_ADDED)

(def *-component-removed
  "Static Constant.

  This event indicates that a component was removed from the container.

  type: int"
  ContainerEvent/COMPONENT_REMOVED)

(defn get-container
  "Returns the originator of the event.

  returns: the Container object that originated
   the event, or null if the object is not a
   Container. - `java.awt.Container`"
  ([^java.awt.event.ContainerEvent this]
    (-> this (.getContainer))))

(defn get-child
  "Returns the component that was affected by the event.

  returns: the Component object that was added or removed - `java.awt.Component`"
  ([^java.awt.event.ContainerEvent this]
    (-> this (.getChild))))

(defn param-string
  "Returns a parameter string identifying this event.
   This method is useful for event-logging and for debugging.

  returns: a string identifying the event and its attributes - `java.lang.String`"
  ([^java.awt.event.ContainerEvent this]
    (-> this (.paramString))))

