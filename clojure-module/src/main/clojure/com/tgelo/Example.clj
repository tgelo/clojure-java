(ns com.tgelo.Example
  (:gen-class
    :name com.tgelo.Example
    :methods [#^{:static true} [hello [String] String]]
    ))

(defn hello
  [x]
  (str "Hello " x))

(defn -hello
  [x]
  (hello x))



