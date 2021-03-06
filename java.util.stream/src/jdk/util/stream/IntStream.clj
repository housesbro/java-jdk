(ns jdk.util.stream.IntStream
  "A sequence of primitive int-valued elements supporting sequential and parallel
  aggregate operations.  This is the int primitive specialization of
  Stream.

  The following example illustrates an aggregate operation using
  Stream and IntStream, computing the sum of the weights of the
  red widgets:



      int sum = widgets.stream()
                       .filter(w -> w.getColor() == RED)
                       .mapToInt(w -> w.getWeight())
                       .sum();

  See the class documentation for Stream and the package documentation
  for java.util.stream for additional
  specification of streams, stream operations, stream pipelines, and
  parallelism."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.util.stream IntStream]))

(defn skip
  "Returns a stream consisting of the remaining elements of this stream
   after discarding the first n elements of the stream.
   If this stream contains fewer than n elements then an
   empty stream will be returned.

   This is a stateful
   intermediate operation.

  n - the number of leading elements to skip - `long`

  returns: the new stream - `java.util.stream.IntStream`

  throws: java.lang.IllegalArgumentException - if n is negative"
  (^java.util.stream.IntStream [^IntStream this ^Long n]
    (-> this (.skip n))))

(defn map
  "Returns a stream consisting of the results of applying the given
   function to the elements of this stream.

   This is an intermediate
   operation.

  mapper - a non-interfering, stateless function to apply to each element - `java.util.function.IntUnaryOperator`

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this ^java.util.function.IntUnaryOperator mapper]
    (-> this (.map mapper))))

(defn *range
  "Returns a sequential ordered IntStream from startInclusive
   (inclusive) to endExclusive (exclusive) by an incremental step of
   1.

  start-inclusive - the (inclusive) initial value - `int`
  end-exclusive - the exclusive upper bound - `int`

  returns: a sequential IntStream for the range of int
           elements - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^Integer start-inclusive ^Integer end-exclusive]
    (IntStream/range start-inclusive end-exclusive)))

(defn peek
  "Returns a stream consisting of the elements of this stream, additionally
   performing the provided action on each element as elements are consumed
   from the resulting stream.

   This is an intermediate
   operation.

   For parallel stream pipelines, the action may be called at
   whatever time and in whatever thread the element is made available by the
   upstream operation.  If the action modifies shared state,
   it is responsible for providing the required synchronization.

  action - a non-interfering action to perform on the elements as they are consumed from the stream - `java.util.function.IntConsumer`

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this ^java.util.function.IntConsumer action]
    (-> this (.peek action))))

(defn min
  "Returns an OptionalInt describing the minimum element of this
   stream, or an empty optional if this stream is empty.  This is a special
   case of a reduction
   and is equivalent to:


       return reduce(Integer::min);

   This is a terminal operation.

  returns: an OptionalInt containing the minimum element of this
   stream, or an empty OptionalInt if the stream is empty - `java.util.OptionalInt`"
  (^java.util.OptionalInt [^IntStream this]
    (-> this (.min))))

(defn spliterator
  "Description copied from interface: BaseStream

  returns: the element spliterator for this stream - `java.util.Spliterator$OfInt`"
  (^java.util.Spliterator$OfInt [^IntStream this]
    (-> this (.spliterator))))

(defn for-each
  "Performs an action for each element of this stream.

   This is a terminal
   operation.

   For parallel stream pipelines, this operation does not
   guarantee to respect the encounter order of the stream, as doing so
   would sacrifice the benefit of parallelism.  For any given element, the
   action may be performed at whatever time and in whatever thread the
   library chooses.  If the action accesses shared state, it is
   responsible for providing the required synchronization.

  action - a non-interfering action to perform on the elements - `java.util.function.IntConsumer`"
  ([^IntStream this ^java.util.function.IntConsumer action]
    (-> this (.forEach action))))

(defn for-each-ordered
  "Performs an action for each element of this stream, guaranteeing that
   each element is processed in encounter order for streams that have a
   defined encounter order.

   This is a terminal
   operation.

  action - a non-interfering action to perform on the elements - `java.util.function.IntConsumer`"
  ([^IntStream this ^java.util.function.IntConsumer action]
    (-> this (.forEachOrdered action))))

(defn *of
  "Returns a sequential IntStream containing a single element.

  t - the single element - `int`

  returns: a singleton sequential stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^Integer t]
    (IntStream/of t)))

(defn sequential
  "Description copied from interface: BaseStream

  returns: a sequential stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this]
    (-> this (.sequential))))

