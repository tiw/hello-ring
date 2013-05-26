(defproject hello-ring "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [ring/ring-json "0.2.0"]
                 [com.novemberain/monger "1.5.0"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler hello-ring.core/app}
  :main hello-ring.core)
