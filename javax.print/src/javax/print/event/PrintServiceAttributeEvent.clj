(ns javax.print.event.PrintServiceAttributeEvent
  "Class PrintServiceAttributeEvent encapsulates an event a
  Print Service instance reports to let the client know of
  changes in the print service state."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.print.event PrintServiceAttributeEvent]))

(defn ->print-service-attribute-event
  "Constructor.

  Constructs a PrintServiceAttributeEvent object.

  source - the print job generating this event - `javax.print.PrintService`
  attributes - the attribute changes being reported - `javax.print.attribute.PrintServiceAttributeSet`

  throws: java.lang.IllegalArgumentException - if source is null."
  ([^javax.print.PrintService source ^javax.print.attribute.PrintServiceAttributeSet attributes]
    (new PrintServiceAttributeEvent source attributes)))

(defn get-print-service
  "Returns the print service.

  returns: Print Service object. - `javax.print.PrintService`"
  ([^javax.print.event.PrintServiceAttributeEvent this]
    (-> this (.getPrintService))))

(defn get-attributes
  "Determine the printing service attributes that changed and their new
   values.

  returns: Attributes containing the new values for the service
   attributes that changed. The returned set may be unmodifiable. - `javax.print.attribute.PrintServiceAttributeSet`"
  ([^javax.print.event.PrintServiceAttributeEvent this]
    (-> this (.getAttributes))))

