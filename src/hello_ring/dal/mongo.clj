(ns hello-ring.dal.mongo
  (:require
    [monger.core :as mg]
    [monger.collection :as mgc])
  (:import [com.mongodb MongoOptions ServerAddress]))

(defn save [backlog]
  (mg/connect!)
  (mg/set-db! (mg/get-db "scrubo"))
  (println "try to insert document")
  (mgc/insert "backlog" backlog))

