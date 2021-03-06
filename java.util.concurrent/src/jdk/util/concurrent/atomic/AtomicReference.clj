(ns jdk.util.concurrent.atomic.AtomicReference
  "An object reference that may be updated atomically. See the java.util.concurrent.atomic package specification for description
  of the properties of atomic variables."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.util.concurrent.atomic AtomicReference]))

(defn ->atomic-reference
  "Constructor.

  Creates a new AtomicReference with the given initial value.

  initial-value - the initial value - `V`"
  (^AtomicReference [initial-value]
    (new AtomicReference initial-value))
  (^AtomicReference []
    (new AtomicReference )))

(defn get-and-set
  "Atomically sets to the given value and returns the old value.

  new-value - the new value - `V`

  returns: the previous value - `V`"
  ([^AtomicReference this new-value]
    (-> this (.getAndSet new-value))))

(defn update-and-get
  "Atomically updates the current value with the results of
   applying the given function, returning the updated value. The
   function should be side-effect-free, since it may be re-applied
   when attempted updates fail due to contention among threads.

  update-function - a side-effect-free function - `java.util.function.UnaryOperator`

  returns: the updated value - `V`"
  ([^AtomicReference this ^java.util.function.UnaryOperator update-function]
    (-> this (.updateAndGet update-function))))

(defn get-and-update
  "Atomically updates the current value with the results of
   applying the given function, returning the previous value. The
   function should be side-effect-free, since it may be re-applied
   when attempted updates fail due to contention among threads.

  update-function - a side-effect-free function - `java.util.function.UnaryOperator`

  returns: the previous value - `V`"
  ([^AtomicReference this ^java.util.function.UnaryOperator update-function]
    (-> this (.getAndUpdate update-function))))

(defn to-string
  "Returns the String representation of the current value.

  returns: the String representation of the current value - `java.lang.String`"
  (^java.lang.String [^AtomicReference this]
    (-> this (.toString))))

(defn accumulate-and-get
  "Atomically updates the current value with the results of
   applying the given function to the current and given values,
   returning the updated value. The function should be
   side-effect-free, since it may be re-applied when attempted
   updates fail due to contention among threads.  The function
   is applied with the current value as its first argument,
   and the given update as the second argument.

  x - the update value - `V`
  accumulator-function - a side-effect-free function of two arguments - `java.util.function.BinaryOperator`

  returns: the updated value - `V`"
  ([^AtomicReference this x ^java.util.function.BinaryOperator accumulator-function]
    (-> this (.accumulateAndGet x accumulator-function))))

(defn weak-compare-and-set
  "Atomically sets the value to the given updated value
   if the current value == the expected value.

   May fail
   spuriously and does not provide ordering guarantees, so is
   only rarely an appropriate alternative to compareAndSet.

  expect - the expected value - `V`
  update - the new value - `V`

  returns: true if successful - `boolean`"
  (^Boolean [^AtomicReference this expect update]
    (-> this (.weakCompareAndSet expect update))))

(defn lazy-set
  "Eventually sets to the given value.

  new-value - the new value - `V`"
  ([^AtomicReference this new-value]
    (-> this (.lazySet new-value))))

(defn set
  "Sets to the given value.

  new-value - the new value - `V`"
  ([^AtomicReference this new-value]
    (-> this (.set new-value))))

(defn get-and-accumulate
  "Atomically updates the current value with the results of
   applying the given function to the current and given values,
   returning the previous value. The function should be
   side-effect-free, since it may be re-applied when attempted
   updates fail due to contention among threads.  The function
   is applied with the current value as its first argument,
   and the given update as the second argument.

  x - the update value - `V`
  accumulator-function - a side-effect-free function of two arguments - `java.util.function.BinaryOperator`

  returns: the previous value - `V`"
  ([^AtomicReference this x ^java.util.function.BinaryOperator accumulator-function]
    (-> this (.getAndAccumulate x accumulator-function))))

(defn compare-and-set
  "Atomically sets the value to the given updated value
   if the current value == the expected value.

  expect - the expected value - `V`
  update - the new value - `V`

  returns: true if successful. False return indicates that
   the actual value was not equal to the expected value. - `boolean`"
  (^Boolean [^AtomicReference this expect update]
    (-> this (.compareAndSet expect update))))

(defn get
  "Gets the current value.

  returns: the current value - `V`"
  ([^AtomicReference this]
    (-> this (.get))))

