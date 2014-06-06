(ns defschema-not-eager-compile-friendly.schemas
  (:require [schema.core :as s]
            [schema.macros :as sm]))

(sm/defschema WithDefSchema {s/Keyword s/Num})

(def WithDef {s/Keyword s/Num})
