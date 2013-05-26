(ns hello-ring.core
  (:use ring.adapter.jetty)
  (:use ring.middleware.json)
  (:use ring.util.response))

(defn handler [request]
  (response {:foo "bar"}))

(def app
  (wrap-json-response handler {:keywords? true}))

(defn -main []
  (run-jetty app {:port 3000}))