(defn find-first
  "Returns an OptionalInt describing the first element of this
   stream, or an empty OptionalInt if the stream is empty.  If the
   stream has no encounter order, then any element may be returned.

   This is a short-circuiting
   terminal operation.

  returns: an OptionalInt describing the first element of this stream,
   or an empty OptionalInt if the stream is empty - `java.util.OptionalInt`"
  (^java.util.OptionalInt [^IntStream this]
    (-> this (.findFirst))))

(defn average
  "Returns an OptionalDouble describing the arithmetic mean of elements of
   this stream, or an empty optional if this stream is empty.  This is a
   special case of a
   reduction.

   This is a terminal
   operation.

  returns: an OptionalDouble containing the average element of this
   stream, or an empty optional if the stream is empty - `java.util.OptionalDouble`"
  (^java.util.OptionalDouble [^IntStream this]
    (-> this (.average))))

(defn all-match
  "Returns whether all elements of this stream match the provided predicate.
   May not evaluate the predicate on all elements if not necessary for
   determining the result.  If the stream is empty then true is
   returned and the predicate is not evaluated.

   This is a short-circuiting
   terminal operation.

  predicate - a non-interfering, stateless predicate to apply to elements of this stream - `java.util.function.IntPredicate`

  returns: true if either all elements of the stream match the
   provided predicate or the stream is empty, otherwise false - `boolean`"
  (^Boolean [^IntStream this ^java.util.function.IntPredicate predicate]
    (-> this (.allMatch predicate))))

(defn parallel
  "Description copied from interface: BaseStream

  returns: a parallel stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this]
    (-> this (.parallel))))

(defn sum
  "Returns the sum of elements in this stream.  This is a special case
   of a reduction
   and is equivalent to:


       return reduce(0, Integer::sum);

   This is a terminal
   operation.

  returns: the sum of elements in this stream - `int`"
  (^Integer [^IntStream this]
    (-> this (.sum))))

(defn sorted
  "Returns a stream consisting of the elements of this stream in sorted
   order.

   This is a stateful
   intermediate operation.

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this]
    (-> this (.sorted))))

(defn map-to-long
  "Returns a LongStream consisting of the results of applying the
   given function to the elements of this stream.

   This is an intermediate
   operation.

  mapper - a non-interfering, stateless function to apply to each element - `java.util.function.IntToLongFunction`

  returns: the new stream - `java.util.stream.LongStream`"
  (^java.util.stream.LongStream [^IntStream this ^java.util.function.IntToLongFunction mapper]
    (-> this (.mapToLong mapper))))

(defn *iterate
  "Returns an infinite sequential ordered IntStream produced by iterative
   application of a function f to an initial element seed,
   producing a Stream consisting of seed, f(seed),
   f(f(seed)), etc.

   The first element (position 0) in the IntStream will be
   the provided seed.  For n > 0, the element at position
   n, will be the result of applying the function f to the
   element at position n - 1.

  seed - the initial element - `int`
  f - a function to be applied to to the previous element to produce a new element - `java.util.function.IntUnaryOperator`

  returns: A new sequential IntStream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^Integer seed ^java.util.function.IntUnaryOperator f]
    (IntStream/iterate seed f)))

(defn max
  "Returns an OptionalInt describing the maximum element of this
   stream, or an empty optional if this stream is empty.  This is a special
   case of a reduction
   and is equivalent to:


       return reduce(Integer::max);

   This is a terminal
   operation.

  returns: an OptionalInt containing the maximum element of this
   stream, or an empty OptionalInt if the stream is empty - `java.util.OptionalInt`"
  (^java.util.OptionalInt [^IntStream this]
    (-> this (.max))))

(defn *generate
  "Returns an infinite sequential unordered stream where each element is
   generated by the provided IntSupplier.  This is suitable for
   generating constant streams, streams of random elements, etc.

  s - the IntSupplier for generated elements - `java.util.function.IntSupplier`

  returns: a new infinite sequential unordered IntStream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^java.util.function.IntSupplier s]
    (IntStream/generate s)))

(defn *builder
  "Returns a builder for an IntStream.

  returns: a stream builder - `java.util.stream.IntStream$Builder`"
  (^java.util.stream.IntStream$Builder []
    (IntStream/builder )))

(defn count
  "Returns the count of elements in this stream.  This is a special case of
   a reduction and is
   equivalent to:


       return mapToLong(e -> 1L).sum();

   This is a terminal operation.

  returns: the count of elements in this stream - `long`"
  (^Long [^IntStream this]
    (-> this (.count))))

(defn map-to-double
  "Returns a DoubleStream consisting of the results of applying the
   given function to the elements of this stream.

   This is an intermediate
   operation.

  mapper - a non-interfering, stateless function to apply to each element - `java.util.function.IntToDoubleFunction`

  returns: the new stream - `java.util.stream.DoubleStream`"
  (^java.util.stream.DoubleStream [^IntStream this ^java.util.function.IntToDoubleFunction mapper]
    (-> this (.mapToDouble mapper))))

