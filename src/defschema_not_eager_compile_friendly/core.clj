(ns defschema-not-eager-compile-friendly.core
  (:require
   [defschema-not-eager-compile-friendly.schemas :as schemas]
   [plumbing.core :refer [fnk]]
   [plumbing.graph :as graph]))


(def graph-with-defschema
  {:foo (fnk [bar :- schemas/WithDefSchema])})

(def with-defschema (graph/eager-compile graph-with-defschema))


(def graph-with-def
  {:foo (fnk [bar :- schemas/WithDef])})

(def with-def (graph/eager-compile graph-with-def))

(println "Hello")
