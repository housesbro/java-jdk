(ns javax.tools.DiagnosticListener
  "Interface for receiving diagnostics from tools."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.tools DiagnosticListener]))

(defn report
  "Invoked when a problem is found.

  diagnostic - a diagnostic representing the problem that was found - `javax.tools.Diagnostic`

  throws: java.lang.NullPointerException - if the diagnostic argument is null and the implementation cannot handle null arguments"
  ([^DiagnosticListener this ^javax.tools.Diagnostic diagnostic]
    (-> this (.report diagnostic))))