(defn iterator
  "Description copied from interface: BaseStream

  returns: the element iterator for this stream - `java.util.PrimitiveIterator$OfInt`"
  (^java.util.PrimitiveIterator$OfInt [^IntStream this]
    (-> this (.iterator))))

(defn distinct
  "Returns a stream consisting of the distinct elements of this stream.

   This is a stateful
   intermediate operation.

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this]
    (-> this (.distinct))))

(defn boxed
  "Returns a Stream consisting of the elements of this stream,
   each boxed to an Integer.

   This is an intermediate
   operation.

  returns: a Stream consistent of the elements of this stream,
   each boxed to an Integer - `java.util.stream.Stream<java.lang.Integer>`"
  (^java.util.stream.Stream [^IntStream this]
    (-> this (.boxed))))

(defn limit
  "Returns a stream consisting of the elements of this stream, truncated
   to be no longer than maxSize in length.

   This is a short-circuiting
   stateful intermediate operation.

  max-size - the number of elements the stream should be limited to - `long`

  returns: the new stream - `java.util.stream.IntStream`

  throws: java.lang.IllegalArgumentException - if maxSize is negative"
  (^java.util.stream.IntStream [^IntStream this ^Long max-size]
    (-> this (.limit max-size))))

(defn flat-map
  "Returns a stream consisting of the results of replacing each element of
   this stream with the contents of a mapped stream produced by applying
   the provided mapping function to each element.  Each mapped stream is
   closed after its contents
   have been placed into this stream.  (If a mapped stream is null
   an empty stream is used, instead.)

   This is an intermediate
   operation.

  mapper - a non-interfering, stateless function to apply to each element which produces an IntStream of new values - `java.util.function.IntFunction`

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this ^java.util.function.IntFunction mapper]
    (-> this (.flatMap mapper))))

(defn *concat
  "Creates a lazily concatenated stream whose elements are all the
   elements of the first stream followed by all the elements of the
   second stream.  The resulting stream is ordered if both
   of the input streams are ordered, and parallel if either of the input
   streams is parallel.  When the resulting stream is closed, the close
   handlers for both input streams are invoked.

  a - the first stream - `java.util.stream.IntStream`
  b - the second stream - `java.util.stream.IntStream`

  returns: the concatenation of the two input streams - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^java.util.stream.IntStream a ^java.util.stream.IntStream b]
    (IntStream/concat a b)))

(defn filter
  "Returns a stream consisting of the elements of this stream that match
   the given predicate.

   This is an intermediate
   operation.

  predicate - a non-interfering, stateless predicate to apply to each element to determine if it should be included - `java.util.function.IntPredicate`

  returns: the new stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^IntStream this ^java.util.function.IntPredicate predicate]
    (-> this (.filter predicate))))

(defn *empty
  "Returns an empty sequential IntStream.

  returns: an empty sequential stream - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream []
    (IntStream/empty )))

(defn map-to-obj
  "Returns an object-valued Stream consisting of the results of
   applying the given function to the elements of this stream.

   This is an
       intermediate operation.

  mapper - a non-interfering, stateless function to apply to each element - `java.util.function.IntFunction`

  returns: the new stream - `<U> java.util.stream.Stream<U>`"
  ([^IntStream this ^java.util.function.IntFunction mapper]
    (-> this (.mapToObj mapper))))

(defn find-any
  "Returns an OptionalInt describing some element of the stream, or
   an empty OptionalInt if the stream is empty.

   This is a short-circuiting
   terminal operation.

   The behavior of this operation is explicitly nondeterministic; it is
   free to select any element in the stream.  This is to allow for maximal
   performance in parallel operations; the cost is that multiple invocations
   on the same source may not return the same result.  (If a stable result
   is desired, use findFirst() instead.)

  returns: an OptionalInt describing some element of this stream, or
   an empty OptionalInt if the stream is empty - `java.util.OptionalInt`"
  (^java.util.OptionalInt [^IntStream this]
    (-> this (.findAny))))

(defn summary-statistics
  "Returns an IntSummaryStatistics describing various
   summary data about the elements of this stream.  This is a special
   case of a reduction.

   This is a terminal
   operation.

  returns: an IntSummaryStatistics describing various summary data
   about the elements of this stream - `java.util.IntSummaryStatistics`"
  (^java.util.IntSummaryStatistics [^IntStream this]
    (-> this (.summaryStatistics))))

