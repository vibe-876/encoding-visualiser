(defproject encoding-visualiser "0.1.0-SNAPSHOT"
  :description "Learning tool for R.L.E.."
  :url "https://github.com/vibe-876/encoding-visualiser"
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.htmlx"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [cljfx "1.9.5"]]
  :main ^:skip-aot encoding-visualiser.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
