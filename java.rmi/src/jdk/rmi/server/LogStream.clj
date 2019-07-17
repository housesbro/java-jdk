(ns jdk.rmi.server.LogStream
  "Deprecated.
 no replacement"
  (:refer-clojure :only [require comment defn ->])
  (:import [java.rmi.server LogStream]))

(def *-silent
  "Static Constant.

  Deprecated.

  type: int"
  LogStream/SILENT)

(def *-brief
  "Static Constant.

  Deprecated.

  type: int"
  LogStream/BRIEF)

(def *-verbose
  "Static Constant.

  Deprecated.

  type: int"
  LogStream/VERBOSE)

(defn *log
  "Deprecated. no replacement

  name - name identifying the desired LogStream - `java.lang.String`

  returns: log associated with given name - `java.lang.   java.rmi.server.LogStream`"
  ([^java.lang.String name]
    (LogStream/log name)))

(defn *get-default-stream
  "Deprecated. no replacement

  returns: default log stream - `java.lang.   java.io.PrintStream`"
  ([]
    (LogStream/getDefaultStream )))

(defn *set-default-stream
  "Deprecated. no replacement

  new-default - new default log stream - `java.io.PrintStream`

  returns: `java.lang.   void`"
  ([^java.io.PrintStream new-default]
    (LogStream/setDefaultStream new-default)))

(defn *parse-level
  "Deprecated. no replacement

  s - name of logging level (e.g., 'SILENT', 'BRIEF', 'VERBOSE') - `java.lang.String`

  returns: corresponding integer log level - `java.lang.   int`"
  ([^java.lang.String s]
    (LogStream/parseLevel s)))

(defn get-output-stream
  "Deprecated. no replacement

  returns: output stream for this log - `java.lang.  java.io.OutputStream`"
  ([^java.rmi.server.LogStream this]
    (-> this (.getOutputStream))))

(defn set-output-stream
  "Deprecated. no replacement

  out - new output stream for this log - `java.io.OutputStream`

  returns: `java.lang.  void`"
  ([^java.rmi.server.LogStream this ^java.io.OutputStream out]
    (-> this (.setOutputStream out))))

(defn write
  "Deprecated. no replacement

  b - The byte to be written - `int`

  returns: `java.lang.  void`"
  ([^java.rmi.server.LogStream this ^Integer b]
    (-> this (.write b)))
  ([^java.rmi.server.LogStream this b ^Integer off ^Integer len]
    (-> this (.write b off len))))

(defn to-string
  "Deprecated. no replacement

  returns: log name - `java.lang.  java.lang.String`"
  ([^java.rmi.server.LogStream this]
    (-> this (.toString))))