(defn collect
  "Performs a mutable
   reduction operation on the elements of this stream.  A mutable
   reduction is one in which the reduced value is a mutable result container,
   such as an ArrayList, and elements are incorporated by updating
   the state of the result rather than by replacing the result.  This
   produces a result equivalent to:


       R result = supplier.get();
       for (int element : this stream)
           accumulator.accept(result, element);
       return result;

   Like reduce(int, IntBinaryOperator), collect operations
   can be parallelized without requiring additional synchronization.

   This is a terminal
   operation.

  supplier - a function that creates a new result container. For a parallel execution, this function may be called multiple times and must return a fresh value each time. - `java.util.function.Supplier`
  accumulator - an associative, non-interfering, stateless function for incorporating an additional element into a result - `java.util.function.ObjIntConsumer`
  combiner - an associative, non-interfering, stateless function for combining two values, which must be compatible with the accumulator function - `java.util.function.BiConsumer`

  returns: the result of the reduction - `<R> R`"
  ([^IntStream this ^java.util.function.Supplier supplier ^java.util.function.ObjIntConsumer accumulator ^java.util.function.BiConsumer combiner]
    (-> this (.collect supplier accumulator combiner))))

(defn any-match
  "Returns whether any elements of this stream match the provided
   predicate.  May not evaluate the predicate on all elements if not
   necessary for determining the result.  If the stream is empty then
   false is returned and the predicate is not evaluated.

   This is a short-circuiting
   terminal operation.

  predicate - a non-interfering, stateless predicate to apply to elements of this stream - `java.util.function.IntPredicate`

  returns: true if any elements of the stream match the provided
   predicate, otherwise false - `boolean`"
  (^Boolean [^IntStream this ^java.util.function.IntPredicate predicate]
    (-> this (.anyMatch predicate))))

(defn none-match
  "Returns whether no elements of this stream match the provided predicate.
   May not evaluate the predicate on all elements if not necessary for
   determining the result.  If the stream is empty then true is
   returned and the predicate is not evaluated.

   This is a short-circuiting
   terminal operation.

  predicate - a non-interfering, stateless predicate to apply to elements of this stream - `java.util.function.IntPredicate`

  returns: true if either no elements of the stream match the
   provided predicate or the stream is empty, otherwise false - `boolean`"
  (^Boolean [^IntStream this ^java.util.function.IntPredicate predicate]
    (-> this (.noneMatch predicate))))

(defn reduce
  "Performs a reduction on the
   elements of this stream, using the provided identity value and an
   associative
   accumulation function, and returns the reduced value.  This is equivalent
   to:


       int result = identity;
       for (int element : this stream)
           result = accumulator.applyAsInt(result, element)
       return result;

   but is not constrained to execute sequentially.

   The identity value must be an identity for the accumulator
   function. This means that for all x,
   accumulator.apply(identity, x) is equal to x.
   The accumulator function must be an
   associative function.

   This is a terminal
   operation.

  identity - the identity value for the accumulating function - `int`
  op - an associative, non-interfering, stateless function for combining two values - `java.util.function.IntBinaryOperator`

  returns: the result of the reduction - `int`"
  (^Integer [^IntStream this ^Integer identity ^java.util.function.IntBinaryOperator op]
    (-> this (.reduce identity op)))
  (^java.util.OptionalInt [^IntStream this ^java.util.function.IntBinaryOperator op]
    (-> this (.reduce op))))

(defn as-long-stream
  "Returns a LongStream consisting of the elements of this stream,
   converted to long.

   This is an intermediate
   operation.

  returns: a LongStream consisting of the elements of this stream,
   converted to long - `java.util.stream.LongStream`"
  (^java.util.stream.LongStream [^IntStream this]
    (-> this (.asLongStream))))

(defn to-array
  "Returns an array containing the elements of this stream.

   This is a terminal
   operation.

  returns: an array containing the elements of this stream - `int[]`"
  ([^IntStream this]
    (-> this (.toArray))))

(defn as-double-stream
  "Returns a DoubleStream consisting of the elements of this stream,
   converted to double.

   This is an intermediate
   operation.

  returns: a DoubleStream consisting of the elements of this stream,
   converted to double - `java.util.stream.DoubleStream`"
  (^java.util.stream.DoubleStream [^IntStream this]
    (-> this (.asDoubleStream))))

(defn *range-closed
  "Returns a sequential ordered IntStream from startInclusive
   (inclusive) to endInclusive (inclusive) by an incremental step of
   1.

  start-inclusive - the (inclusive) initial value - `int`
  end-inclusive - the inclusive upper bound - `int`

  returns: a sequential IntStream for the range of int
           elements - `java.util.stream.IntStream`"
  (^java.util.stream.IntStream [^Integer start-inclusive ^Integer end-inclusive]
    (IntStream/rangeClosed start-inclusive end-inclusive)))

