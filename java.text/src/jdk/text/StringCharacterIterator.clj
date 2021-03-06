(ns jdk.text.StringCharacterIterator
  "StringCharacterIterator implements the
  CharacterIterator protocol for a String.
  The StringCharacterIterator class iterates over the
  entire String."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.text StringCharacterIterator]))

(defn ->string-character-iterator
  "Constructor.

  Constructs an iterator over the given range of the given string, with the
   index set at the specified position.

  text - The String to be iterated over - `java.lang.String`
  begin - Index of the first character - `int`
  end - Index of the character following the last character - `int`
  pos - Initial iterator position - `int`"
  (^StringCharacterIterator [^java.lang.String text ^Integer begin ^Integer end ^Integer pos]
    (new StringCharacterIterator text begin end pos))
  (^StringCharacterIterator [^java.lang.String text ^Integer pos]
    (new StringCharacterIterator text pos))
  (^StringCharacterIterator [^java.lang.String text]
    (new StringCharacterIterator text)))

(defn next
  "Implements CharacterIterator.next() for String.

  returns: the character at the new position or DONE if the new
   position is off the end of the text range. - `char`"
  (^Character [^StringCharacterIterator this]
    (-> this (.next))))

(defn set-text
  "Reset this iterator to point to a new string.  This package-visible
   method is used by other java.text classes that want to avoid allocating
   new StringCharacterIterator objects every time their setText method
   is called.

  text - The String to be iterated over - `java.lang.String`"
  ([^StringCharacterIterator this ^java.lang.String text]
    (-> this (.setText text))))

(defn get-index
  "Implements CharacterIterator.getIndex() for String.

  returns: the current index. - `int`"
  (^Integer [^StringCharacterIterator this]
    (-> this (.getIndex))))

(defn get-end-index
  "Implements CharacterIterator.getEndIndex() for String.

  returns: the index after the last character in the text - `int`"
  (^Integer [^StringCharacterIterator this]
    (-> this (.getEndIndex))))

(defn get-begin-index
  "Implements CharacterIterator.getBeginIndex() for String.

  returns: the index at which the text begins. - `int`"
  (^Integer [^StringCharacterIterator this]
    (-> this (.getBeginIndex))))

(defn previous
  "Implements CharacterIterator.previous() for String.

  returns: the character at the new position or DONE if the current
   position is equal to getBeginIndex(). - `char`"
  (^Character [^StringCharacterIterator this]
    (-> this (.previous))))

(defn current
  "Implements CharacterIterator.current() for String.

  returns: the character at the current position or DONE if the current
   position is off the end of the text. - `char`"
  (^Character [^StringCharacterIterator this]
    (-> this (.current))))

(defn set-index
  "Implements CharacterIterator.setIndex() for String.

  p - the position within the text. Valid values range from getBeginIndex() to getEndIndex(). An IllegalArgumentException is thrown if an invalid value is supplied. - `int`

  returns: the character at the specified position or DONE if the specified position is equal to getEndIndex() - `char`"
  (^Character [^StringCharacterIterator this ^Integer p]
    (-> this (.setIndex p))))

(defn last
  "Implements CharacterIterator.last() for String.

  returns: the last character in the text, or DONE if the text is empty - `char`"
  (^Character [^StringCharacterIterator this]
    (-> this (.last))))

(defn clone
  "Creates a copy of this iterator.

  returns: A copy of this - `java.lang.Object`"
  (^java.lang.Object [^StringCharacterIterator this]
    (-> this (.clone))))

(defn hash-code
  "Computes a hashcode for this iterator.

  returns: A hash code - `int`"
  (^Integer [^StringCharacterIterator this]
    (-> this (.hashCode))))

(defn equals
  "Compares the equality of two StringCharacterIterator objects.

  obj - the StringCharacterIterator object to be compared with. - `java.lang.Object`

  returns: true if the given obj is the same as this
   StringCharacterIterator object; false otherwise. - `boolean`"
  (^Boolean [^StringCharacterIterator this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn first
  "Implements CharacterIterator.first() for String.

  returns: the first character in the text, or DONE if the text is empty - `char`"
  (^Character [^StringCharacterIterator this]
    (-> this (.first))))

