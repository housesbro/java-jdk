(ns jdk.sql.SQLInvalidAuthorizationSpecException
  "The subclass of SQLException thrown when the SQLState class value
  is '28', or under vendor-specified conditions. This indicates that
  the authorization credentials presented during connection establishment
  are not valid.

  Please consult your driver vendor documentation for the vendor-specified
  conditions for which this Exception may be thrown."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.sql SQLInvalidAuthorizationSpecException]))

(defn ->sql-invalid-authorization-spec-exception
  "Constructor.

  Constructs a SQLInvalidAuthorizationSpecException object
   with a given
   reason, SQLState, vendorCode
   and  cause.

  reason - a description of the exception - `java.lang.String`
  sql-state - an XOPEN or SQL:2003 code identifying the exception - `java.lang.String`
  vendor-code - a database vendor-specific exception code - `int`
  cause - the underlying reason for this SQLException (which is saved for later retrieval by the getCause() method); may be null indicating the cause is non-existent or unknown. - `java.lang.Throwable`"
  (^SQLInvalidAuthorizationSpecException [^java.lang.String reason ^java.lang.String sql-state ^Integer vendor-code ^java.lang.Throwable cause]
    (new SQLInvalidAuthorizationSpecException reason sql-state vendor-code cause))
  (^SQLInvalidAuthorizationSpecException [^java.lang.String reason ^java.lang.String sql-state ^Integer vendor-code]
    (new SQLInvalidAuthorizationSpecException reason sql-state vendor-code))
  (^SQLInvalidAuthorizationSpecException [^java.lang.String reason ^java.lang.String sql-state]
    (new SQLInvalidAuthorizationSpecException reason sql-state))
  (^SQLInvalidAuthorizationSpecException [^java.lang.String reason]
    (new SQLInvalidAuthorizationSpecException reason))
  (^SQLInvalidAuthorizationSpecException []
    (new SQLInvalidAuthorizationSpecException )))

