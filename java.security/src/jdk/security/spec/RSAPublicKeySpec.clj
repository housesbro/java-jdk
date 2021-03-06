(ns jdk.security.spec.RSAPublicKeySpec
  "This class specifies an RSA public key."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.security.spec RSAPublicKeySpec]))

(defn ->rsa-public-key-spec
  "Constructor.

  Creates a new RSAPublicKeySpec.

  modulus - the modulus - `java.math.BigInteger`
  public-exponent - the public exponent - `java.math.BigInteger`"
  (^RSAPublicKeySpec [^java.math.BigInteger modulus ^java.math.BigInteger public-exponent]
    (new RSAPublicKeySpec modulus public-exponent)))

(defn get-modulus
  "Returns the modulus.

  returns: the modulus - `java.math.BigInteger`"
  (^java.math.BigInteger [^RSAPublicKeySpec this]
    (-> this (.getModulus))))

(defn get-public-exponent
  "Returns the public exponent.

  returns: the public exponent - `java.math.BigInteger`"
  (^java.math.BigInteger [^RSAPublicKeySpec this]
    (-> this (.getPublicExponent))))

