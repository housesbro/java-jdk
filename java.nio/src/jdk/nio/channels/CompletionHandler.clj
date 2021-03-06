(ns jdk.nio.channels.CompletionHandler
  "A handler for consuming the result of an asynchronous I/O operation.

   The asynchronous channels defined in this package allow a completion
  handler to be specified to consume the result of an asynchronous operation.
  The completed method is invoked when the I/O operation
  completes successfully. The failed method is invoked if the
  I/O operations fails. The implementations of these methods should complete
  in a timely manner so as to avoid keeping the invoking thread from dispatching
  to other completion handlers."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.nio.channels CompletionHandler]))

(defn completed
  "Invoked when an operation has completed.

  result - The result of the I/O operation. - `V`
  attachment - The object attached to the I/O operation when it was initiated. - `A`"
  ([^CompletionHandler this result attachment]
    (-> this (.completed result attachment))))

(defn failed
  "Invoked when an operation fails.

  exc - The exception to indicate why the I/O operation failed - `java.lang.Throwable`
  attachment - The object attached to the I/O operation when it was initiated. - `A`"
  ([^CompletionHandler this ^java.lang.Throwable exc attachment]
    (-> this (.failed exc attachment))))

