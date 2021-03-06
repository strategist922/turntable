(defproject turntable "0.1.0-SNAPSHOT"
  :description "A service for running SQL queries every n minutes."
  :url "https://github.com/flatland/turntable"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [cheshire "5.0.1"]
                 [ring-middleware-format "0.2.4"]
                 [overtone/at-at "1.1.1"]
                 [clj-time "0.4.4"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler flatland.turntable.server/handler})
